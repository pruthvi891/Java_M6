  
class Animal
{
    public void bark()
    {
        System.out.println("Animal is barking");
    }
}
class Dog extends Animal
{
    public void bark()
    {
        System.out.println("Dog is barking");
    }
    public void m2()
    {
        System.out.println("hello");
    }
    
}
public class UpcastingDowncasting
{
    public static void main(String [] args)
    {
        Dog d=new Dog();
        d.bark();
        Animal c=new Dog(); //upcasting 
        Dog c1=(Dog)c; //downcasting
        c1.m2();
        c.bark();
      
    }
}
