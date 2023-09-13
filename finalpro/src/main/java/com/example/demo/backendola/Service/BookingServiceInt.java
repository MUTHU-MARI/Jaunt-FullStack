package com.example.demo.backendola.Service;

import java.util.List;
import org.springframework.data.domain.Page;
import com.example.demo.backendola.Model.BookingModel;
public interface BookingServiceInt 
{
	public void updatebookingData(BookingModel be);
    public List<BookingModel> getbookingData();
    public void savebookingData(BookingModel be);
    public void deletebookingData(int id);
    //public Page<BookingModel> getpageing(int pageno,int pagesize) ;
    public List<BookingModel> getpagination(int pageno, int pagesize);
//    public List<BookingModel> getpagination(int pageno, int pagesize, String field);
}
