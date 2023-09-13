package com.example.demo.backendola.Service;

import java.util.List;
import java.util.Optional;


import com.example.demo.backendola.Model.SignupModel;

public interface LoginServiceInt {
	public List<SignupModel> getData();
	public List<SignupModel> findByUsernameAndPassword(String user,String pass);
	public List<SignupModel> findByEmailAndPassword(String user,String pass);

}
//	public List<LoginModel> getDetailsDetails();
//	public void saveDetailsDetails(LoginModel dm);
//	public void updataDetailsDetails(LoginModel dm);
//	public void deleteDetailsDetails(int id);
//    public Optional<LoginModel> getByid(int id);