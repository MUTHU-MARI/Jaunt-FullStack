package com.example.demo.backendola.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.backendola.Model.BookingModel;
import com.example.demo.backendola.Service.BookingService;
    @CrossOrigin("*")
	@RestController
	public class BookingController {

	       @Autowired
	       private BookingService bs;
	       @PutMapping("/updatebookingdata/{id}")
	       public void updateDetails (@RequestBody BookingModel be,@PathVariable int id)
	       {
	    	   be.setId(id);
	    	   bs.updatebookingData(be);
	       }
	       
	       @DeleteMapping("/deletebookingdata/{id}")
	       public void deletebookingDetails(@PathVariable int id)
	       {
	       	bs.deletebookingData(id);
	       }
	       
	       @PostMapping("/savebookingdata")
	       public void saveDetails(@RequestBody BookingModel be)
	       {
	       	bs.savebookingData(be);
	       } 
	       
	       @GetMapping("/getbookingdata")
	       public List<BookingModel> getbookingData()
	       {
	    	   return bs.getbookingData();
	       }
	       
	       @GetMapping("/getbyyid/{id}")
			public Optional<BookingModel> getByyid(@PathVariable int id) {
				return bs.getByyid(id);
			}
	       //pagination
	       @GetMapping("/getbookingdata/{pageno}/{pagesize}")
	       public List<BookingModel> getpagenation(@PathVariable int pageno ,@PathVariable int pagesize){ 
	    	   return bs.getpagination(pageno,pagesize);
	       }
	       @GetMapping("/getbookingdata/{pageno}/{pagesize}/{field}")
	       public List<BookingModel> getpagenation(@PathVariable int pageno ,@PathVariable int pagesize,@PathVariable String field){
	    	Pageable pageable=PageRequest.of(pageno, pagesize) ;  
	    	   return bs.getpagination(pageno,pagesize,field);
	       }
	       
	}
    



