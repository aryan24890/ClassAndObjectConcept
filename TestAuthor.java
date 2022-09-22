package com.exercises.pll;

import com.exercises.bll.Author;

public class TestAuthor {

	public static void main(String[] args) {
		Author a1 = new Author(); //object for default constructor.
		Author a2 = new Author("Aryan","Raj");//obj for two parameterised constructor
		Author a3 = new Author("Aryan", "Raj","javaWorld");// obj for three parameterised constructor
		System.out.println(a2);
		System.out.println(a3.toString());
		System.out.println(a1);

	}

}
