package com.smart.village.repository;



import com.smart.village.model.AdminInformation;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;





public interface AdminInformationRepo extends JpaRepository<AdminInformation,String>{
	
	List<AdminInformation> findByemail(String email);
	List<AdminInformation> findByName(String name);
	List<AdminInformation> findByissocode(String issocode);

}
