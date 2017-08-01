package com.mfu.scholarships.query;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.mfu.scholarships.entity.AcUser;

public class AcUserQuery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static int genMaxUserRef(EntityManager em) {
		Query query;
		String selectClause;
		String fromClause;
		try {
			selectClause = "SELECT COALESCE(max(user_ref + 1),1) ";
			fromClause = "FROM ac_user";

			query = em.createNativeQuery(selectClause + fromClause);

			return new Integer(query.getResultList().get(0).toString());

		} finally {

		}
	}

	public static AcUser getAcUserByStudentRef(int studentRef, EntityManager em) {
		Query query;
		String selectClause;
		String fromClause;
		String whereClause;
		try {
			selectClause = "SELECT acUser ";
			fromClause = "FROM AcUser acUser ";
			whereClause = "WHERE acUser.studentRef = " + studentRef;

			query = em.createQuery(selectClause + fromClause + whereClause);

			if(query.getResultList().size() > 0) {
				return (AcUser) query.getResultList().get(0);
			}

		} finally {

		}
		return null;
	}


}
