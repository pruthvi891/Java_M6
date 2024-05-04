import java.util.*;
class ProgrammingLanguage{
	String type;
	String level;
	int inventedYear;
	String founderName;
	double latestVersion;
	String extention;
ProgrammingLanguage(String type,String level, int inventedYear, String founderName, double latestVersion, String extention)
{
	super();
	this.type = type;
	this.level = level;
	this.inventedYear = inventedYear;
	this.founderName = founderName;
	this.latestVersion = latestVersion;
	this.extention  = extention;

}
public void displayProgrammingLanguage()
{
	System.out.println();
	System.out.println("**Programming Language**");
	System.out.println("Type: "+this.type);
	System.out.println("level: "+this.level);
	System.out.println("Invented Year: "+this.inventedYear);
	System.out.println("Founder Name: "+this.founderName);
	System.out.println("Latest Version is: "+this.latestVersion);
	System.out.println("extention of Language: "+this.extention);
	System.out.println();

}
}
class Java extends ProgrammingLanguage{
	String [] features;
	boolean plateformIndependent;
	Java(String [] features, boolean plateformIndependent, String type,String level, int inventedYear, String founderName, double latestVersion, String extention)
	{
		super( type, level,  inventedYear,  founderName,  latestVersion,  extention);
		this.features = features;
		this.plateformIndependent = plateformIndependent;
	}
	public void displayJava()
	{
		System.out.println("***Java***");
		System.out.println("Is it  plateform Independent: "+this.plateformIndependent);
		System.out.println("features of Java: "+Arrays.toString(this.features));
	}
}
class Single_Inheritence
{
	public static void main(String[] args) {
		String [] features = {"1. multiTrhreading","2. Secure and Robust","3. Portable","4. Dynamic"};
		Java obj=new Java(features,true,"Object Oriented","High Level",1991,"James Goasling",1.8, ".java");
		obj.displayProgrammingLanguage();
		obj.displayJava();
	}
}
/*
Output:

**Programming Language**
Type: Object Oriented
level: High Level
Invented Year: 1991
Founder Name: James Goasling
Latest Version is: 1.8
extention of Language: .java

***Java***
Is it  plateform Independent: true
features of Java: [1. multiTrhreading, 2. Secure and Robust, 3. Portable, 4. Dynamic]
  */


