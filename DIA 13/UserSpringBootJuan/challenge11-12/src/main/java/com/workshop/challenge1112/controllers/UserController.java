package com.workshop.challenge1112.controllers;

import java.sql.SQLException;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.challenge1112.models.UserModel;
import com.workshop.challenge1112.services.UserService;


@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userS;
	
	@PostMapping("/postUser")
	public UserModel postUser(@RequestBody UserModel user) {
		try {
			return userS.ingresaUser(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("/getUser/{dni}")
	public Optional<UserModel> getUser(@PathVariable("dni") int dni) {
		try {
			return userS.devuelveUser(dni);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	@GetMapping("/getAllUsers")
	public List<UserModel> getAllUsers() {
		try {
			return userS.devuelteTodos();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}
	
	@DeleteMapping("/deleteUser/{dni}")
	public void deleteUser(@PathVariable("dni") int dni) {
		try {
			userS.borraUser(dni);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@PutMapping("/updateUser")
	public void updateUser(@RequestBody UserModel user) {
		try {
			userS.modificaUser(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
