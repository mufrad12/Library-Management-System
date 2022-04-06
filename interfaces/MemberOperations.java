package interfaces;
import classes.*;
public interface MemberOperations
{
	void insertMember(Member m);
	void removeMember(Member m);
	Member getMember(String memId);
	void showAllMembers();
}