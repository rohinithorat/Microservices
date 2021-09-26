package com.quest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quest.model.Book;
import com.quest.service.BookService;

@RestController
@RequestMapping("/api")

public class BookController {

	@Autowired
	
	BookService bookServiceImpl;
	
	//get all data of books
	@GetMapping("books")
	public List<Book> getAllData()
	{
		return bookServiceImpl.getAllData();
	}
	
	//get book data by id
	@GetMapping("books/{id}")
	public Optional<Book> getDataById(@PathVariable int id)
	{
		return bookServiceImpl.getDataById(id);
	}
	
	// save books data  
	@PostMapping("books")
	public String saveData(@RequestBody Book book )
	{
		bookServiceImpl.saveData(book);
		return "Book data saved successfully!";
	}
	
	//Search Book by Subject
//	@GetMapping("books/{Book_Name}")
//	public List<Book> findByBook_Name(String Book_Name) 
//	{
//		return bookServiceImpl.findByBook_Name(Book_Name);
//	}
	
	//update/edit the book by id
	@PutMapping("books/{id}")
	public String updateData(@PathVariable int id,@RequestBody Book book)
	{
		bookServiceImpl.saveData(book);
		return "Book data updated successfully!";
	}
	
	//delete record of book by id
	@DeleteMapping("books/{id}")
	public String deletedata(@PathVariable int id)
	{
		bookServiceImpl.deleteData(id);
		return "Book Data deleted successfully!";
	}

	
	
}
