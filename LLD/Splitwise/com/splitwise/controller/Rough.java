package com.splitwise.controller;

public class Rough {

	//

	public static void main(String[] args) {

		String s = "nikhil#Pandita";
		String s1 = "nikhil#pandita";

		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

	}

	private void calculateHash(String s) {
		int hash = 7;
		for (int i = 0; i < s.length(); i++) {
			hash = hash * 31 + s.charAt(i);
		}
	}

}
