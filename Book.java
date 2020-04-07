import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Book implements BookInterface
{
	/**Instance variables
		title
		author
		genre
		filename
	**/
	
	private String title;
	private String author;
	private String genre;
	private String filename;
	
	//make constructors
	public Book(String title, String author)
	{
		 this.author = author;
		 this.title = title;
		 this.genre = null;
		 this.filename = null;
				
		 
	}
	
	public Book(String title, String author, String genre, String filename)
	{
		 this.author = author;
		 this.title = title;
		 this.genre = genre;
		 this.filename = filename;
				
		 
	}
	
	/**public String getText()
	{
		String hello = "sup";
		return hello;
	}
	
	*/
	public String toString()
	{
		/**
		 * Title: title
		 * Author: author
		 * Genre: genre
		 * 
		 */
		String output = "Title: " + this.title + "\nAuthor: " + this.author + "\nGenre: " + this.genre + "\nFilename: " + this.filename;
		return output;
	}
	
	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getAuthor() {
		return author;
	}

	@Override
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String getGenre() {
		return genre;
	}

	@Override
	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String getFilename() {
		return filename;
	}

	@Override
	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Override
	public boolean isValid() {
		if (filename != null)
		{
			File file = new File(filename);
			
			if (title != null && author != null && genre != null && file.exists())
			{
				return true;
			}
		}
		return false;
	}
	@Override
	public String getText() {
		// TODO Auto-generated method stub
		File fileOne = new File(filename);
		String text = "";
		if(fileOne.canRead() && fileOne.exists())
		{
			try
			{
				Scanner fileRead = new Scanner(fileOne);
				fileRead.useDelimiter("\n");
				
				while(fileRead.hasNext())
				{
					String line = fileRead.nextLine();
					//Scanner lineS = new Scanner(line);
					text += line +"\n";
				}
				fileRead.close();
				return text;
			}
			catch (FileNotFoundException e)
			{
				text += "File not found";
			}	
		}
		else
		{
			return "File not found";
		}
		return text;
	}

}

