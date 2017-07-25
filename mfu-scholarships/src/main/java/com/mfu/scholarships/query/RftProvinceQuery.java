package com.mfu.scholarships.query;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.mfu.scholarships.entity.RftProvince;

public class RftProvinceQuery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static List<RftProvince> getProvinces(EntityManager em) {
		Query query;
		String selectClause = "";
		String fromClause = "";
		String whereClause = "";
		try {
			selectClause = "select rftProvince ";
			fromClause = " from RftProvince rftProvince";

			query = em.createQuery(selectClause + fromClause + whereClause);

			return query.getResultList();

		} finally {
			query = null;
		}
	}

}
