package applicationLogic;
import userInterface.*;
import java.util.LinkedList;

public class StudentRecordOperations {
	
	
	
	/**
	* insert the record in the linked list
	* @param record
	* @return true on success else false
	*/
	public boolean insertRecord (int i , Student Stu )
	{ boolean n;
		Main.studentRecord.add(i,Stu) ;
		return n;
	
	}
	/**
	* search the record in the linked list
	* delete the found record in the linked list
	* @param regNo
	* @return true on success else false
	*/
	
	public boolean deleteRecord(String regNoObj)
	{
		int i=0;
		
		while((!Main.studentRecord.get(i).getRegNo().equals(regNoObj))&& i<=Main.studentRecord.size())
		{
			i++;
		}
		if((!Main.studentRecord.get(i).getRegNo().equals(regNoObj)))
		{
			Main.studentRecord.remove(i);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	
	/**
	* search the record in the linked list
	* update the values to the new record values
	* @param regNo
	* @param newRecord
	* @return true on success else false
	*/
	public boolean updateRecord(String regNoObj, Student newRecord)
	{
		for(int i=0;studentRecord.get(i)!= regNoObj && i<=studentRecord.size();i++);
	}
	/**
	* search the record corresponding the given regNo
	* @param RegNo
	* @return student record
	*/
	public Student searchRecord(String regNoObj)
	{for(int i=0;studentRecord.get(i)!= regNoObj&& i<=studentRecord.size();i++);
	}
	/**
	* search the record corresponding to the given
	* and return the record
	* @param Name
	* @return student record
	*/
	public Student searchRecordbyName(String Name)
	{for(int i=0;studentRecord.get(i)!= regNoObj&& i<=studentRecord.size();i++);
	}
}