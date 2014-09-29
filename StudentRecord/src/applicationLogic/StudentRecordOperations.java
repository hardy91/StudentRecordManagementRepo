package applicationLogic;
import userInterface.*;

import java.util.Iterator;
import java.util.LinkedList;

public class StudentRecordOperations {
	public  LinkedList<Student> nameSortedRecord = new LinkedList<Student>();
	Student tempStu = new Student(null,null,null,0,0,0);
	
	
	/**
	* insert the record in the linked list
	* @param record
	* @return true on success else false
	*/
	public boolean insertRecord (int i , Student Stu )
	{
		Main.studentRecord.add(i,Stu);
		
		/* branch 'master' of https://github.com/hardy91/StudentRecordManagementRepo.git
		*/
		return true ;
	
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
		if(i > Main.studentRecord.size())
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
	public boolean updateRecord(String regNo, Student newRecord)
	{	
		int i=0;
		
		for(; !(Main.studentRecord.get(i).getRegNo() .equals(regNo)) && i<= Main.studentRecord.size();i++);
		
		if(i > Main.studentRecord.size())
		{
			Main.studentRecord.get(i).equals(newRecord);
			return true;
		}
		else
		{
			return false;
		}
		
	}
	/**
	* search the record corresponding the given regNo
	* @param RegNo
	* @return student record
	*/
	public Student searchRecord(String regNoObj)
	{
		
		Student Stu =new Student(null,null,null,0,0,0);
	int i=0;
	for(; !(Main.studentRecord.get(i).getRegNo().equals(regNoObj)) && i<= Main.studentRecord.size();i++);
	
		Stu = Main.studentRecord.get(i);
		 return Stu;
	
	

	}	
	/**
	* search the record corresponding to the given
	* and return the record
	* @param Name
	* @return student record
	*/
	public Student searchRecordbyName(String Name)
	{
		int i=0;
		for(; !(Main.studentRecord.get(i).getRegNo().equals(Name)) && i<= Main.studentRecord.size();i++);
		
			return Main.studentRecord.get(i);
		
	}
	
	public LinkedList<Student> sortedRecordName(LinkedList<Student> Record)
	{
		for (Iterator iterator = Record.iterator(); iterator.hasNext();) {
			Student student = (Student) iterator.next();
			
		}
			if () {
				
			} else {

			}
			
		}
		
		return nameSortedRecord;
	}
}

