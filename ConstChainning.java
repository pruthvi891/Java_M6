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
*/
