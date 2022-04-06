package interfaces;
import classes.*;
public interface BookOperations
{
	void insertBook(Book b);
	void removeBook(Book b);
	Book getBook(String bkISBN);
	void showAllBooks();
}