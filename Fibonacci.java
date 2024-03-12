//Java program for Factorial number
class Fibonacci{
public static void main(String [] args){

int num=5;
int i=1;
int fact=1;

while(i <= num)
{
 fact = fact * i;

i++;
}
System.out.println("Fact of "+num+ " is "+fact);

}
}
