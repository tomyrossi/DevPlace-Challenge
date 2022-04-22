package com.workshop.challenge1112.services;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.challenge1112.models.UserModel;
import com.workshop.challenge1112.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userR;
	
	public UserModel ingresaUser(UserModel user) throws SQLException {
		return userR.save(user);
	}
	
	public Optional<UserModel> devuelveUser(int dni) throws SQLException {
		
		return userR.findById(dni);
	}
	
	public List<UserModel> devuelteTodos() throws SQLException{
		return userR.findAll();
	}
	
	public void modificaUser(UserModel user) throws SQLException {
		userR.save(user);
	}
	
	public void borraUser(int dni) throws SQLException {
		userR.deleteById(dni);
	}
	
	
}
