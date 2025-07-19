package com.logical;

class Author{
	private String author;
	Author(String author){
		this.author=author;
	}
	
	String getAuthor() {
		return author;
	}
}

class Book{
	private Author author;
	private String bookName;
	Book(Author author,String bookName){
		this.author=author;
		this.bookName=bookName;
	}
	
	void getBookdetails() {
		System.out.println("Author Name: "+author.getAuthor());
		System.out.println("Book Name: "+bookName);
	}
}


public class HasARelationAggregation2 {
	
	public static void main(String[] args) {
		Author author=new Author("William Shakeshere");
		Book book=new Book(author,"Rich Dad Poor Dad");
		book.getBookdetails();
		
	}
}

/*
 * Aggregation: A weaker relationship where the contained object can exist
 * independently of the container. If the container is destroyed, the contained
 * object may still exist.
 */
