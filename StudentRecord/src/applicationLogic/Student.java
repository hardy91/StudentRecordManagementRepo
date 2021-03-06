package applicationLogic;

import java.io.Serializable;

public class Student implements Serializable {
	/*
	 * http://stackoverflow.com/questions/18111717/syntax-of-serializing-a-linkedlistobject
	 */
	private String regNo;
	private String name;
	private String cls;
	private double phy;
	private double chem;
	private double maths;

	public static final long serialVersionUID = 42L;

	// Constructor
	public Student(String RegNo, String Name, String Cls, double Phy,
			double Chem, double Maths) {
		// initializing
		this.regNo = RegNo;
		name = Name;
		cls = Cls;
		phy = Phy;
		chem = Chem;
		maths = Maths;
	}

	// below are the Getter and Setters to access
	// to the above variables

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcls() {
		return cls;
	}

	public void setcls(String class1) {
		cls = class1;
	}

	public double getPhy() {
		return phy;
	}

	public void setPhy(double phy) {
		this.phy = phy;
	}

	public double getChem() {
		return chem;
	}

	public void setChem(double chem) {
		this.chem = chem;
	}

	public double getMaths() {
		return maths;
	}

	public void setMaths(double maths) {
		this.maths = maths;
	}


}
