package databaseAccess;
import userInterface.Main;
import applicationLogic.*;
public class LoadData  implements java.io.Serializable{
	
	public static final long serialVersionUID = 42L;
	applicationLogic.Student Stu = new Student(null,null,null,0,0,0);
	 
	/**
	 * load the data from the file to the linked list declared in Main.java
	 * 
	 * @param databasepath
	 * @return true on success else false
	 */
	public boolean loadData(String databasepath) {
		java.io.ObjectIntputStream ;
		//testing
	}
}