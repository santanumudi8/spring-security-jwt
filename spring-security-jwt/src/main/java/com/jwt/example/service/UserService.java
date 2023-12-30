package com.jwt.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.model.User;

@Service
public class UserService {

	private List<User> store = new ArrayList<User>();

	public UserService() {
		store.add(new User(UUID.randomUUID().toString(), "Santanu Mudi", "santanu@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Gourav Munjal", "gourav@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Roman saini", "roman@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Ravindra Babu", "ravindra@gmail.com"));
	}
	
	public List<User> getUsers(){
		return this.store;
	}
	
}
