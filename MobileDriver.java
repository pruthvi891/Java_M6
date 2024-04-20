/* A java program for Constructor and why constructor is must to be used*/
class Mobile
{
    String brand;
    String model;
    int ram;
    int rom;
    double price;

    Mobile(String brand, String model, int ram, int rom, double price)
    {
        this.brand = brand;
        this. model = model;
        this.ram = ram;
        this.rom = rom;
        this.price = price;
    }
    void displayMobile()
    {
        System.out.println("*** Mobile Details ***");
        System.out.println("Brand : "+brand);
        System.out.println("Model : "+model);
        System.out.println("RAM : "+ram);
        System.out.println("ROM : "+rom);
        System.out.println("Price : "+price);
    }

}
public class MobileDriver
{
    public static void main(String[] args) {
        Mobile ob1 = new Mobile("Samsung","S23 Ultra",12,256,120000);
        ob1.displayMobile();
System.out.println();
 	Mobile ob2 = new Mobile("Nokia","N3310",2,4,2000);
        ob2.displayMobile();

    }
}
