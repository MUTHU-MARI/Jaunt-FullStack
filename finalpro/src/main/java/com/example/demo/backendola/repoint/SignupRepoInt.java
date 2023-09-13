package com.example.demo.backendola.repoint;
//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.backendola.Model.SignupModel;


public interface SignupRepoInt extends JpaRepository<SignupModel,Integer> 
{

	public boolean existsByUsername(String user);
	public boolean existsByEmail(String email);
	public SignupModel findByUsername(String username);
}


