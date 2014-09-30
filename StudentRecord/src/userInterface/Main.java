package userInterface;

import java.util.LinkedList;

import applicationLogic.Student;
import applicationLogic.StudentRecordOperations;

public class Main {

	// one list that shall be used throughout the application
	public static LinkedList<Student> studentRecord = new LinkedList<Student>();

	public static void main(String[] args) {

		UserInterface ui = new UserInterface();
		ui.interactWithUser();

	}
}