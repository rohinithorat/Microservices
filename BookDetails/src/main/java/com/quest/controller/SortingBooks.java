package com.quest.controller;

import java.util.Comparator;

import com.quest.model.Book;

public class SortingBooks implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		return (b1.getBook_Name().compareTo(b2.getBook_Name()));
	}

}
