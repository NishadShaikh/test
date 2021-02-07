package com.cjc.app.twl.enquiry.main.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CibilScore {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cibilId;
	
	private String customerPanNo;
	
	private int score;
	
	private String cibilStatus;
	
	private String remark;

	public int getCibilId() {
		return cibilId;
	}

	public void setCibilId(int cibilId) {
		this.cibilId = cibilId;
	}

	public String getCustomerPanNo() {
		return customerPanNo;
	}

	public void setCustomerPanNo(String customerPanNo) {
		this.customerPanNo = customerPanNo;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getCibilStatus() {
		return cibilStatus;
	}

	public void setCibilStatus(String cibilStatus) {
		this.cibilStatus = cibilStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "CibilScore [cibilId=" + cibilId + ", customerPanNo=" + customerPanNo + ", score=" + score
				+ ", cibilStatus=" + cibilStatus + ", remark=" + remark + "]";
	}
	
	

}
