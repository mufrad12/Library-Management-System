package  classes;
import java.lang.*;
import interfaces.*;

public class Library implements MemberOperations, EmployeeOperations, BookOperations
{
	private Member members[] = new Member [200];
	private Employee employees[] = new Employee [100];
	private Book books[] = new Book [100];
	
	public void insertMember(Member m)
	{
		int flag = 0;
		for(int i=0; i<members.length; i++)
		{
			if(members[i] == null)
			{
				members[i] = m;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("\nMember Inserted");
		}
		else
		{
			System.out.println("\nMember Can Not Insert");
		}
	}
	
	public void removeMember(Member m)
	{
		int flag = 0;
		for(int i=0; i<members.length; i++)
		{
			if(members[i] == m)
			{
				members[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("\nMember Removed");
		}
		else
		{
		System.out.println("\nMember Can Not Remove");
		}
	}
	public void showAllMembers()
	{
		System.out.println("---------------------------------------");
		for(Member m : members)
		{
			if(m != null)
			{
				System.out.println("Members Name: "+ m.getMemName());
				System.out.println("Members ID: "+ m.getMemId());
				System.out.println("Members email: "+ m.getMemEmail());
				System.out.println();
			}
		}
		
	}
	public Member getMember(String memId)
	{
		Member m = null;
		
		for(int i=0; i<members.length; i++)
		{
			if(members[i] != null)
			{
				if(members[i].getMemId().equals(memId))
				{
					m = members[i];
					break;
				}
			}
		}
		if(m != null)
		{
			System.out.println("\nMember Found");
		}
		else
		{
			System.out.println("\nMember Not Found");
		}
		return m;
	}
	 
	 
	
	
	public void insertEmployee(Employee e)
	{
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("\nEmployee Inserted");
		}
		else
		{
			System.out.println("\nEmployee Can Not Insert");
		}
	}
	
	public void removeEmployee(Employee e)
	{
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
		System.out.println("\nEmployee Removed");
		}
		else
		{
		System.out.println("\nEmployee Can Not Remove");
		}
	}
	
	public void showAllEmployees()
	{
		System.out.println("---------------------------------------");
		for(Employee e : employees)
		{
			if(e != null)
			{
				System.out.println("Employee Name: "+ e.getEmpName());
				System.out.println("Employee ID: "+ e.getEmpId());
				System.out.println("Employee Email: "+ e.getEmpEmail());
				System.out.println();
			}
		}
		
	}
	public Employee getEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpId().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		if(e != null)
		{
			System.out.println("\nEmployee Found");
		}
		else
		{
			System.out.println("\nEmployee Not Found");
		}
		return e;
	}
	
	
	
	
	public void insertBook(Book b)
	{
		int flag = 0;
		for(int i=0; i<books.length; i++)
		{
			if(books[i] == null)
			{
				books[i] = b;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("\nBook Inserted");
		}
		else
		{
			System.out.println("\nBook Can Not Insert");
		}
	}
	
	public void removeBook(Book b)
	{
		int flag = 0;
		for(int i=0; i<books.length; i++)
		{
			if(books[i] == b)
			{
				books[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("\nBook Removed");
		}
		else
		{
		System.out.println("\nBook Can Not Remove");
		}
	}
	public void showAllBooks()
	{
		System.out.println("---------------------------------------");
		for(Book b : books)
		{
			if(b != null)
			{
				System.out.println("Book ISBN: "+ b.getBookISBN());
				System.out.println("Book Title: "+ b.getBookTitle());
				System.out.println("Book Publisher: "+ b.getBookPublisher());
				System.out.println();
			}
		}
		
	}
	public Book getBook(String bkISBN)
	{
		Book b = null;
		
		for(int i=0; i<books.length; i++)
		{
			if(books[i] != null)
			{
				if(books[i].getBookISBN().equals(bkISBN))
				{
					b = books[i];
					break;
				}
			}
		}
		if(b != null)
		{
			System.out.println("\nBook Found");
		}
		else
		{
			System.out.println("\nBook Not Found");
		}
		return b;
	}
}