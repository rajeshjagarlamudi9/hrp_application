package com.hrp.rest.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hrp.model.ServiceStatus;
import com.hrp.model.User;
import com.hrp.model.UserProfile;
import com.hrp.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userservice;

	@RequestMapping(value ="/registerUser/{username}/{password}", method = RequestMethod.GET)
	public @ResponseBody ServiceStatus loginUser(@PathVariable("username") String username,@PathVariable("password") String password) throws Exception {
		
		
		ServiceStatus regstatus = new ServiceStatus();
		regstatus.setMessage("username="+username+"  ,password="+password);
		
		List<User> message =  userservice.loginUser(username);
		regstatus.setResult(message);
		return regstatus;
		
	}
	@RequestMapping(value ="/registerUser", method = RequestMethod.POST, 
			produces={"application/json"})
	public @ResponseBody ServiceStatus registerUser(@RequestBody User user) throws Exception {
		ServiceStatus regstatus=new ServiceStatus();
		userservice.registerUser(user);
		regstatus.setMessage("success");
		return regstatus;
		
	}

}
