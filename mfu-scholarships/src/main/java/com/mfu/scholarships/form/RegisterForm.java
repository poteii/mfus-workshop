package com.mfu.scholarships.form;

import java.io.Serializable;

import com.mfu.scholarships.entity.AcStudent;
import com.mfu.scholarships.entity.AcUser;
import com.mfu.scholarships.entity.RftMajor;
import com.mfu.scholarships.entity.RftSchool;

public class RegisterForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// for insert/search/update/delete
	private AcUser acUser;
	private AcStudent acStudent;

	// for search, show in datatable
	private RftSchool rftSchool;
	private RftMajor rftMajor;
	
	
	public AcUser getAcUser() {
		return acUser;
	}
	public void setAcUser(AcUser acUser) {
		this.acUser = acUser;
	}
	public AcStudent getAcStudent() {
		return acStudent;
	}
	public void setAcStudent(AcStudent acStudent) {
		this.acStudent = acStudent;
	}
	public RftSchool getRftSchool() {
		return rftSchool;
	}
	public void setRftSchool(RftSchool rftSchool) {
		this.rftSchool = rftSchool;
	}
	public RftMajor getRftMajor() {
		return rftMajor;
	}
	public void setRftMajor(RftMajor rftMajor) {
		this.rftMajor = rftMajor;
	}
	
	
	
	

}
