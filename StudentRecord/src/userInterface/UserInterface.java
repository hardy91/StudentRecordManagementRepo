package userInterface;

import java.util.LinkedList;
import java.util.Scanner;

import applicationLogic.Student;
import applicationLogic.StudentRecordOperations;

public class UserInterface {
	// here declare the objects of student class and studentRecordOperation
	// class
	// so that you can access the functions inside these classes
	public void interactWithUser() {
		// scanner is used to take input from the user
		Scanner scan = new Scanner(System.in);
		String choice = null, regNo = null, name = null, cls = null;
		double phy = 0, chem = 0, maths = 0;
		boolean bool;
		StudentRecordOperations StReOpObj = new StudentRecordOperations();
		Student Stu = new Student(regNo, name, cls, phy, chem, maths);
		LinkedList<Student> recordObj = new LinkedList<Student>();
		do {
			System.out.println("Select your choice:");
			System.out.println("1. Insert a record");
			System.out.println("2. Delete a record");
			System.out.println("3. Update a record");
			System.out.println("4. Search by registration number");
			System.out.println("5. Search by name");
			System.out.println("6. Display all records(sorted by names)");
			System.out.println("7. Quit");
			System.out.print("Enter your choice: ");
			// get choice from the user
			choice = scan.next();
			switch (choice) {
			case "1": {
				int i;

				System.out
						.println("where you want to insert record  ..the index!");
				i = scan.nextInt();

				System.out.println("enter registration number");
				regNo = scan.next();

				System.out.println("enter name");
				name = scan.next();

				System.out.println("enter class");
				cls = scan.next();

				System.out.println("enter physics marks");
				phy = scan.nextDouble();

				System.out.println("enter chem marks");
				chem = scan.nextDouble();

				System.out.println("enter maths marks");
				maths = scan.nextDouble();

				StReOpObj.insertRecord(i, Stu);
				// write the code to call functions to insert a record
				// into a linked list
				break;
			}
			case "2": {
				System.out
						.println("enter registration number to delete record");
				regNo = scan.next();
				bool = StReOpObj.deleteRecord(regNo);

				if (bool) {
					System.out.println("record deleted");

				} else {
					System.out.println("record not found");
				}
				// write code to call functions to delete a record
				// from a linked list
				break;
			}
			case "3": {

				System.out
						.println("which record you want to update  ..the registration number!");
				regNo = scan.next();

				System.out.println("enter name");
				name = scan.next();

				System.out.println("enter class");
				cls = scan.next();

				System.out.println("enter physics marks");
				phy = scan.nextDouble();

				System.out.println("enter chem marks");
				chem = scan.nextDouble();

				System.out.println("enter maths marks");
				maths = scan.nextDouble();

				bool = StReOpObj.updateRecord(regNo, Stu);

				if (bool) {
					System.out.println("record updated");

				} else {
					System.out.println("no record found to updated");
				}
				// write code to call functions to update a record
				// in the linked list
				break;
			}
			case "4": {
				System.out
						.println("enter registration number of record wich you want to search");
				regNo = scan.next();
				Stu = StReOpObj.searchRecord(regNo);

				System.out.println("regNo = ");
				System.out.print(Stu.getRegNo());

				System.out.println("name = ");
				System.out.print(Stu.getName());

				System.out.println("cls = ");
				System.out.print(Stu.getcls());

				System.out.println("phy marks = ");
				System.out.print(Stu.getPhy());

				System.out.println("chem marks = ");
				System.out.print(Stu.getChem());

				System.out.println("maths marks = ");
				System.out.print(Stu.getMaths());

				// write code to call functions to search a record
				// in the linked list using given registration number
				break;
			}
			case "5": {
				System.out
						.println("enter name of record which you want to search");
				regNo = scan.next();
				StReOpObj.searchRecordbyName(name).equals(Stu);

				System.out.println("regNo = ");
				System.out.print(Stu.getRegNo());

				System.out.println("name = ");
				System.out.print(Stu.getName());

				System.out.println("cls = ");
				System.out.print(Stu.getcls());

				System.out.println("phy marks = ");
				System.out.print(Stu.getPhy());

				System.out.println("chem marks = ");
				System.out.print(Stu.getChem());

				System.out.println("maths marks = ");
				System.out.print(Stu.getMaths());

				// write code to call functions to search all the record
				// from the linked list having the given name and
				// display them.
				break;
			}
			case "6": {
				recordObj = StReOpObj.sortedRecordName(Main.studentRecord);

				for (int j = 0; j <= recordObj.size(); j++) {

					System.out.println("\n\nregNo = ");
					System.out.print(recordObj.get(j).getRegNo());

					System.out.println("name = ");
					System.out.print(recordObj.get(j).getName());

					System.out.println("cls = ");
					System.out.print(recordObj.get(j).getcls());

					System.out.println("phy marks = ");
					System.out.print(recordObj.get(j).getPhy());

					System.out.println("chem marks = ");
					System.out.print(recordObj.get(j).getChem());

					System.out.println("maths marks = ");
					System.out.print(recordObj.get(j).getMaths());

				}
				// write code to call functions to display all the records
				// in the linked list ordered by ascending names
				break;
			}
			case "7": {
				// no need to change anything
				System.out.println("****Thanks for using this application****");
				break;
			}
			default: {
				// no need to change anything
				System.out.println("Invalid choice! Try again...");
				break;
			}
			}
		} while (!choice.equals("7"));
		scan.close();
	}
}
