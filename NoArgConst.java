class NoArgConst
{
	NoArgConst()
	{
	System.out.println("Hello from no arg const");
}

private NoArgConst1(int a)
{
	System.out.println("Hello from 1 arg");
}
protected NoArgConst(int a, int b)
{
	System.out.println("Hello from 2 arg");
}
public NoArgConst(int a, int b, int c)
{
	System.out.println("Hello from 3 arg");
}
public static void main(String[] args) {
	NoArgConst obj1=new NoArgConst();
	NoArgConst obj2= new NoArgConst(10);
	NoArgConst obj3=new NoArgConst(10,20);
	NoArgConst obj4=new NoArgConst(10,20,30);
}
}

/*
Output - 

Hello from no arg
Hello from 1 arg
Hello from 2 arg
Hello from 3 arg
*/
