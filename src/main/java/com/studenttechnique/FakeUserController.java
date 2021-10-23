package com.studenttechnique;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FakeUserController {

	@GetMapping("/user")
	public ResponseEntity<List<User>> getUser(){
		return ResponseEntity.ok(createUser());
		
	}

	private List<User> createUser() {
		List<User> users=new ArrayList();
		User user=new User("raja","male","delhi",20);
		users.add(user);
		User user2=new User("sita","female","noida",30);
		users.add(user2);
		return users;
	}
}
