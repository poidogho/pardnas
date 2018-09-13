package com.odafeidogho.pardnasBackend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.odafeidogho.pardnasBackend.domain.security.User;

public interface UserRepository extends CrudRepository<User, Long>{
	User findByUsername(String username);
	User findByEmail(String email);
	List<User> findAll();

}
