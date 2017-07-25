package com.mfu.scholarships.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the rft_title_name database table.
 * 
 */
@Entity
@Table(name="rft_title_name")
@NamedQuery(name="RftTitleName.findAll", query="SELECT r FROM RftTitleName r")
public class RftTitleName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="title_code")
	private int titleCode;

	@Column(name="active_flag")
	private String activeFlag;

	@Column(name="create_datetime")
	private Timestamp createDatetime;

	@Column(name="create_user")
	private int createUser;

	private String gender;

	@Column(name="title_abbr")
	private String titleAbbr;

	@Column(name="title_name_e")
	private String titleNameE;

	@Column(name="title_name_t")
	private String titleNameT;

	@Column(name="update_datetime")
	private Timestamp updateDatetime;

	@Column(name="update_user")
	private int updateUser;

	public RftTitleName() {
	}

	public int getTitleCode() {
		return this.titleCode;
	}

	public void setTitleCode(int titleCode) {
		this.titleCode = titleCode;
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

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTitleAbbr() {
		return this.titleAbbr;
	}

	public void setTitleAbbr(String titleAbbr) {
		this.titleAbbr = titleAbbr;
	}

	public String getTitleNameE() {
		return this.titleNameE;
	}

	public void setTitleNameE(String titleNameE) {
		this.titleNameE = titleNameE;
	}

	public String getTitleNameT() {
		return this.titleNameT;
	}

	public void setTitleNameT(String titleNameT) {
		this.titleNameT = titleNameT;
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