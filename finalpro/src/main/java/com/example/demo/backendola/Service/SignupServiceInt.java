package com.example.demo.backendola.Service;

import java.util.List;
import java.util.Optional;
import com.example.demo.backendola.Model.SignupModel;
public interface SignupServiceInt {
	public List<SignupModel> getData();
	public void postData(SignupModel se);
	public void updateData(SignupModel se);
	public void deleteData(int id);
	public boolean signupuser(String user);
	public boolean signupemail(String email);
	public Optional<SignupModel> getByid(int id);
}

//	public List<SignupModel> getsignupDetailsDetails();
//	public void savesignupDetailsDetails(SignupModel dm);
//	public void updatesignupDetailsDetails(SignupModel dm);
//	public void deletesignupDetailsDetails(int id);


//   public Optional<SignupModel> getByid(int id);