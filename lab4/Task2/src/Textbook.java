
public class Textbook {
	private String isbn, title, author;
	
	Textbook(){}
	
	Textbook(String isbn, String title, String author)
	{
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}
	
	public String getIsbn()
	{
		return isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public String toString()
	{
		return "Book " + title + " by " + author + " with isbn " + isbn;
	}
	
	public boolean equals(Object o)
	{
		if(this == o)
			return true;
		if(this.getClass() != o.getClass())
			return false;
		
		return this.toString().equals(o.toString());
	}
}