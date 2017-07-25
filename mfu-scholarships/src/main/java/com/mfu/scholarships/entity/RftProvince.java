package com.mfu.scholarships.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the rft_province database table.
 * 
 */
@Entity
@Table(name="rft_province")
@NamedQuery(name="RftProvince.findAll", query="SELECT r FROM RftProvince r")
public class RftProvince implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="province_code")
	private int provinceCode;

	@Column(name="active_flag")
	private String activeFlag;

	@Column(name="create_datetime")
	private Timestamp createDatetime;

	@Column(name="create_user")
	private int createUser;

	@Column(name="province_name_e")
	private String provinceNameE;

	@Column(name="province_name_t")
	private String provinceNameT;

	@Column(name="update_datetime")
	private Timestamp updateDatetime;

	@Column(name="update_user")
	private int updateUser;

	public RftProvince() {
	}

	public int getProvinceCode() {
		return this.provinceCode;
	}

	public void setProvinceCode(int provinceCode) {
		this.provinceCode = provinceCode;
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

	public String getProvinceNameE() {
		return this.provinceNameE;
	}

	public void setProvinceNameE(String provinceNameE) {
		this.provinceNameE = provinceNameE;
	}

	public String getProvinceNameT() {
		return this.provinceNameT;
	}

	public void setProvinceNameT(String provinceNameT) {
		this.provinceNameT = provinceNameT;
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