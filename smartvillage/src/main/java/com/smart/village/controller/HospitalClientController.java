package com.smart.village.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smart.village.model.HospitlInformation;
import com.smart.village.repository.HospitalInfoRepo;


@Controller
public class HospitalClientController {
	

	@Autowired
	HospitalInfoRepo hospitalInfoRepo;

	@RequestMapping("/hospitalInfo/{cid}")
	public String hospitalInfo(@PathVariable("cid") String cid, Model m) 
	{
		
		List<HospitlInformation> hospitalInfo = this.hospitalInfoRepo.findHospitlInformationById(cid);				
			
		m.addAttribute("hospitalInfo", hospitalInfo);
		
		return "hospitalUserView/hospitalList";
		
	}
	
}
