class EvilNumber{
public sattic void main(String [] args){
int n=36;
        int n1=n;
        int binary =0;
        int b=1;

        while (n > 0) {
            int rem = n % 10;
            binary = binary + (rem * b);
            n = n / 2;
            n = n % 10;
        }
        int c=0;
        while (binary > 0)
        {
            int rem = binary % 10;
            if (rem == 1)
            {
                c++;
            }
            binary = binary / 10;

        }
        if(c % 2 ==0)
        {
            System.out.println("The number "+n1+" is Evil Number!");
        }
        else
        {
            System.out.println("The number "+n1+" is not Evil Number!");
        }

    }
}
