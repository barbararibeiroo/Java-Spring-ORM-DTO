package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	

	public UserDTO findById(Long id) {
		User entity = repository.findById(id).get();
		UserDTO dto = new UserDTO(entity);
		return dto;
		
	}
}
