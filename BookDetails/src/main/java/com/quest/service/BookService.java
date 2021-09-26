package com.quest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.quest.dao.BookDaoImpl;
import com.quest.model.Book;

@Service
public class BookService {

	@Autowired
	
	BookDaoImpl bookDaoImpl;
	
	//View the book data
	public List<Book> getAllData()
	{
		return (List<Book>) bookDaoImpl.getAllData();
	}
	
	//Search book record by book_id
	public Optional<Book> getDataById(@PathVariable int id)
	{
		return bookDaoImpl.getDataById(id);
	}
	
	//search book by subject
//	 public List<Book>findByBook_Name(String Book_Name)
//	 {
//		return bookDaoImpl.findByBook_Name(Book_Name);
//		 
//	 }
	 
	 //create the book record
	public void saveData(Book book)
	{
		bookDaoImpl.saveData(book);
    }
	 //update the book data
	public void updateData(int id,Book book)
	{
		bookDaoImpl.saveData(book);
	}
	
	//delete the book by book_id
	public void deleteData(int id)
	{
		bookDaoImpl.deleteData(id);
	}		
}
