/* Java Program for Copy Constructor with value updation*/
class Marker{
    String brand;
    String type;
    boolean refillable;
    double price;
    String color;

    Marker(String brand, String type, boolean refillable, double price, String color) {
        this.brand = brand;
        this.type = type;
        this.refillable = refillable;
        this.price = price;
        this.color = color;
    }

    Marker(Marker obj) {
        this.brand = obj.brand;
        this.type = obj.type;
        this.refillable = obj.refillable;
        this.price = obj.price;
        this.color = obj.color;
        System.out.println("Marker Created!");
    }

    void displayMarker() {
        System.out.println();
        System.out.println("Brand: " + this.brand);
        System.out.println("Type: " + this.type);
        System.out.println("Refillable: " + this.refillable);
        System.out.println("Price: " + this.price);
        System.out.println("Color: " + this.color);
        System.out.println();
    }
}

class CopyConstructor {
    public static void main(String[] args) {
        Marker obj = new Marker("Camlin", "White Board Marker", true, 30, "Black"); 
        obj.displayMarker();

        Marker obj1 = new Marker(obj);
        obj1.color="Green";
        obj1.price=35;
        obj1.displayMarker();

        Marker obj3 = new Marker(obj);
        obj3.color="Red";
        obj3.price=25;
        obj3.displayMarker(); 
    }
}

/*
Output: 

Brand: Camlin
Type: White Board Marker
Refillable: true
Price: 30.0
Color: Black

Marker Created!

Brand: Camlin
Type: White Board Marker
Refillable: true
Price: 35.0
Color: Green

Marker Created!

Brand: Camlin
Type: White Board Marker
Refillable: true
Price: 25.0
Color: Red
*/
