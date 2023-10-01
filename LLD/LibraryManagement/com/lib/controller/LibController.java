package com.lib.controller;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.lib.domain.Book;

public class LibController {
	
	LibService libService = new LibService();

	public static void main(String[] args) {

	}
	
	
	
//	Add/Remove/Edit book: To add, remove or modify a book or book item.
	
	void addBook(Book book , int count){
	
		libService.addBook(book, count);
	}
	
	void removeBook(String bookId , int count) {
		
		libService.removeBook(bookId, count);
	}
	
//	Search catalog: To search books by title, author, subject or publication date.
	
	List<Book> searchBooks(Map<String,String> paramMap){
		
		return libService.searchBooks(paramMap);
	}
	
//	Check-out book: To borrow a book from the library.
	
	void assignBook(String bookId , String memberId ) {
		
		libService.assignBook(bookId, memberId);
	}


}
