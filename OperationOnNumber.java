import java.util.Scanner;

class OperationOnNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to perform Operation on that:\n");
        int num = sc.nextInt();
        System.out.println("Enter your Operation you want:");
        System.out.println("1. Even or Odd");
        System.out.println("2. Check the Buzz Number:");
        System.out.println("3. Positive or Negative");
        System.out.println("4. Two digit number or not");
        int switch_num = sc.nextInt();

        switch (switch_num) {
            case 1:
                System.out.println("Even or Odd Operation");
                if (num % 2 == 0) {
                    System.out.println("Hey! it's even One!");
                } else {
                    {
                        System.out.println("Hey! it's odd One!");
                    }
                }
                break;

            case 2:
                System.out.println("Checking the Buzz Number or not");

                if (num % 7 == 0 || num % 10 == 7) {
                    System.out.println("Hey! it's Buzz Number!");
                } else {
                    {
                        System.out.println("Hey! it's not Buzz Number!");
                    }
                }
                break;

            case 3:
                System.out.println("Checking Number is Positive or Negative");
                if (num >= 0) {
                    System.out.println("Hey! it's Positive One!");
                } else {
                    {
                        System.out.println("Hey! it's Negative One!");
                    }
                }
                break;

            case 4:
                System.out.println("Checking Number Two digit number or not");
                if (num >= 10 && num <= 99) {
                    System.out.println("Hey! it's Two digit!");
                } else {
                    {
                        System.out.println("Hey! it's not a two digit number!");
                    }
                }
                break;

            default:
                System.out.println("Please Enter Correct Input!");


        }

    }
}
