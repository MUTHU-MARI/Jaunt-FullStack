package com.example.demo.backendola.repoint;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.backendola.Model.SignupModel;

@Repository
public interface LoginRepoInt extends JpaRepository<SignupModel,Integer> {
	public List<SignupModel> findByUsernameAndPassword(String user,String pass);
	public List<SignupModel> findByEmailAndPassword(String email,String pass);

}

