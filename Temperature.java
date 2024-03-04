import java.util.Scanner;

class Temperature{
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value:\n");
        int ch=sc.nextInt();

        if (ch>0 && ch<=15)
        {
            System.out.println("Very Cool");
        }

        else if (ch>15 && ch<=25)
        {
            System.out.println("Cool");
        }

        else if (ch>25 && ch<=30)
        {
            System.out.println("Medium");
        }

        else if (ch>30 && ch<=40)
        {
            System.out.println("Very Hot");
        }

        else if (ch>40 && ch<=50)
        {
            System.out.println("Extreme");
        }

        else
        {
            System.out.println("Please enter Correct One!");
        }
    }
}
