package userInterface;
import java.util.Scanner;
public class UserInterface {
	// here declare the objects of student class and studentRecordOperation class
	// so that you can access the functions inside these classes
	public void interactWithUser()
	{
		// scanner is used to take input from the user
		Scanner scan = new Scanner(System.in);
		String choice = null;
		do
		{
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
			switch(choice)
			{
				case "1":
				{
					// write the code to call functions to insert a record
					// into a linked list
					break;
				}
				case "2":
				{
					// write code to call functions to delete a record
					// from a linked list
					break;
				}
				case "3":
				{
					// write code to call functions to update a record
					// in the linked list
					break;
				}
				case "4":
				{
					// write code to call functions to search a record
					// in the linked list using given registration number
					break;
				}
				case "5":
				{
					// write code to call functions to search all the record
					// from the linked list having the given name and
					// display them.
					break;
				}
				case "6":
				{
					// write code to call functions to display all the records
					// in the linked list ordered by ascending names
					break;
				}
				case "7":
				{
					// no need to change anything
					System.out.println("****Thanks for using this application****");
					break;
				}
				default:
				{
					// no need to change anything
					System.out.println("Invalid choice! Try again...");
					break;
				}
			}
		}while(!choice.equals("7"));
	}
}
