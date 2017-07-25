package com.mfu.scholarships.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the rft_district database table.
 * 
 */
@Entity
@Table(name="rft_district")
@NamedQuery(name="RftDistrict.findAll", query="SELECT r FROM RftDistrict r")
public class RftDistrict implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="district_code")
	private int districtCode;

	@Column(name="active_flag")
	private String activeFlag;

	@Column(name="create_datetime")
	private Timestamp createDatetime;

	@Column(name="create_user")
	private int createUser;

	@Column(name="district_name_e")
	private String districtNameE;

	@Column(name="district_name_t")
	private String districtNameT;

	@Column(name="province_code")
	private int provinceCode;

	@Column(name="update_datetime")
	private Timestamp updateDatetime;

	@Column(name="update_user")
	private int updateUser;

	public RftDistrict() {
	}

	public int getDistrictCode() {
		return this.districtCode;
	}

	public void setDistrictCode(int districtCode) {
		this.districtCode = districtCode;
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

	public String getDistrictNameE() {
		return this.districtNameE;
	}

	public void setDistrictNameE(String districtNameE) {
		this.districtNameE = districtNameE;
	}

	public String getDistrictNameT() {
		return this.districtNameT;
	}

	public void setDistrictNameT(String districtNameT) {
		this.districtNameT = districtNameT;
	}

	public int getProvinceCode() {
		return this.provinceCode;
	}

	public void setProvinceCode(int provinceCode) {
		this.provinceCode = provinceCode;
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