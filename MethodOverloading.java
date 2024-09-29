class Sum
{
    public int add(int a, int b)
    {
        System.out.println("addition of a "+a+" and b "+b+" is: ");
        return (a+b);

    }
    public String add(String a, String b)
    {
        System.out.println("addition of String a and b is :");
        return (a+b);
    }

    public void add()
    {
        String msg = "Hello from method overloading";
        System.out.println(msg);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Sum ad=new Sum();
        int intResult = ad.add(10,20);
        System.out.println(intResult);
        String strResult = ad.add("pavan","patole");
        System.out.println(strResult);
        
        ad.add();
    }
}

/*OUTPUT:
addition of a 10 and b 20 is: 
30
addition of String a and b is :
pavanpatole
Hello from method overloading
*/
