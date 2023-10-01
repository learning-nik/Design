package com.lib.domain;

import java.util.List;

import com.lib.type.BookType;

public class Book {
	
	private String id;
	
	private String title;
	
	private List<String> author;
	
	private long publishedDate;
	
	private int rackNumber;
	
	private BookType type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getAuthor() {
		return author;
	}

	public void setAuthor(List<String> author) {
		this.author = author;
	}

	public long getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(long publishedDate) {
		this.publishedDate = publishedDate;
	}
	
	
	
	//- search books by their title, author, subject category as well by the publication date.
	

}
