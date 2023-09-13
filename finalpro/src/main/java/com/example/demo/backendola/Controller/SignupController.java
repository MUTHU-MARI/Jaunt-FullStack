package com.example.demo.backendola.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.backendola.Model.SignupModel;
import com.example.demo.backendola.Service.SignupService;

@RestController
@CrossOrigin("*")
public class SignupController {
	@Autowired
	private SignupService ss;
	@GetMapping("/getsignupdata")
	public List<SignupModel> getdata()
	{
		return ss.getData();
	}
	@PostMapping("/savesignupdata")
	public String savedata(@RequestBody SignupModel se)
	{
		String username = se.getUsername();
		String email = se.getEmail();
		boolean checkEmail = ss.signupemail(email);
		boolean checkUsername = ss.signupuser(username);
		if(!checkEmail && !checkUsername)
		{
			ss.postData(se);
			return " signup successfull";
		}
		else
		{
			if(checkEmail)
				return " Email already exist";
			else
				return " Username already exist";
		}
	}
	@PutMapping("/updatesignupdata/{id}")
	public String updatedata(@PathVariable int id ,@RequestBody SignupModel se)
	{
		boolean checkEmail = ss.signupemail(se.getEmail());
		boolean checkUsername = ss.signupuser(se.getUsername());
		if(!checkEmail && !checkUsername)
		{
			ss.updateData(se);
			return " update successfull";
		}
		else if(checkEmail && checkUsername)
		{
			return "Email & Username already exist";
		}
		else
		{
			if(checkEmail)
				return " Email already exist";
			else
				return " Username already exist";
		}
		
	}
	@DeleteMapping("/deletesignupdata/{id}")
	public String deletedata(@PathVariable int id)
	{
		ss.deleteData(id);
		return "id: "+id+ "detail has been delete";
	}
	@GetMapping("/getbyid/{id}")
	public Optional<SignupModel> getByid(@PathVariable int id)
	{
		return ss.getByid(id);
	} 
	

}











//	@GetMapping("/getsignupdetails")
//	public List<SignupModel> getDetails(){
//		return service2.getsignupDetailsDetails();
//	}
//	@PostMapping("/savesignupdetails")
//	public void saveDetailsDetails(@RequestBody SignupModel dm) {
//		service2.savesignupDetailsDetails(dm);
//	}
//	@PutMapping("/updatesignupdetails/{id}")
//	public void updateLibraryData(@RequestBody SignupModel dm,@PathVariable int id) {
//		dm.setId(id);
//		service2.updatesignupDetailsDetails(dm);
//	}
//	@DeleteMapping("/deletedetails/{id}")
//	public void deleteDetails(@PathVariable int id) {
//		service2.deletesignupDetailsDetails(id);
//		System.out.println("deleted");
//	}
//	@GetMapping("/getbyid/{id}")
//	public Optional<SignupModel> getByid(@PathVariable int id) {
//		return service2.getByid(id);
//	} 
	


