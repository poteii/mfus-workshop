package com.mfu.scholarships.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mfu.scholarships.entity.RftDistrict;
import com.mfu.scholarships.entity.RftMajor;
import com.mfu.scholarships.entity.RftProvince;
import com.mfu.scholarships.entity.RftSchool;
import com.mfu.scholarships.entity.RftSubDistrict;
import com.mfu.scholarships.entity.RftTitleName;
import com.mfu.scholarships.service.UtilsService;

@RestController
@RequestMapping("/utils")
public class UtilsController {

	@Autowired
	private UtilsService utilsService;

	@RequestMapping(value = "/getProvinces")
	public List<RftProvince> getProvinces() {
		return utilsService.getProvinces();
	}

	@RequestMapping(value = "/getDistricts")
	public List<RftDistrict> getDistricts() {
		return utilsService.getDistricts();
	}

	@RequestMapping(value = "/getSubDistricts")
	public List<RftSubDistrict> getSubDistricts() {
		return utilsService.getSubDistricts();
	}

	@RequestMapping(value = "/getSchools")
	public List<RftSchool> getSchools() {
		return utilsService.getSchools();
	}

	@RequestMapping(value = "/getMajors")
	public List<RftMajor> getMajors() {
		return utilsService.getMajors();
	}
	
	@RequestMapping(value = "/getTitleNames")
	public List<RftTitleName> getTitleNames() {
		return utilsService.getTitleNames();
	}

}
