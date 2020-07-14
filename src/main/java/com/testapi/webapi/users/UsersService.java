package com.testapi.webapi.users;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

	@Autowired
	private UsersRepository topicRepository;
	
	
	public List<UsersModel> getAllUsers(String id){
		//return topics;
//		List<UsersModel> topic=new ArrayList<>();
//		topicRepository.findAll()
//		.forEach(topic::add);
		
	
		//return topic;
		
		return topicRepository.findByUserId(id);
		
	}

	
	public void addUser(UsersModel newUser) {
		
		topicRepository.save(newUser);
		
	}


	public UsersModel updateOGroup(UsersModel user) {
		
		user.setUserId(user.getUserId());
		topicRepository.save(user);
		return user;
		
		
	}
	
	
	
}
