class person 
{
    person()
    {
        System.out.println("no arg constructor");
    }
    person(String msg)
    {
        System.out.println("person is walking: "+msg);
    }
    person(String msg, String newMsg)
    {
        System.out.println("person is walking: "+msg+" before : "+newMsg);
    }
}
class ConstOverloading
{
    public static void main(String[] args) {
        person p=new person();
        person p1=new person("Slowly");
        person p2=new person("Slowly","pre-Workout");


    }
}

/*OUTPUT:
no arg constructor
person is walking: Slowly
person is walking: Slowly before : pre-Workout
*/
