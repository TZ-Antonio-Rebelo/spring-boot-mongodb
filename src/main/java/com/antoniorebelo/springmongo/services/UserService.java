package com.antoniorebelo.springmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.antoniorebelo.springmongo.domain.User;
import com.antoniorebelo.springmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	public UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
}
