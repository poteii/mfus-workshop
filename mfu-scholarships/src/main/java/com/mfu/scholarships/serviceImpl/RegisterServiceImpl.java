package com.mfu.scholarships.serviceImpl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mfu.scholarships.entity.AcStudent;
import com.mfu.scholarships.entity.AcUser;
import com.mfu.scholarships.entity.RftMajor;
import com.mfu.scholarships.entity.RftSchool;
import com.mfu.scholarships.form.RegisterForm;
import com.mfu.scholarships.query.AcStudentQuery;
import com.mfu.scholarships.query.AcUserQuery;
import com.mfu.scholarships.service.RegisterService;

@Service
@Repository
@Transactional
public class RegisterServiceImpl implements RegisterService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	EntityManager em;

	@Override
	public void createUser(RegisterForm registerForm) {
		int studentRef;
		try {
			studentRef = createStudent(registerForm);
			createAcUser(registerForm, studentRef);

		} finally {

		}

	}

	private int createStudent(RegisterForm registerForm) {
		AcStudent acStudent;
		int studentRef;
		try {
			acStudent = new AcStudent();
			studentRef = AcStudentQuery.genMaxStudentRef(em);
			acStudent.setStudentRef(studentRef);
			acStudent.setEducationLevel(registerForm.getAcStudent().getEducationLevel());
			acStudent.setPersonalId(registerForm.getAcStudent().getPersonalId());
			acStudent.setStudentId(registerForm.getAcStudent().getStudentId());
			acStudent.setGender(registerForm.getAcStudent().getGender());
			acStudent.setBirthDate(registerForm.getAcStudent().getBirthDate());
			acStudent.setTitleCode(registerForm.getAcStudent().getTitleCode());
			acStudent.setFirstNameT(registerForm.getAcStudent().getFirstNameT());
			acStudent.setLastNameT(registerForm.getAcStudent().getLastNameT());
			acStudent.setFirstNameE(registerForm.getAcStudent().getFirstNameE());
			acStudent.setLastNameE(registerForm.getAcStudent().getLastNameE());
			acStudent.setSchoolRef(registerForm.getAcStudent().getSchoolRef());
			acStudent.setMajorRef(registerForm.getAcStudent().getMajorRef());
			acStudent.setNationality(registerForm.getAcStudent().getNationality());
			acStudent.setRace(registerForm.getAcStudent().getRace());
			acStudent.setReligion(registerForm.getAcStudent().getReligion());
			acStudent.setPhoneNo(registerForm.getAcStudent().getPhoneNo());
			acStudent.setEmail(registerForm.getAcStudent().getEmail());

			acStudent.setProfileName(registerForm.getAcStudent().getProfileName());
			acStudent.setProfileType(registerForm.getAcStudent().getProfileType());
			acStudent.setProfileImage(registerForm.getAcStudent().getProfileImage());

			acStudent.setCreateUser(studentRef);
			acStudent.setUpdateUser(studentRef);
			acStudent.setCreateDatetime(new Timestamp(System.currentTimeMillis()));
			acStudent.setUpdateDatetime(new Timestamp(System.currentTimeMillis()));

			em.persist(acStudent);
			return studentRef;
		} finally {

		}

	}

	private void createAcUser(RegisterForm registerForm, int studentRef) {
		AcUser acUser;
		int userRef;
		try {
			acUser = new AcUser();
			userRef = AcUserQuery.genMaxUserRef(em);
			acUser.setUserRef(userRef);
			acUser.setUserId(registerForm.getAcStudent().getPersonalId());
			acUser.setPassword(registerForm.getAcStudent().getPersonalId());
			acUser.setUserRole("1");
			acUser.setStudentRef(studentRef);

			acUser.setCreateUser(userRef);
			acUser.setUpdateUser(userRef);
			acUser.setCreateDatetime(new Timestamp(System.currentTimeMillis()));
			acUser.setUpdateDatetime(new Timestamp(System.currentTimeMillis()));

			em.persist(acUser);
		} finally {

		}
	}

	@Override
	public List<RegisterForm> doSearch(RegisterForm registerForm) {
		List<RegisterForm> registerFormList = new ArrayList<RegisterForm>();
		List<Object> objectList = new ArrayList<Object>();
		RegisterForm form;
		AcStudent acStudent;
		RftSchool rftSchool;
		RftMajor rftMajor;
		try {

			objectList = AcStudentQuery.searchStudent(registerForm, em);
			for (Object obj : objectList) {
				form = new RegisterForm();
				acStudent = new AcStudent();
				rftSchool = new RftSchool();
				rftMajor = new RftMajor();

				acStudent = em.find(AcStudent.class, obj);
				form.setAcStudent(new AcStudent());
				form.setAcStudent(acStudent);

				if (acStudent.getSchoolRef() != 0) {
					rftSchool = em.find(RftSchool.class, acStudent.getSchoolRef());
				}

				if (acStudent.getMajorRef() != 0) {
					rftMajor = em.find(RftMajor.class, acStudent.getMajorRef());
				}

				form.setRftSchool(new RftSchool());
				form.setRftSchool(rftSchool);

				form.setRftMajor(new RftMajor());
				form.setRftMajor(rftMajor);

				registerFormList.add(form);
			}

		} finally {

		}

		return registerFormList;
	}

	@Override
	public void updateUser(RegisterForm registerForm) {
		try {

			updateStudent(registerForm);
			updateAcUser(registerForm);

		} finally {

		}
	}

	private void updateStudent(RegisterForm registerForm) {
		AcStudent acStudent;
		int studentRef;
		try {
			acStudent = new AcStudent();
			studentRef = registerForm.getAcStudent().getStudentRef();
			acStudent = em.find(AcStudent.class, studentRef);
			acStudent.setEducationLevel(registerForm.getAcStudent().getEducationLevel());
			acStudent.setPersonalId(registerForm.getAcStudent().getPersonalId());
			acStudent.setStudentId(registerForm.getAcStudent().getStudentId());
			acStudent.setGender(registerForm.getAcStudent().getGender());
			acStudent.setBirthDate(registerForm.getAcStudent().getBirthDate());
			acStudent.setTitleCode(registerForm.getAcStudent().getTitleCode());
			acStudent.setFirstNameT(registerForm.getAcStudent().getFirstNameT());
			acStudent.setLastNameT(registerForm.getAcStudent().getLastNameT());
			acStudent.setFirstNameE(registerForm.getAcStudent().getFirstNameE());
			acStudent.setLastNameE(registerForm.getAcStudent().getLastNameE());
			acStudent.setSchoolRef(registerForm.getAcStudent().getSchoolRef());
			acStudent.setMajorRef(registerForm.getAcStudent().getMajorRef());
			acStudent.setNationality(registerForm.getAcStudent().getNationality());
			acStudent.setRace(registerForm.getAcStudent().getRace());
			acStudent.setReligion(registerForm.getAcStudent().getReligion());
			acStudent.setPhoneNo(registerForm.getAcStudent().getPhoneNo());
			acStudent.setEmail(registerForm.getAcStudent().getEmail());

			acStudent.setProfileName(registerForm.getAcStudent().getProfileName());
			acStudent.setProfileType(registerForm.getAcStudent().getProfileType());
			acStudent.setProfileImage(registerForm.getAcStudent().getProfileImage());

			acStudent.setCreateUser(studentRef);
			acStudent.setUpdateUser(studentRef);
			acStudent.setCreateDatetime(new Timestamp(System.currentTimeMillis()));
			acStudent.setUpdateDatetime(new Timestamp(System.currentTimeMillis()));

			em.merge(acStudent);
		} finally {

		}
	}

	private void updateAcUser(RegisterForm registerForm) {
		AcUser acUser;
		int userRef;
		try {
			acUser = new AcUser();
			userRef = registerForm.getAcUser().getUserRef();
			acUser = em.find(AcUser.class, userRef);
			acUser.setUserId(registerForm.getAcStudent().getPersonalId());
			acUser.setPassword(registerForm.getAcStudent().getPersonalId());

			acUser.setUpdateUser(userRef);
			acUser.setUpdateDatetime(new Timestamp(System.currentTimeMillis()));

			em.merge(acUser);
		} finally {

		}
	}

	@Override
	public void deleteUser(RegisterForm registerForm) {
		try {

			removeStudent(registerForm);
			removeAcUser(registerForm);

		} finally {

		}
	}

	private void removeStudent(RegisterForm registerForm) {
		AcStudent acStudent;
		int studentRef;
		try {
			acStudent = new AcStudent();
			studentRef = registerForm.getAcStudent().getStudentRef();
			acStudent = em.find(AcStudent.class, studentRef);

			em.remove(acStudent);
		} finally {

		}
	}

	private void removeAcUser(RegisterForm registerForm) {
		AcUser acUser;
		int userRef;
		try {
			acUser = new AcUser();
			userRef = registerForm.getAcUser().getUserRef();
			acUser = em.find(AcUser.class, userRef);

			em.remove(acUser);
		} finally {

		}
	}

	@Override
	public RegisterForm getDataById(RegisterForm registerForm) {
		AcUser acUser;
		RegisterForm form;
		AcStudent acStudent;
		try {
			acUser = new AcUser();
			acUser = em.find(AcUser.class, registerForm.getAcUser().getUserRef());
			
			acStudent = new AcStudent();
			acStudent = em.find(AcStudent.class, registerForm.getAcStudent().getStudentRef());

			form = new RegisterForm();
			form.setAcStudent(new AcStudent());
			form.setAcUser(new AcUser());
			
			form.setAcStudent(acStudent);
			form.setAcUser(acUser);
			
			return form;
		} finally {

		}
	}

}
