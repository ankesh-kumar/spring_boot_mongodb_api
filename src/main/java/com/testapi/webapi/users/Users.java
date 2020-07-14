package com.testapi.webapi.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.testapi.webapi.topic.TopicModel;

@RestController
public class Users {

	@Autowired
	private UsersService userService; 

	
	@RequestMapping(method = RequestMethod.POST, value="/user")
	public void add(@RequestBody UsersModel newtopic) {
		
		userService.addUser(newtopic);
	}
	
	
	@RequestMapping(method = RequestMethod.POST, value="/useropengroup")
	public void updateOGroup(@RequestBody UsersModel user) {
	
		userService.updateOGroup(user);
		
	}
	
	@RequestMapping("/user/{id}")
	public List<UsersModel> getTopic(@PathVariable String id) {
		return userService.getAllUsers(id);
		
	}
	
}
