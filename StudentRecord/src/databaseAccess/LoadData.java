package databaseAccess;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import applicationLogic.*;

public class LoadData {

	/**
	 * load the data from the file to the linked list declared in Main.java
	 * 
	 * @param databasepath
	 * @return true on success else false
	 */
	public static LinkedList<Student> loadData() {

		LinkedList<Student> o_userdata = new LinkedList<Student>();
		try {
			FileInputStream fis = new FileInputStream("keep.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			o_userdata = (LinkedList<Student>) obj;
			ois.close();

		} catch (Exception e) {
			System.out.println(e);
		}

		return o_userdata;
	}

}
