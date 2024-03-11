class EvenNumberInGivenNumber
{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);

System.out.println("Enter the Number:");
int num=sc.nextInt();



do{
int rem = num%10;
if(rem%2 == 0)
{
System.out.println("Even No's: "+rem);
}
num = num/ 10;
}while(num>0);
}

}
