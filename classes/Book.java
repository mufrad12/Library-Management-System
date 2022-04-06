package  classes;
import java.lang.*;

public class Book
{
	private String bkISBN;
	private String bkTitle;
	private String bkPublisher;
	
	public void setBookISBN(String bkISBN)
	{
		this.bkISBN = bkISBN;
	}
	
	public void setBookTitle(String bkTitle)
	{
		this.bkTitle = bkTitle;
	}
	public void setBookPublisher(String bkPublisher)
	{
		this.bkPublisher = bkPublisher;
	}
	
	public String getBookISBN()
	{
		return bkISBN;
	} 
	public String getBookTitle()
	{
		return bkTitle;
	}
	public String  getBookPublisher()
	{
		return bkPublisher;
	} 
}