//package com.example.demo.backendola.Service;
//
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Service;
//import com.example.demo.backendola.Model.CustBookModel;
//import com.example.demo.backendola.repoint.CustBookRepoInt;
//@Service
//public class CustBookService 
//{
// @Autowired CustBookRepoInt cbr;
//	public void updatecustbookingData(CustBookModel be) {
//		 cbr.save(be);
//		
//	}
//
//	public void deletecustbookingData(int id) {
//		cbr.deleteById(id);
//		
//	}
//
//	public void savecustbookingData(CustBookModel be) {
//		
//	   cbr.save(be);
//	}
//
//	public List<CustBookModel> getcustbookingData() {
//		return cbr.findAll();
//	}

//	public Page<CustBookModel> getpagenation(int pagesize, int offset, String field) {
//		Pageable pageable = PageRequest.of(pagesize, offset,Sort.by(field));
//        return cbr.findAll(pageable);
//
//	}
//
//}


