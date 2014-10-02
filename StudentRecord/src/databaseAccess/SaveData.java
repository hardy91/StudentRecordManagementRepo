package databaseAccess;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.OpenOption;
import java.util.LinkedList;

import applicationLogic.Student;

public class SaveData {
	/**
	 * save data from linked list to the file
	 * 
	 * @param databasepath
	 * @return true on success else false
	 */
	public static void saveData(LinkedList<Student> record ,String path) {
		try {
				
			
		
			File f = new File(path);
			f.mkdirs(); 
			f.createNewFile(); 
			FileOutputStream fos = new FileOutputStream("keep.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(record);
			fos.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}