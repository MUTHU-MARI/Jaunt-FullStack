package com.example.demo.backendola.repoint;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.backendola.Model.BookingModel;

public interface BookingRepoInt extends JpaRepository<BookingModel,Integer>
{
	//Page<BookingModel> findAll(Pageable pageable);
}
