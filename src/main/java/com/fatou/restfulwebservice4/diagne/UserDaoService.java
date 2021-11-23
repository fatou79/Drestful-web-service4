package com.fatou.restfulwebservice4.diagne;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 3;
	
	static {
		users.add(new User(1,"Mame", new Date()));
		users.add(new User(2,"Coumba", new Date()));
		users.add(new User(3,"Salanee", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	public User saveUser(User user) {
		if(user.getId()== 0) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
			}	
			}
			return null;
			
			
		
		
	}
	}
	

