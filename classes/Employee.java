package  classes;
import java.lang.*;

public class Employee
{
	private String empId;
	private String empName;
	private String empMail;
	
	public void setEmpId(String empId)
	{
		this.empId = empId;
	}
	
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public void setEmpEmail(String empMail)
	{
		this.empMail = empMail;
	}
	
	public String getEmpId()
	{
		return empId;
	} 
	public String getEmpName()
	{
		return empName;
	}
	public String  getEmpEmail()
	{
		return empMail;
	} 
}