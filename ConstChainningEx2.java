/* Java program for Constructor Chainning using Parent Child Relationship*/

class Father
{
	Father()
	{
		super(); // used to call object class Constructor
		System.out.println("Hi from father no argument");

	}
}

class Son extends Father
{
	Son()
	{
		super(); // used to call parent class(Father class) Constructor
		System.out.println("Hi from Son no argument");
	}
}
class ConstChainningEx2{
	public static void main(String[] args) {
		Son Object= new Son();
	}
}

/*Output:

Hi from father no argument
Hi from Son no argument
*/
