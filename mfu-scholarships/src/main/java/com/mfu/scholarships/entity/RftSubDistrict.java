package com.mfu.scholarships.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the rft_sub_district database table.
 * 
 */
@Entity
@Table(name="rft_sub_district")
@NamedQuery(name="RftSubDistrict.findAll", query="SELECT r FROM RftSubDistrict r")
public class RftSubDistrict implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sub_district_code")
	private int subDistrictCode;

	@Column(name="active_flag")
	private String activeFlag;

	@Column(name="create_datetime")
	private Timestamp createDatetime;

	@Column(name="create_user")
	private int createUser;

	@Column(name="district_code")
	private int districtCode;

	private String postcode;

	@Column(name="province_code")
	private int provinceCode;

	@Column(name="sub_district_name_e")
	private String subDistrictNameE;

	@Column(name="sub_district_name_t")
	private String subDistrictNameT;

	@Column(name="update_datetime")
	private Timestamp updateDatetime;

	@Column(name="update_user")
	private int updateUser;

	public RftSubDistrict() {
	}

	public int getSubDistrictCode() {
		return this.subDistrictCode;
	}

	public void setSubDistrictCode(int subDistrictCode) {
		this.subDistrictCode = subDistrictCode;
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

	public int getDistrictCode() {
		return this.districtCode;
	}

	public void setDistrictCode(int districtCode) {
		this.districtCode = districtCode;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public int getProvinceCode() {
		return this.provinceCode;
	}

	public void setProvinceCode(int provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getSubDistrictNameE() {
		return this.subDistrictNameE;
	}

	public void setSubDistrictNameE(String subDistrictNameE) {
		this.subDistrictNameE = subDistrictNameE;
	}

	public String getSubDistrictNameT() {
		return this.subDistrictNameT;
	}

	public void setSubDistrictNameT(String subDistrictNameT) {
		this.subDistrictNameT = subDistrictNameT;
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