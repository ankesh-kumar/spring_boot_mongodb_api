package com.testapi.webapi.opengroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OpenGroup {
	
	
	@Autowired
	private OpenGroupService openGroupService;
	
	@RequestMapping(method=RequestMethod.POST, value="/groupmessage")
	public void add(@RequestBody OpenGroupModel openGroupModel) {	
		openGroupService.addMessage(openGroupModel);
	}
	

	@RequestMapping("/groupmessage/{_openg_id}")
	public List<OpenGroupModel> getAllGroupMessage(@PathVariable String _openg_id) {
		return openGroupService.getAllMessage(_openg_id);
	}
	
	
}
