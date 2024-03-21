public class TenHappyNumber{
    public static void main(String[] args) {

        int a=1;
        int c1=0;
         while (true)
         {
             int b=a;
             int sqr=1;
             int sum=0;

             ac: while (a > 9 || sum > 9)
             {
                 if (a==0)
                 {
                     a=sum;
                     sum=0;

                 }
                 while (a > 0)
                 {
                     int rem = a%10;
                     sqr = rem * rem;
                     sum = sum+sqr;
                     a=a/10;

                 }
             }
             if (sum == 1 || a == 1)
             {
                 System.out.println("Hey!, "+b+" HappyNumber😊");
                 c1++;
                 if (c1 == 10)
                 {
                     break;
                 }
             }
             b++;
             a=b;

         }
    }
}
