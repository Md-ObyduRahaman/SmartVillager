package com.smart.village.controller;

import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smart.village.model.HospitlInformation;
import com.smart.village.model.User;
import com.smart.village.repository.HospitalInfoRepo;
import com.smart.village.repository.UserRepo;

@Controller
@RequestMapping("/admin")
public class HospitalController {
	
	@Autowired
	UserRepo userRepo;
	@Autowired
	HospitalInfoRepo hospitalInfoRepo;
	
	HospitlInformation  hospitlInformation;

	
	@GetMapping("/hospital")
	public String hospital(Model model,Principal principal)
	 {
		 String name = principal.getName();
			User user = this.userRepo.getUserByUserName(name);	
			model.addAttribute("user", user);
		 
		return "hospitalForm";
	}

	@PostMapping("/savehospitalInformation")
	public String savehospitalInformation(@ModelAttribute HospitlInformation hospitlInformation,
			Principal principal,Model model) {
		 String name = principal.getName();
			User user = this.userRepo.getUserByUserName(name);	
			model.addAttribute("user", user);
			
			user.getHospitlInformations().add(hospitlInformation);

			hospitlInformation.setUser(user);

			this.userRepo.save(user);			
			
		return "redirect:/admin/show_hospitalInfo/0";	
	}
	@GetMapping("/show_hospitalInfo/{page}")
	public String showHospital(@PathVariable("page") Integer page, Model model,Principal principal)
		 {
			 String name = principal.getName();
				User user = this.userRepo.getUserByUserName(name);	
				model.addAttribute("user", user);
				
				Pageable pageable = PageRequest.of(page, 8);
				Page<HospitlInformation> hospitalInfo = this.hospitalInfoRepo.findHospitlInformationByUser(user.getIssocode(), pageable);				
				model.addAttribute("hospitalInfo", hospitalInfo);
				model.addAttribute("currentPage", page);
				model.addAttribute("totalPages", hospitalInfo.getTotalPages());

			 
			return "show_hospitalInfo";
	}
}
