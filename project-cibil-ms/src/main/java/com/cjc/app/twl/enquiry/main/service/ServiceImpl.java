package com.cjc.app.twl.enquiry.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.twl.enquiry.main.Dao.CibilRepo;
import com.cjc.app.twl.enquiry.main.model.CibilScore;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	private CibilRepo repo;
	
	@Override
	public void saveEnquiry(int score, String pan) {
		
		CibilScore cb=new CibilScore();
		
		cb.setCustomerPanNo(pan);
		cb.setScore(score);
		
		if(score >=700)
		{
			cb.setCibilStatus("good");
			cb.setRemark("approve");
		}
	
		else {
			cb.setCibilStatus("poor");
			cb.setRemark("reject");
		}
		
		repo.save(cb);
		
	}

}
