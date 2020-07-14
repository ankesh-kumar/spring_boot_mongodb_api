package com.testapi.webapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.testapi.webapi.topic.TopicModel;
import com.testapi.webapi.topic.TopicRepository;

@SpringBootApplication
//public class Apitesting1Application implements CommandLineRunner {
public class Apitesting1Application{


	@Autowired
	private TopicRepository topicRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(Apitesting1Application.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//	}

}
