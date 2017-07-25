package com.mfu.scholarships.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the rft_school database table.
 * 
 */
@Entity
@Table(name="rft_school")
@NamedQuery(name="RftSchool.findAll", query="SELECT r FROM RftSchool r")
public class RftSchool implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="school_code")
	private int schoolCode;

	@Column(name="active_flag")
	private String activeFlag;

	@Column(name="create_datetime")
	private Timestamp createDatetime;

	@Column(name="create_user")
	private int createUser;

	@Column(name="school_name_e")
	private String schoolNameE;

	@Column(name="school_name_t")
	private String schoolNameT;

	@Column(name="update_datetime")
	private Timestamp updateDatetime;

	@Column(name="update_user")
	private int updateUser;

	public RftSchool() {
	}

	public int getSchoolCode() {
		return this.schoolCode;
	}

	public void setSchoolCode(int schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Timestamp getCreateDatetime() {
		return this.createDatetime;
	}

	public void setCreateDatetime(Timestamp createDatetime) {
		this.createDatetime = createDatetime;
	}

	public int getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(int createUser) {
		this.createUser = createUser;
	}

	public String getSchoolNameE() {
		return this.schoolNameE;
	}

	public void setSchoolNameE(String schoolNameE) {
		this.schoolNameE = schoolNameE;
	}

	public String getSchoolNameT() {
		return this.schoolNameT;
	}

	public void setSchoolNameT(String schoolNameT) {
		this.schoolNameT = schoolNameT;
	}

	public Timestamp getUpdateDatetime() {
		return this.updateDatetime;
	}

	public void setUpdateDatetime(Timestamp updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public int getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(int updateUser) {
		this.updateUser = updateUser;
	}

}