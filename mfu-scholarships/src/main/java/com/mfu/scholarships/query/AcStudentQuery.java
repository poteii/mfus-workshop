package com.mfu.scholarships.query;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.mfu.scholarships.form.RegisterForm;

public class AcStudentQuery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static int genMaxStudentRef(EntityManager em) {
		Query query;
		String selectClause;
		String fromClause;
		try {
			selectClause = "SELECT COALESCE(max(student_ref + 1),1) ";
			fromClause = "FROM ac_student";

			query = em.createNativeQuery(selectClause + fromClause);

			return new Integer(query.getResultList().get(0).toString());

		} finally {

		}
	}

	public static List<Object> searchStudent(RegisterForm registerForm, EntityManager em) {
		Query query;
		String selectClause;
		String fromClause;
		String whereClause = "";
		boolean isFirst = true;
		String orderBy = "";
		try {
			selectClause = "SELECT student.student_ref ";
			fromClause = "FROM ac_student student";

			if (registerForm.getAcStudent().getPersonalId() != null) {
				whereClause += (isFirst ? " WHERE " : " AND ") + "student.personal_id = '"
						+ registerForm.getAcStudent().getPersonalId() + "'";
				isFirst = false;
			}

			if (registerForm.getAcStudent().getFirstNameT() != null) {
				whereClause += (isFirst ? " WHERE " : " AND ") + "student.first_name_t like '%"
						+ registerForm.getAcStudent().getFirstNameT() + "%'";
				isFirst = false;
			}

			if (registerForm.getAcStudent().getLastNameT() != null) {
				whereClause += (isFirst ? " WHERE " : " AND ") + "student.last_name_t like '%"
						+ registerForm.getAcStudent().getLastNameT() + "%'";
				isFirst = false;
			}

			if (registerForm.getAcStudent().getFirstNameE() != null) {
				whereClause += (isFirst ? " WHERE " : " AND ") + "student.first_name_e like '%"
						+ registerForm.getAcStudent().getFirstNameE() + "%'";
				isFirst = false;
			}

			if (registerForm.getAcStudent().getLastNameE() != null) {
				whereClause += (isFirst ? " WHERE " : " AND ") + "student.last_name_e like '%"
						+ registerForm.getAcStudent().getLastNameE() + "%'";
				isFirst = false;
			}

			if (registerForm.getAcStudent().getStudentId() != null) {
				whereClause += (isFirst ? " WHERE " : " AND ") + "student.student_id = '"
						+ registerForm.getAcStudent().getStudentId() + "'";
				isFirst = false;
			}

			if (registerForm.getAcStudent().getSchoolRef() != 0) {
				whereClause += (isFirst ? " WHERE " : " AND ") + "student.school_ref = '"
						+ registerForm.getAcStudent().getSchoolRef() + "'";
				isFirst = false;
			}

			if (registerForm.getAcStudent().getMajorRef() != 0) {
				whereClause += (isFirst ? " WHERE " : " AND ") + "student.major_ref = '"
						+ registerForm.getAcStudent().getMajorRef() + "'";
				isFirst = false;
			}

			orderBy = " order by school.school_name_t, major.major_name_t,student.student_id,student.personal_id ASC ";

			query = em.createNativeQuery(selectClause + fromClause + whereClause + orderBy);

			return query.getResultList();

		} finally {

		}
	}

}
