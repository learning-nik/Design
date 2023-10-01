package com.lib.controller;

import java.util.List;
import java.util.Map;

import com.lib.domain.Book;

public class LibService {

	void addBook(Book book, int count) {
		
		
		// Insert in "Books" Table  --> // BookId , Available , Description
		// Insert in "Book_Items" Table --> BarcodeId , BookId

	}
	
	void removeBook(String bookID, int count) {
		
		
		// reduce  count from "Books" Table for particular table
		
		// BookId , Available , Description

	}
	
	
	List<Book> searchBooks(Map<String,String> paramMap){
		
		return null;
		
		// return bookDetails and count and description.
		
		//return C
	}
	
	void assignBook(String bookId, String memberId) {

		// Insert into "USER_BOOKS" table with startDate etc
		// reduce  count from "Books" Table for particular bookId
	}

}
