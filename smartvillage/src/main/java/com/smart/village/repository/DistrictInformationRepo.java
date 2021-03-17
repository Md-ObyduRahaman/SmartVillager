package com.smart.village.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smart.village.model.DistrictInformation;

public interface DistrictInformationRepo extends JpaRepository<DistrictInformation,String> {
	
	List<DistrictInformation> findByisoCode(String isoCode);
	List<DistrictInformation> findByName(String name);
	List<DistrictInformation> findBydivision(String division);

}
