/*Parameterized Constructor (Accepting data because of formal arguments)*/

class ParaConst
{
	ParaConst(String name, String branch, String yop)
	{
		super();
		this.name = name;
		this.branch = branch;
		this.yop = yop;
	}
	String name;
	String branch;
	String yop;

	void displayStudent()
	{
		System.out.println("Name: "+name);
		System.out.println("Branch: "+branch);
		System.out.println("Year of Passing: "+yop);
	}
}
class ParameterizedConstructor
{
	public static void main(String[] args) {
		ParaConst obj=new ParaConst("Pruthviraj","CSE","2023");
		obj.displayStudent();
	}
}


/*output: Name: Pruthviraj
		Branch: CSE
Year of Passing: 2023*/
