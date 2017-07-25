package com.mfu.scholarships.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the rft_major database table.
 * 
 */
@Entity
@Table(name="rft_major")
@NamedQuery(name="RftMajor.findAll", query="SELECT r FROM RftMajor r")
public class RftMajor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="major_code")
	private int majorCode;

	@Column(name="active_flag")
	private String activeFlag;

	@Column(name="create_datetime")
	private Timestamp createDatetime;

	@Column(name="create_user")
	private int createUser;

	@Column(name="major_name_e")
	private String majorNameE;

	@Column(name="major_name_t")
	private String majorNameT;

	@Column(name="school_code")
	private int schoolCode;

	@Column(name="update_datetime")
	private Timestamp updateDatetime;

	@Column(name="update_user")
	private int updateUser;

	public RftMajor() {
	}

	public int getMajorCode() {
		return this.majorCode;
	}

	public void setMajorCode(int majorCode) {
		this.majorCode = majorCode;
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

	public String getMajorNameE() {
		return this.majorNameE;
	}

	public void setMajorNameE(String majorNameE) {
		this.majorNameE = majorNameE;
	}

	public String getMajorNameT() {
		return this.majorNameT;
	}

	public void setMajorNameT(String majorNameT) {
		this.majorNameT = majorNameT;
	}

	public int getSchoolCode() {
		return this.schoolCode;
	}

	public void setSchoolCode(int schoolCode) {
		this.schoolCode = schoolCode;
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