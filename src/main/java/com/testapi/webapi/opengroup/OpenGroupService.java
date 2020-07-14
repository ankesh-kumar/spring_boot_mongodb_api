package com.testapi.webapi.opengroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OpenGroupService {

	@Autowired
	private OpenGroupRepository openGroupRepository;
	
	

	public void addMessage(OpenGroupModel model) {
		
		openGroupRepository.save(model);
		
	}
	
	public List<OpenGroupModel> getAllMessage(String openGid) {
		
		return openGroupRepository.findMessagebyGrpId(openGid);

	}
	
}
