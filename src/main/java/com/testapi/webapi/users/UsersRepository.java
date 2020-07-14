package com.testapi.webapi.users;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UsersRepository extends MongoRepository<UsersModel, String>{

	@Query("{ 'userId' : ?0 }")
	List<UsersModel> findByUserId(String userId);
	
	
}
