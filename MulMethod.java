/* A java program for how the non static and static method will be work 

class MulMethod
{

public static void main(String [] args)
{

System.out.println("Hi i am from main()");
DemoEx obj=new DemoEx();
obj.m1();
Demo1 obj2=new Demo1();
obj2.m3();
}


public void m1()
{
Demo1 obj=new Demo1();
System.out.println("Hello i am from m1()");
obj.m2();
}
}


class Method
{

public void m2()
{
System.out.println("Hello from m2()");
m3();
}



public void m3()
{
System.out.println("Hi i am from m3()");
}
}
