package userInterface;
import java.util.LinkedList;

import applicationLogic.Student;
import applicationLogic.StudentRecordOperations;
public class Main {
	// one list that shall be used throughout the application
	public LinkedList<Student> studentRecord = new LinkedList<Student>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInterface ui = new UserInterface();
		ui.interactWithUser();
		int i;
		System.out.println("1 to Add ,2 to remove ,3 to search ,4 to edit");
		i = System.in.read();
		switch (i) {
		case 1:
			Student newstu= Student();
			
			StudentRecordOperations.insertRecord()
			break;

		default:
			break;
		}
	}
}