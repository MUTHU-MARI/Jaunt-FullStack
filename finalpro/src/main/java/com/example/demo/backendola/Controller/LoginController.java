package com.example.demo.backendola.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.backendola.Model.SignupModel;
import com.example.demo.backendola.Service.LoginService;

@RestController
@RequestMapping("/login")
@CrossOrigin("*")
public class LoginController {
	@Autowired
	private LoginService ls;
	@GetMapping("/getdata")
	public List<SignupModel>getdata()
	{
		return ls.getData();
	}
	@GetMapping("/loginbyusername/{username}/{password}")
	public String getbyusername(@PathVariable String username,@PathVariable String password)
	{
		List<SignupModel>obj = new ArrayList<>();
		obj=ls.findByUsernameAndPassword(username, password);
		if(obj.isEmpty())
		{
			return "login failed";
		}
		else
		{
			return "login sucessfully";
		}
	}

}




//import java.util.List;
//
//import java.util.Optional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import com.example.demo.backendola.Model.LoginModel;
//import com.example.demo.backendola.Service.LoginService;
//@RestController
//@CrossOrigin("*")
//public class LoginController
//{
//		@Autowired
//		private LoginService service1;
//		@GetMapping("/getdetails")
//		public List<LoginModel> getDetails(){
//			return service1.getDetailsDetails();
//			
//		}
//		
//		@PostMapping("/savedetails")
//		public void saveDetailsDetails(@RequestBody LoginModel dm) {
//			service1.saveDetailsDetails(dm);
//		}
//		@PutMapping("/updatedetails/{id}")
//		public void updateLibraryData(@PathVariable int id,@RequestBody LoginModel dm) {
//			dm.setId(id);
//			service1.updataDetailsDetails(dm);
//		}
//		@DeleteMapping("/deletedetails/{id}")
//		public void deleteDetails(@PathVariable int id) {
//			service1.deleteDetailsDetails(id);
//			System.out.println("deleted");
//		}
//		@GetMapping("/getbyid/{id}")
//		public Optional<LoginModel> getByid(@PathVariable int id) {
//			return service1.getByid(id);
//		}
//		
//}