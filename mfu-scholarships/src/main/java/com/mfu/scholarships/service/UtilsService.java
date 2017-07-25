package com.mfu.scholarships.service;

import java.io.Serializable;
import java.util.List;

import com.mfu.scholarships.entity.RftDistrict;
import com.mfu.scholarships.entity.RftMajor;
import com.mfu.scholarships.entity.RftProvince;
import com.mfu.scholarships.entity.RftSchool;
import com.mfu.scholarships.entity.RftSubDistrict;
import com.mfu.scholarships.entity.RftTitleName;

public interface UtilsService extends Serializable {

	public List<RftProvince> getProvinces();

	public List<RftDistrict> getDistricts();

	public List<RftSubDistrict> getSubDistricts();

	public List<RftSchool> getSchools();

	public List<RftMajor> getMajors();

	public List<RftTitleName> getTitleNames();

}
