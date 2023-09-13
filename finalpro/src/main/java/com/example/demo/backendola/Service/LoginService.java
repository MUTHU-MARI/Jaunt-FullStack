package com.example.demo.backendola.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.backendola.Model.SignupModel;
import com.example.demo.backendola.repoint.LoginRepoInt;

@Service
public class LoginService implements LoginServiceInt {
	@Autowired
	private LoginRepoInt lri;
	@Override
	public List<SignupModel> getData() {
		// TODO Auto-generated method stub
		return lri.findAll();
	}

	@Override
	public List<SignupModel> findByUsernameAndPassword(String user, String pass) {
		// TODO Auto-generated method stub
		return lri.findByUsernameAndPassword(user, pass);
	}

	@Override
	public List<SignupModel> findByEmailAndPassword(String user, String pass) {
		// TODO Auto-generated method stub
		return lri.findByEmailAndPassword(user, pass);
	}

}


//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.data.domain.Page;
////import org.springframework.data.domain.PageRequest;
////import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.backendola.Model.LoginModel;
//import com.example.demo.backendola.repoint.LoginRepoInt;
//
//
//@Service
//public class LoginService implements LoginServiceInt {
//	
//	@Autowired
//	LoginRepoInt ri;
//
//	@Override
//	public List<LoginModel> getDetailsDetails() {
//		// TODO Auto-generated method stub
//		return ri.findAll();
//	}
//
////	@Override
////	public void saveDetailsDetails(LoginModel dm) {
////		// TODO Auto-generated method stub
////		ri.save(dm);
////  }
//	@Override
//	public void saveDetailsDetails(LoginModel dm) {
//		ri.save(dm);
//		//return "Posted!";
//	}
//
//	@Override
//	public void updataDetailsDetails(LoginModel dm) {
//		// TODO Auto-generated method stub
//		ri.save(dm);
//	}
//
//	@Override
//	public void deleteDetailsDetails(int id) {
//		// TODO Auto-generated method stub
//		ri.deleteById(id);
//	}
//
//	@Override
//	public Optional<LoginModel> getByid(int id) {
//		// TODO Auto-generated method stub
//		return ri.findById(id);
//	}
//
////	//pagination
////	public Page<LoginModel> getPaginatedUsers(int page, int size) {
////	    Pageable pageable = PageRequest.of(page, size);
////	    return ri.findAll(pageable);
////	  }
//	
//	
//
//}