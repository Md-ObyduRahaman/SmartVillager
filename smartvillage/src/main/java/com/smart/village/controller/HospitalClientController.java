package com.smart.village.controller;


import org.springframework.beans.factory.annotation.Autowired;
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
	public String hospitalInfo(@PathVariable("cid") Integer cid, Model m) 
	{
		
		
		
		HospitlInformation hospitlInformation = this.hospitalInfoRepo.findById(cid).get();
		System.out.println("fffffffffffffffffffff");
		return "hospitalUserView/hospitalList";
		
	}
	
}
