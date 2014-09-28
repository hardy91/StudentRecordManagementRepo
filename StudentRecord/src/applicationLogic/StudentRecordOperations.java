package applicationLogic;
import java.util.LinkedList;

import userInterface.Main;
public class StudentRecordOperations {
	
	public static LinkedList<Student> studentRecord = new LinkedList<Student>();
	
	/**
	* insert the record in the linked list
	* @param record
	* @return true on success else false
	*/
	public boolean insertRecord (int i , Student Stu )
	{ boolean n;
		studentRecord.add(i,Stu) ;/*hello*/
		return n;
	
	}
	/**
	* search the record in the linked list
	* delete the found record in the linked list
	* @param regNo
	* @return true on success else false
	*/
	
	public boolean deleteRecord(String regNoObj)
	{for(int i=0; studentRecord.get(i)!= regNoObj && i<=studentRecord.size();i++);
	studentRecord.remove(i);
		}
	
	
	
	
	/**
	* search the record in the linked list
	* update the values to the new record values
	* @param regNo
	* @param newRecord
	* @return true on success else false
	*/
	public boolean updateRecord(String regNoObj, Student newRecord)
	{for(int i=0;studentRecord.get(i)!= regNoObj && i<=studentRecord.size();i++);
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