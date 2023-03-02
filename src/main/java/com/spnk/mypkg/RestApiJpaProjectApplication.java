package com.spnk.mypkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.spnk.mypkg.dao.UserRepo;
import com.spnk.mypkg.entitymodel.User;

@SpringBootApplication
@EntityScan(basePackages = {"com.spnk.mypkg.entitymodel"})
public class RestApiJpaProjectApplication {

public static void main(String[] args) {
		
		ApplicationContext context=SpringApplication.run(RestApiJpaProjectApplication.class, args);
		
		
		UserRepo userRepo=context.getBean(UserRepo.class);    // actually interface object can't be created 
		
//		User user=new User();
//		user.setName("shiv");
//		user.setCity("vrindawan");
//		user.setStatus("i am java programmer");
//		
//		User user1=userRepo.save(user);   // to save Single object
//		System.out.println(user1);
		
		//create object
//		User user=new User();
//		user.setName("Kanha");
//		user.setCity("heart");
//		user.setStatus("healing our body");
//		
//		User user2=new User();
//		user2.setName("Shivani");
//		user2.setCity("raipur");
//		user2.setStatus("learning java");
//		
//		List<User> users=List.of(user,user2);                 // to save multiple object
//		
//		Iterable<User> result=userRepo.saveAll(users);
//		result.forEach(e-> System.out.println(e));
		
		
		//update      user of id 102
		
//		Optional<User> optional=userRepo.findById(102);
//		
//		User user=optional.get();
//		
//		System.out.println(user);
//		
//		user.setName("supreme lord Kanha");
//		
//		userRepo.save(user);
//		System.out.println(user);
		
		//get data                        same as update   using findbyid to get data 
		
//		Iterable<User>  itr=userRepo.findAll();
//		
//		itr.forEach(e->System.out.println(e));               // to get all data
		
		//deleting object
		
//		userRepo.deleteById(2);
//		System.out.println("deleted");
		
		//List<User> users=userRepo.findByName("shiv");
		
		
//		List<User> users=userRepo.findByNameStartingWith("sh");
//		users.forEach(e->System.out.println(e));
		
//		List<User> users=userRepo.getAl();
//		users.forEach(e->System.out.println(e));
		//System.out.println("_________________________________________________________________________________________");
		
		List<User> users=userRepo.getUserByName("shiV");
		users.forEach(e->System.out.println(e));
		
		
	}

}
