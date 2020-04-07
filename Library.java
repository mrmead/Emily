import java.util.ArrayList;

public class Library implements LibraryInterface{
	
	private ArrayList<Book> books;

	
	public Library()
	{
		books = new ArrayList<Book>();
	}
	
	@Override
	public ArrayList<Book> getBooks() {
		// TODO Auto-generated method stub
		ArrayList<Book> copy = new ArrayList<Book>();
		for (Book t: this.books)
		{
			copy.add(t);
		}
		return copy;
	}

	@Override
	public void addBook(Book newBook) {
		this.books.add(newBook);
	}

	
	
	@Override
	public void removeBook(int index) {
		// TODO Auto-generated method stub
		if (index >= 0 && index < books.size())
		{
			books.remove(index);
		}
		else
		{
			System.out.println("Sorry that index does not exist. Try again");
		}
	}

	
	
	@Override
	public Book getBook(int index) {
		// TODO Auto-generated method stub
		if(index >= 0 && index < books.size())
		{
			Book placeholder = books.get(index);
			return placeholder;
		}
		else
		{
			return null;
	
		}
	}
	
	public String toString()
	{
		String output = "";
		for (Book b: books)
		{
			output += b.toString() + "\n";
		}
		return output;
	}

}
