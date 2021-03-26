package com.smart.village.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.Principal;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.smart.village.model.AdminInformation;
import com.smart.village.model.DistrictInformation;
import com.smart.village.repository.AdminInformationRepo;
import com.smart.village.repository.DistrictInformationRepo;

@Controller
public class AdminController {
	
	@Autowired
	DistrictInformationRepo districtInformationRepo;
	@Autowired
	AdminInformationRepo adminInformationRepo;
	
	AdminInformation adminInformation;

	@GetMapping("/admin")
	public String admin(Model model)
	
	{
		DistrictInformation dInformation=new DistrictInformation();
		model.addAttribute("dInformation",dInformation);
		return "dashboard";
	}
	
	@PostMapping("/districtInfSave")
	public String districtOfMymensingh(@ModelAttribute("dInformation") DistrictInformation dInformation)
	{
		System.out.println("ok........."+dInformation.toString());
		districtInformationRepo.save(dInformation);
        return "redirect:/admin";
	}
	 @GetMapping("/head")
	    public String headOfice(Authentication authentication) {	        
	        return "registration";
	    }
	 @GetMapping("/trail")
	 public String trail()
	 {
		 return "registration";
	 }
	 
	 @PostMapping("/saveAdmin")
	 public String saveAdmin(@ModelAttribute AdminInformation adminInformation,@RequestParam("profileImage") MultipartFile file,
				Principal principal, HttpSession session)
	 {
		 adminInformation.setRole("ADMIN");

			try {

				

				// processing and uploading file..

				if (file.isEmpty()) {
					// if the file is empty then try our message
					System.out.println("File is empty");
					adminInformation.setImageUrl("contact.png");

				} else {
					// file the file to folder and update the name to contact
					adminInformation.setImageUrl(file.getOriginalFilename());

					File saveFile = new ClassPathResource("static/img").getFile();

					Path path = Paths.get(saveFile.getAbsolutePath() + File.separator + file.getOriginalFilename());

					Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);

					System.out.println("Image is uploaded");

				}
				
				adminInformationRepo.save(adminInformation);
				

			
			} catch (Exception e) {
				System.out.println("ERROR " + e.getMessage());
				e.printStackTrace();
				// message error
				//session.setAttribute("message", new Message("Some went wrong !! Try again..", "danger"));

			}
		 
		 return "registration";
	 }
}
