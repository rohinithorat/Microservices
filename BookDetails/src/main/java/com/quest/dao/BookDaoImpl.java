package com.quest.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.quest.model.Book;
import com.quest.repository.BookRepository;

@Component
public class BookDaoImpl {
	
	@Autowired
	
	BookRepository bookRepoImpl;
	
	// View all books 
	public List<Book> getAllData()
	{
		return (List<Book>) bookRepoImpl.findAll();
	}
	
	//View book details by book_id
	public Optional<Book> getDataById(@PathVariable int id)
	{
		return bookRepoImpl.findById(id);
	}
	
	 
	// Create book data
	public void saveData(Book book)
	{
		bookRepoImpl.save(book);
    }
	
	// Edit/update the book records
	public void updateData(int id,Book book)
	{
		bookRepoImpl.save(book);
	}
	
	// Delete the book record by id
	public void deleteData(int id)
	{
		bookRepoImpl.deleteById(id);
	}

	// Search book by Subject 
//	public List<Book> findByBook_Name(String Book_Name) {
//		// TODO Auto-generated method stub
//		return bookRepoImpl.findByBook_Name(Book_Name);
//	}	
	
	//Sorting books 
	
	
	
	

}
