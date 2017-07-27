package com.mfu.scholarships.query;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.Query;

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


}
