/* 
 * Create a Library class
 * use methods: addBook,issueBook,returnBook,showAvailableBook.
 * properties: array for storing available books and to store issue books 
 * */

import java.util.Scanner;

class Library{
	String[] books;
	int no_of_books;
	Library(){
		this.books=new String[1000];
		this.no_of_books = 0;
	}
	
	void addBook(String book) {
		this.books[no_of_books] = book;
		no_of_books++;
		System.out.println(book+" has been added!");
	}
	void showAvailableBooks() {
		System.out.println("Available Books are:");
		for(String book:this.books) {
			if(book==null) {
				continue;
			}
			
			System.out.println("*"+ book);
		}
	}
	
	void issueBook(String book){
		for(int i=0;i<this.books.length;i++){
			if(this.books[i].equals(book)) {
				System.out.println("The book has been issued!");
				this.books[i] = null;
				return;
				}
			}
		System.out.println("This book is not available!");
	}
	
	void returnBook(String book) {
		addBook(book);
	}
       
}

public class Online_Library {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Library centralLibrary = new Library();
		
		System.out.println("Add Book Name:");
		centralLibrary.addBook(sc.nextLine());
		centralLibrary.addBook("Lake paraside");
		centralLibrary.addBook("Avengers");
		centralLibrary.addBook("Harry Potter");
		centralLibrary.showAvailableBooks();
		
		System.out.println("Name of issuing book");
		centralLibrary.issueBook(sc.nextLine());
		centralLibrary.showAvailableBooks();
		
		System.out.println("Return Book name:");
		centralLibrary.returnBook(sc.nextLine());
		centralLibrary.showAvailableBooks();
	}
}
