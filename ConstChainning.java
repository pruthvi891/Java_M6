/* Java Program for Constructor Chainning*/

class Demo
{
	Demo(){
	System.out.println("No argument Constructor");
	}

	Demo(int a){
		this();
	System.out.println("1 argument Constructor");
	}

	Demo(int a, int b){
		this(10);
	System.out.println("2 arguments Constructor");
	}
	}

	class ConstChainning{
		public static void main(String[] args) {
			Demo Object = new Demo(10,20);

		}
	}

/*
Output:

No argument Constructor
1 argument Constructor
2 arguments Constructor



Example 2: 
ConstructorChainning

*/
class demo 
{
    int a;
    int b;
    int c;
    demo(int a, int b, int c)
    {

        this.a=a;
        this.b=b;
        this.c=c;
    }
    //copy Constructor
    demo(demo d)
    {
      
        this.a=d.a;
        this.b=d.b;
        this.c=d.c;
    }
    void displayDemo()
    {
         System.out.println("Hlo from Display() ----------");
          System.out.println("a: "+a);
                    System.out.println("b: "+b);
                              System.out.println("c: "+c);
    }
}
public class Driver {
    public static void main(String [] args)
    {
        demo d=new demo(10,20,30);
        d.displayDemo();
        
        demo d1=new demo(d);
        d1.b=100;
        d1.displayDemo();
        
        
    }
}


/*
OUTPUT:

Hlo from Display() ----------
a: 10
b: 20
c: 30
Hlo from Display() ----------
a: 10
b: 100
c: 30
*/
