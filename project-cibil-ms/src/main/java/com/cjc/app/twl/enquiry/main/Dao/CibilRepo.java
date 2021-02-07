package com.cjc.app.twl.enquiry.main.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.app.twl.enquiry.main.model.CibilScore;

@Repository
public interface CibilRepo extends JpaRepository<CibilScore, Integer> {

}
