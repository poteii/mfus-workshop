package com.mfu.scholarships.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sm_sponsors database table.
 * 
 */
@Entity
@Table(name="sm_sponsors")
@NamedQuery(name="SmSponsor.findAll", query="SELECT s FROM SmSponsor s")
public class SmSponsor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sponsors_id")
	private String sponsorsId;

	@Column(name="active_flag")
	private String activeFlag;

	private String address;

	private String contact;

	@Column(name="create_datetime")
	private Timestamp createDatetime;

	@Column(name="create_user")
	private String createUser;

	private String district;

	private String email;

	@Column(name="phone_no")
	private String phoneNo;

	private String postcode;

	@Lob
	@Column(name="profile_image")
	private byte[] profileImage;

	@Column(name="profile_name")
	private String profileName;

	@Column(name="profile_type")
	private String profileType;

	private String province;

	@Column(name="sponsors_name")
	private String sponsorsName;

	@Column(name="sub_district")
	private String subDistrict;

	@Column(name="update_datetime")
	private Timestamp updateDatetime;

	@Column(name="update_user")
	private String updateUser;

	private String website;

	public SmSponsor() {
	}

	public String getSponsorsId() {
		return this.sponsorsId;
	}

	public void setSponsorsId(String sponsorsId) {
		this.sponsorsId = sponsorsId;
	}

	public String getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Timestamp getCreateDatetime() {
		return this.createDatetime;
	}

	public void setCreateDatetime(Timestamp createDatetime) {
		this.createDatetime = createDatetime;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public byte[] getProfileImage() {
		return this.profileImage;
	}

	public void setProfileImage(byte[] profileImage) {
		this.profileImage = profileImage;
	}

	public String getProfileName() {
		return this.profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

	public String getProfileType() {
		return this.profileType;
	}

	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getSponsorsName() {
		return this.sponsorsName;
	}

	public void setSponsorsName(String sponsorsName) {
		this.sponsorsName = sponsorsName;
	}

	public String getSubDistrict() {
		return this.subDistrict;
	}

	public void setSubDistrict(String subDistrict) {
		this.subDistrict = subDistrict;
	}

	public Timestamp getUpdateDatetime() {
		return this.updateDatetime;
	}

	public void setUpdateDatetime(Timestamp updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

}