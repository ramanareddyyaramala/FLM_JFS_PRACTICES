package com.classobject.practice1;

public class Book {
	
	String bookName;
	String authorName;
	int publishedYear;
	
		public Book(String bookName, String authorName, int publishedYear) {
		
		this.bookName = bookName;
		this.authorName = authorName;
		this.publishedYear = publishedYear;
	}
		
		void displayBookDetails() {
			System.out.println("Book Name:"+bookName);
			System.out.println("Author Name:"+authorName);
			System.out.println("Published Year:"+publishedYear);
		}
		

		public static void main(String[] args) {
			Book b1=new Book("The Alchemist","Paulo Coheo",1988);
			
			Book b2=new Book("Clean Code","Robert C Martin",2008);
			
			System.out.println("Book1 Details");
			b1.displayBookDetails();
			System.out.println();
			System.out.println("Book2 Details");
			b2.displayBookDetails();
			
		}
}
