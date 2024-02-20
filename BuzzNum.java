class BuzzNum{
    public static void main(String [] args){

        int a=37;
        String result = (a%7==0 || a%10==7)?("Its a Buzz Number."):("this is not a Buzz Number");
        System.out.println(result);
    }
}
