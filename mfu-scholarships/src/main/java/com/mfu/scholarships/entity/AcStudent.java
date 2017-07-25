package com.mfu.scholarships.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the ac_student database table.
 * 
 */
@Entity
@Table(name="ac_student")
@NamedQuery(name="AcStudent.findAll", query="SELECT a FROM AcStudent a")
public class AcStudent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="student_ref")
	private int studentRef;

	@Temporal(TemporalType.DATE)
	@Column(name="birth_date")
	private Date birthDate;

	@Column(name="create_datetime")
	private Timestamp createDatetime;

	@Column(name="create_user")
	private int createUser;

	@Column(name="education_level")
	private String educationLevel;

	private String email;

	@Column(name="first_name_e")
	private String firstNameE;

	@Column(name="first_name_t")
	private String firstNameT;

	private String gender;

	@Column(name="last_name_e")
	private String lastNameE;

	@Column(name="last_name_t")
	private String lastNameT;

	@Column(name="major_ref")
	private int majorRef;

	private String nationality;

	@Column(name="personal_id")
	private String personalId;

	@Column(name="phone_no")
	private String phoneNo;

	//@Lob เป็นการเก็บข้อมูลเป็น Large Object Binary
	@Lob
	@Column(name="profile_image")
	private byte[] profileImage;

	@Column(name="profile_name")
	private String profileName;

	@Column(name="profile_type")
	private String profileType;

	private String race;

	private String religion;

	@Column(name="school_ref")
	private int schoolRef;

	@Column(name="student_id")
	private String studentId;

	@Column(name="title_code")
	private int titleCode;

	@Column(name="update_datetime")
	private Timestamp updateDatetime;

	@Column(name="update_user")
	private int updateUser;

	public AcStudent() {
	}

	public int getStudentRef() {
		return this.studentRef;
	}

	public void setStudentRef(int studentRef) {
		this.studentRef = studentRef;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
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

	public String getEducationLevel() {
		return this.educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstNameE() {
		return this.firstNameE;
	}

	public void setFirstNameE(String firstNameE) {
		this.firstNameE = firstNameE;
	}

	public String getFirstNameT() {
		return this.firstNameT;
	}

	public void setFirstNameT(String firstNameT) {
		this.firstNameT = firstNameT;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastNameE() {
		return this.lastNameE;
	}

	public void setLastNameE(String lastNameE) {
		this.lastNameE = lastNameE;
	}

	public String getLastNameT() {
		return this.lastNameT;
	}

	public void setLastNameT(String lastNameT) {
		this.lastNameT = lastNameT;
	}

	public int getMajorRef() {
		return this.majorRef;
	}

	public void setMajorRef(int majorRef) {
		this.majorRef = majorRef;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPersonalId() {
		return this.personalId;
	}

	public void setPersonalId(String personalId) {
		this.personalId = personalId;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
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

	public String getRace() {
		return this.race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getReligion() {
		return this.religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public int getSchoolRef() {
		return this.schoolRef;
	}

	public void setSchoolRef(int schoolRef) {
		this.schoolRef = schoolRef;
	}

	public String getStudentId() {
		return this.studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public int getTitleCode() {
		return this.titleCode;
	}

	public void setTitleCode(int titleCode) {
		this.titleCode = titleCode;
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