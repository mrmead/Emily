import java.util.ArrayList;
import java.util.Scanner;

public class LibraryOfBooks {
	public static void main(String[] args)
	{
		Boolean quit = false;
		String response;
		LibraryInterface myLib = new Library();
		
		while (quit == false)
		{
			System.out.println("==========");
			System.out.println("   Menu   ");
			System.out.println("==========");
			System.out.println("(p)rint the library contents");
			System.out.println("(a)dd a book to the libary");
			System.out.println("(d)elete a book from the libary");
			System.out.println("(r)ead a book in the libary");
			System.out.println("(q)uit");
			
			System.out.println("\nPlease enter a command");
			Scanner input = new Scanner(System.in);
			response = input.nextLine().toLowerCase();
			
			switch(response)
			{
			//print libary
			case "p":
				String confused = myLib.toString();
				System.out.println(confused + "Test");
				break;
				
			//add book
			case "a":
				System.out.println("Title: ");
				response = input.nextLine();
				String title = response;
				
				System.out.println("Author: ");
				response = input.nextLine();
				String author = response;
				
				System.out.println("Genre: ");
				response = input.nextLine();
				String genre = response;
				
				System.out.println("Filename: ");
				response = input.nextLine();
				String filename = response;
				
				Book newBook = new Book(title, author, genre, filename);
				
				System.out.println("\n" + title + " added to libary\n");
				//System.out.println(newBook.toString());
				
				break;
			
			//delete book
			case "d":
				System.out.println("What is the index of the book: ");
				int index = input.nextInt();
				myLib.removeBook(index);
				System.out.println("Book deleted");
				break;
				
			//read book
			case "r":
				System.out.println("What is the index of the book: ");
				index = input.nextInt();
				
				break;
				
			//quit	
			case "q":
				System.out.println("goodbye!");
				quit = true;
				break;
				
			default:
				System.out.println("Invald selection");
					
			}
		}
		
	}
}
