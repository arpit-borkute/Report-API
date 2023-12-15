package com.growder.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.growder.entity.EligibilityDetails;
import com.growder.repository.EligibilityDetailsRepo;

@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	private EligibilityDetailsRepo repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		EligibilityDetails entity1 = new EligibilityDetails();
		entity1.setEligId(1);
		entity1.setName("arpit");
		entity1.setMobile(9960899946l);
		entity1.setEmail("arpitb554@gmail.com");
		entity1.setGender('M');
		entity1.setSsn(5564555454l);
		entity1.setPlanName("SNAP");
		entity1.setPlanStatus("Approved");
		repo.save(entity1);

		EligibilityDetails entity2 = new EligibilityDetails();
		entity2.setEligId(2);
		entity2.setName("kabir");
		entity2.setMobile(8999499606l);
		entity2.setEmail("kabir.gher@gmail.com");
		entity2.setGender('M');
		entity2.setSsn(5589886654l);
		entity2.setPlanName("CCAP");
		entity2.setPlanStatus("Denied");
		repo.save(entity2);

		EligibilityDetails entity3 = new EligibilityDetails();
		entity3.setEligId(3);
		entity3.setName("kartik");
		entity3.setMobile(4996068999l);
		entity3.setEmail("kartik.rokade@gmail.com");
		entity3.setGender('M');
		entity3.setSsn(9878886654l);
		entity3.setPlanName("Medicaid");
		entity3.setPlanStatus("Closed");
		repo.save(entity3);
	}

}
