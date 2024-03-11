class whilePrimeNumber{
public static void main(String [] args){

int i=2;
int num=5;
int c=0;

while(i < num)
{
if(num % 2 ==0)
{
c++;
}
i++;
}


if(c == 0)
{
System.out.println("Prime Number:");
}
else
{
System.out.println("Not a Prime Number:");
}

}
}
