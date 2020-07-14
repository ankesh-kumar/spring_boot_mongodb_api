package com.testapi.webapi.topic;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	private List<TopicModel> topics=new ArrayList<>(Arrays.asList(
			new TopicModel("1","Java"),
			new TopicModel("2","SpringBoot")
		));
	
	
	public List<TopicModel> getAllTopics(){
		//return topics;
		List<TopicModel> topic=new ArrayList<>();
		topicRepository.findAll()
		.forEach(topic::add);
	
		return topic;
		
	}
	
	public TopicModel getTopic(String id) {
		return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(TopicModel newtopic) {
		
		topics.add(newtopic);
		//topicRepository.save(new TopicModel("1","Java"));
		
		
//		topicRepository.deleteAll();
//		topicRepository.save(new TopicModel("1","Java"));
//		topicRepository.save(new TopicModel("2","SpringBoot"));
//			
//		
//		System.out.println("Data saved Successfully");
		
	}
}
