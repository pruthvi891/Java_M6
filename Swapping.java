import java.util.Scanner;

class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for A:\n");
        int a =10; sc.nextInt();
        System.out.println("Enter the value for B:\n");
        int b =20; sc.nextInt();
        int c=0;

        System.out.println("Swapping A and B");

        c = a;
        a = b;
        b = c;

        System.out.println(a + " is value of A");
        System.out.println(b + " is value of B");

        System.out.println("Without using third variable");

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " is value of A");
        System.out.println(b + " is value of B");
    }
}
