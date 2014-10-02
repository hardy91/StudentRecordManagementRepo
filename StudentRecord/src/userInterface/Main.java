package userInterface;

import databaseAccess.*;

import java.util.LinkedList;

import applicationLogic.Student;

public class Main {

	// one list that shall be used throughout the application
	public static LinkedList<Student> studentRecord = new LinkedList<Student>();

	public static void main(String[] args) {
		
		String path = "C:/Users/john/git/StudentRecordManagementRepo/StudentRecord/src/databaseAccess/keep.txt";
		databaseAccess.LoadData.loadData(path);/*
											 * if we call load data and save
											 * data using name of package then
											 * there is no need to import that
											 * package in top
											 */
		/**
		 * why it is not giving error ..we are calling function without making
		 * object
		 */
		UserInterface ui = new UserInterface();
		ui.interactWithUser();
		SaveData.saveData(studentRecord,path);

	}
}