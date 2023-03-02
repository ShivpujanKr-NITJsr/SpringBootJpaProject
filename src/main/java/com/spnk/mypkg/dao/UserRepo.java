package com.spnk.mypkg.dao;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.spnk.mypkg.entitymodel.User;

public interface UserRepo extends CrudRepository<User, Integer>{

	public List<User> findByName(String name);
	
	
	//creating method
	public List<User> findByNameAndCity(String name,String city);
	
	public List<User> findByNameStartingWith(String p);
	
	@Query("select u from User u")             // you can pass any query here and when you call method just below this,query run
	public List<User> getAl();
	
	
	// you can create custom method  ,  you can go through this link to get the pattern of custom method name
	//   https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
	
	
	@Query("select u from User u where u.name= :n")     //Through colon we providing variable at runtime and binding through @Param
	public List<User> getUserByName(@Param("n") String name);
	
}
