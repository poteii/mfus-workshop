package com.mfu.scholarships.serviceImpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mfu.scholarships.entity.RftDistrict;
import com.mfu.scholarships.entity.RftMajor;
import com.mfu.scholarships.entity.RftProvince;
import com.mfu.scholarships.entity.RftSchool;
import com.mfu.scholarships.entity.RftSubDistrict;
import com.mfu.scholarships.entity.RftTitleName;
import com.mfu.scholarships.query.RftDistrictQuery;
import com.mfu.scholarships.query.RftMajorQuery;
import com.mfu.scholarships.query.RftProvinceQuery;
import com.mfu.scholarships.query.RftSchoolQuery;
import com.mfu.scholarships.query.RftSubDistrictQuery;
import com.mfu.scholarships.query.RftTitleNameQuery;
import com.mfu.scholarships.service.UtilsService;

@Service
@Repository
@Transactional
public class UtilsServiceImpl implements UtilsService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	EntityManager em;

	@Override
	public List<RftProvince> getProvinces() {
		List<RftProvince> provinces = new ArrayList<RftProvince>();
		provinces = RftProvinceQuery.getProvinces(em);
		return provinces;
	}

	@Override
	public List<RftDistrict> getDistricts() {
		List<RftDistrict> districts = new ArrayList<RftDistrict>();
		districts = RftDistrictQuery.getDistricts(em);
		return districts;
	}

	@Override
	public List<RftSubDistrict> getSubDistricts() {
		List<RftSubDistrict> subDistricts = new ArrayList<RftSubDistrict>();
		subDistricts = RftSubDistrictQuery.getSubDistricts(em);
		return subDistricts;
	}

	@Override
	public List<RftSchool> getSchools() {
		List<RftSchool> schools = new ArrayList<RftSchool>();
		schools = RftSchoolQuery.getSchools(em);
		return schools;
	}

	@Override
	public List<RftMajor> getMajors() {
		List<RftMajor> majors = new ArrayList<RftMajor>();
		majors = RftMajorQuery.getMajors(em);
		return majors;
	}

	@Override
	public List<RftTitleName> getTitleNames() {
		List<RftTitleName> titleNames = new ArrayList<RftTitleName>();
		titleNames = RftTitleNameQuery.getTitleNames(em);
		return titleNames;
	}

}
