package com.mfu.scholarships.query;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.mfu.scholarships.entity.RftDistrict;

public class RftDistrictQuery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static List<RftDistrict> getDistricts(EntityManager em) {
		Query query;
		String selectClause = "";
		String fromClause = "";
		String whereClause = "";
		try {
			selectClause = "select rftDistrict ";
			fromClause = " from RftDistrict rftDistrict";

			query = em.createQuery(selectClause + fromClause + whereClause);

			return query.getResultList();

		} finally {
			query = null;
		}
	}

}
