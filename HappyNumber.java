       /*Java program for HappyNumber!*/
class HappyNumber{
public static void main( String [] args{

        int a=400;
        int sum=0;
        ab: while (a>9 || sum >9)
        {
            if (a==0)
            {
                a=sum;
                sum=0;
            }
            ac: while (a>0){
                int rem = a%10;
                sum = (rem * rem)+sum;
                a=a/10;

            }
        }

        if (sum == 1 || a == 1)
        {
            System.out.println("HappyNumber!");
        }
        else
        {
            System.out.println("Not HappyNumber!");
        }


    }
}
