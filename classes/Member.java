package  classes;
import java.lang.*;

public class Member
{
	private String memId;
	private String memName;
	private String memMail;
	
	public void setMemId(String memId)
	{
		this.memId = memId;
	}
	
	public void setMemName(String memName)
	{
		this.memName = memName;
	}
	public void setMemEmail(String memMail)
	{
		this.memMail = memMail;
	}
	
	public String getMemId()
	{
		return memId;
	} 
	public String getMemName()
	{
		return memName;
	}
	public String  getMemEmail()
	{
		return memMail;
	} 
}