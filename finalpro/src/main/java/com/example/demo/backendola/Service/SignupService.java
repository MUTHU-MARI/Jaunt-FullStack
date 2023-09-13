package com.example.demo.backendola.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.backendola.Model.SignupModel;
import com.example.demo.backendola.repoint.SignupRepoInt;

@Service
public class SignupService implements SignupServiceInt {
	@Autowired
	private SignupRepoInt sri;
	@Override
	public List<SignupModel> getData() {
		// TODO Auto-generated method stub
		return sri.findAll();
	}

	@Override
	public void postData(SignupModel se) {
		// TODO Auto-generated method stub
		sri.save(se);

	}

	@Override
	public void updateData(SignupModel se) {
		// TODO Auto-generated method stub
		 sri.save(se);
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		sri.deleteById(id);
	}

	@Override
	public boolean signupuser(String user) {
		// TODO Auto-generated method stub
		return sri.existsByUsername(user);
	}

	@Override
	public boolean signupemail(String email) {
		// TODO Auto-generated method stub
		return sri.existsByEmail(email);
	}

	public Optional<SignupModel> getByid(int id) {
		// TODO Auto-generated method stub
		return sri.findById(id);
	}

}



//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.example.demo.backendola.Model.SignupModel;
//import com.example.demo.backendola.repoint.SignupRepoInt;
//
//
//public class SignupService {
//	@Autowired
//	SignupRepoInt sri;
//
//	public List<SignupModel> getsignupDetailsDetails() {
//		return sri.findAll();
//	}
//
//	public void savesignupDetailsDetails(SignupModel dm) {
//		// TODO Auto-generated method stub
//		sri.save(dm);
//	}
//
//	public void updatesignupDetailsDetails(SignupModel dm) {
//		// TODO Auto-generated method stub
//		sri.save(dm);
//	}
//
//	public void deletesignupDetailsDetails(int id) {
//		
//		sri.deleteById(id);
//	}
//
//	public Optional<SignupModel> getByid(int id) {
//		
//		return sri.findById(id);
//	}
//
//}
