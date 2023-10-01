package com.splitwise.domain;

public class User {
	
	private String id ;
	
	public User(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	private String name ;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
