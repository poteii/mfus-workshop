package com.mfu.scholarships.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mfu.scholarships.form.RegisterForm;
import com.mfu.scholarships.service.RegisterService;

@RestController
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	private RegisterService registerService;

	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public ResponseEntity createUser(@RequestBody RegisterForm form) {
		try {
			registerService.createUser(form);
			return new ResponseEntity("insert Success!", HttpStatus.OK);
		}catch (Exception e) {
			System.out.println("error = " + e.getMessage());
			return new ResponseEntity("error!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/doSearch", method = RequestMethod.POST)
	public List<RegisterForm> doSearch(@RequestBody RegisterForm form) {
		return registerService.doSearch(form);
	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	public ResponseEntity updateUser(@RequestBody RegisterForm form) {
		try {
			registerService.updateUser(form);
			return new ResponseEntity("insert Success!", HttpStatus.OK);
		}catch (Exception e) {
			System.out.println("error = " + e.getMessage());
			return new ResponseEntity("error!", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
	public ResponseEntity deleteUser(@RequestBody RegisterForm form) throws IOException {
		registerService.deleteUser(form);
		

		return new ResponseEntity("Remove Success!", HttpStatus.OK);
	}
	
	@RequestMapping("/getDataById/{studentRef}")
	public RegisterForm getDataById(@PathVariable("studentRef") int studentRef ){
		RegisterForm registerForm = new RegisterForm();
		registerForm = registerService.getDataById(studentRef);
		return registerForm;
	}
	
	@RequestMapping("/getData")
	public RegisterForm getData(@RequestBody RegisterForm form){
		RegisterForm registerForm = new RegisterForm();
		registerForm = registerService.getData(form);
		return registerForm;
	}

}
