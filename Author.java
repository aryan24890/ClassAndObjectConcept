/*
 * 1.	Write a Java class Author with following features:
Instance variables (fields) :

firstName for the author’s first name of type String.
lastName for the author’s last name of type String.
bookName for the book has written by the author of type String


Constructors:
    Default constructor

public Author (String firstName, String lastName): A constructor with parameters, it creates the Author object by setting the two fields to the passed values.

public Author (String firstName, String lastName, String bookName): A constructor with parameters, it creates the Author object by setting the three fields to the passed values.


Instance methods:

public void setFirstName (String firstName): Used to set the first name of author.

public void setLastName (String lastName): Used to set the last name of author.

public void setBookName(String bookName): Used to set the book name.

public String getFirstName(): This method returns the first name of the author.

public String getLastName(): This method returns the last name of the author.

public String getBookName(): This method returns the book name of the written book by the author.

public String toString(): This method printed out author’s details to the screen

Finally write test class TestAuthor to test the functionalities you implemented.

•	Create three objects with the defined constructors (one is with default, one is with two parameterized constructor and one is with three parameterized constructor).
•	Display the values of second object by using getters.
•	Display the values of the third object by using the toString() method.
•	Display the values of first object by using getters.
•	This time create an object with default constructor. What is your observation?
•	Create one reference and try to display the values. What is your observation?
•	Assign second object to the reference and display the values.

 */
package com.exercises.bll;

public class Author {
	public String firstName;
	public String lastName;
	public String bookName;
	
	public Author() {
		
	}
	
	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Author(String firstName, String lastName, String bookName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.bookName = bookName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String toString() {
		return "Author [Name= "+firstName+" "+lastName+", BookName= "+bookName+"]";
	}
	

}
