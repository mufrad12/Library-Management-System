import java.lang.*;
import java.util.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Library l = new Library();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("\n-----Welcome to the Library Management-----\n");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("Which option do you want to use?\n");
			System.out.println("	1. Employee Management");
			System.out.println("	2. Member Management");
			System.out.println("	3. Book Management");
			System.out.println("	4. Exit\n");

			System.out.print("Your input option is : ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
				
					System.out.println("---------------------------------------");
					System.out.println("You have choosen Employee Management.\n");
					
					System.out.println("Choose any one Option from the followings : \n");
					System.out.println("	1. Insert New Employee");
					System.out.println("	2. Search an Employee");
					System.out.println("	3. Removing an Existing Employee");
					System.out.println("	4. Show All Employees");
					System.out.println("	5. Go Back\n");
					
					System.out.print("Your Option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						
							System.out.println("---------------------------------------");
							System.out.println("Insert New Employee =");
							
							System.out.print("Enter Employee ID : ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name : ");
							String empName1 = sc.next();
							System.out.print("Enter Employee Mail : ");
							String empMail1 = sc.next();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setEmpName(empName1);
							e1.setEmpEmail(empMail1);
							
							l.insertEmployee(e1);
							
							break;
							
						case 2:
						
							System.out.println("Search An Employee =");
							
							System.out.print("Enter Employee ID : ");
							String empId2 = sc.next();
							
							Employee e2 = l.getEmployee(empId2);
							
							if(e2 !=null)
							{
								System.out.println();
								System.out.println("Employee ID is: "+e2.getEmpId());
								System.out.println("Employee Name is : "+e2.getEmpName());
								System.out.println("Employee Mail is : "+e2.getEmpEmail());
								System.out.println();
							}
							
							
							break;
							
						case 3:
						
							
							System.out.println("Remove an Existing Employee =");
							
							System.out.print("Enter Employee ID : ");
							String empId3 = sc.next();
							
							Employee e3 = l.getEmployee(empId3);
							
							if(e3 != null)
							{
								l.removeEmployee(e3);
							}
							
							break;
							
						case 4:
						
							
							System.out.println("Show All Employees =");
							l.showAllEmployees();
							
							break;
							
						case 5:
						
							System.out.println("Going Back");
							
							break;
							
						default:
					
							System.out.println("Invalid Option");
							break;
					}
					
					System.out.println("---------------------------------------");
					break;
					
				case 2:
				
					System.out.println("---------------------------------------");
					System.out.println("You have choosen Member Management");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert New Member");
					System.out.println("	2. Search a Member");
					System.out.println("	3. Removing an Existing Member");
					System.out.println("	4. Show All Members");
					System.out.println("	5. Go Back\n");
					
					System.out.print("Your Option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
					
							System.out.println("Insert New Member");
							
							System.out.print("Enter Member ID : ");
							String memId1 = sc.next();
							System.out.print("Enter Member Name : ");
							String memName1 = sc.next();
							System.out.print("Enter Member Mail : ");
							String memMail1 = sc.next();
							
							
							Member m1 = new Member();
							m1.setMemId(memId1);
							m1.setMemName(memName1);
							m1.setMemEmail(memMail1);
						
							l.insertMember(m1);

							break;
							
						case 2:

							System.out.println("Search A Member =");
							
							System.out.print("Enter Member ID : ");
							String memId2 = sc.next();
							
							Member m2 = l.getMember(memId2);
							
							if(m2 !=null)
							{
								System.out.println();
								System.out.println("Member ID : "+m2.getMemId());
								System.out.println("Member Name : "+m2.getMemName());
								System.out.println("Member Email : "+m2.getMemEmail());
								System.out.println();
							}

							break;
							
						case 3:

							System.out.println("Remove an Existing Member");
							
							System.out.print("Enter Member ID: ");
							String memId3 = sc.next();
							
							Member m3 = l.getMember(memId3);
							
							if(m3 != null)
							{
								l.removeMember(m3);
							}

							break;
							
						case 4:

							System.out.println("Show All Member = ");
							l.showAllMembers();
							break;
							
						case 5:
						
							System.out.println("Going Back");
							
							break;
							
						default:

							System.out.println("Invalid Option");
							break;
					}
					System.out.println("---------------------------------------");
					break;
					
					case 3:
				
					System.out.println("---------------------------------------");
					System.out.println("You have choosen Book Management");
					
					System.out.println("Choose any one Option from the followings:\n");
					System.out.println("	1. Insert New Book");
					System.out.println("	2. Search a Book");
					System.out.println("	3. Removing an Existing Book");
					System.out.println("	4. Show All Books");
					System.out.println("	5. Go Back\n");
					
					System.out.print("Your Option : ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
						
							System.out.println("Insert New Book");
							
							System.out.print("Enter Book ISBN : ");
							String bookISBN1 = sc.next();
							System.out.print("Enter Book Title : ");
							String bookTitle1 = sc.next();
							System.out.print("Enter Book Publisher Name : ");
							String bookPublisher1 = sc.next();
							
							
							Book b1 = new Book();
							b1.setBookISBN(bookISBN1);
							b1.setBookTitle(bookTitle1);
							b1.setBookPublisher(bookPublisher1);
						
							l.insertBook(b1);

							break;
							
						case 2:

							System.out.println("Search A Book");
							
							System.out.print("Enter Book ISBN : ");
							String bookISBN2 = sc.next();
							
							Book b2 = l.getBook(bookISBN2);
							
							if(b2 !=null)
							{
								System.out.println();
								System.out.println("Book ISBN : "+b2.getBookISBN());
								System.out.println("Book Title : "+b2.getBookTitle());
								System.out.println("Book Publisher : "+b2.getBookPublisher());
								System.out.println();
							}

							break;
							
						case 3:

							System.out.println("Remove an Existing Book");
							
							System.out.print("Enter Book ISBN: ");
							String bookISBN3 = sc.next();
							
							Book b3 = l.getBook(bookISBN3);
							
							if(b3 != null)
							{
								l.removeBook(b3);
							}
							break;
							
						case 4:

							System.out.println("Show All Books = ");
							l.showAllBooks();
							break;
							
						case 5:
						
							System.out.println("Going Back");
							break;
							
						default:
						
							System.out.println("Invalid Option");

							break;
					}
					
					
					System.out.println("---------------------------------------");
					break;
					
					case 4:
				
					System.out.println("---------------------------------------");
					System.out.println("You have choosen to Exit");
					repeat = false;
					System.out.println("---------------------------------------");
					break;
					
				default:
				
					System.out.println("---------------------------------------");
					System.out.println("Invalid Choice");
					System.out.println("---------------------------------------");
					break;
					
				
			}
			
			
		}
		
		
	}
}