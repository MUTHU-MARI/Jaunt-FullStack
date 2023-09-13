package com.example.demo.backendola.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.backendola.Model.BookingModel;
import com.example.demo.backendola.repoint.BookingRepoInt;
@Service
public class BookingService implements BookingServiceInt{

	@Autowired
	private BookingRepoInt bri;
	
	public void updatebookingData(BookingModel be) {
		 bri.save(be);
	}

	public void deletebookingData(int id) {
		bri.deleteById(id);
	}

	public void savebookingData(BookingModel be) {
		bri.save(be);
	}
	
	public List<BookingModel> getbookingData() {
		return bri.findAll();
	}

	public Optional<BookingModel> getByyid(int id) {
		return bri.findById(id);
	}
	
	//pagination
	public List<BookingModel> getpagination(int pageno, int pagesize) {
		Pageable paging=PageRequest.of(pageno, pagesize);
		Page<BookingModel>page=bri.findAll(paging);
		return page.getContent();
	}
	public List<BookingModel> getpagination(int pageno, int pagesize, String field) {
		Pageable paging=PageRequest.of(pageno, pagesize, Sort.by(field));
		Page<BookingModel>page=bri.findAll(paging);
		return page.getContent();
	}
}

	


