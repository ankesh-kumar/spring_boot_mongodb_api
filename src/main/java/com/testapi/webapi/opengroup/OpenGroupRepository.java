package com.testapi.webapi.opengroup;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.testapi.webapi.users.UsersModel;

import java.util.List;

@Repository
public interface OpenGroupRepository extends MongoRepository<OpenGroupModel,String>, PagingAndSortingRepository<OpenGroupModel, String>{

	@Query("{ '_openg_id' : ?0 }")
	List<OpenGroupModel> findMessagebyGrpId(String _openg_id);
	
	
}
