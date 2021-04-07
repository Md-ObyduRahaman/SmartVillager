package com.smart.village.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.village.model.HospitlInformation;

public interface HospitalInfoRepo extends JpaRepository<HospitlInformation,Integer>  {

}
