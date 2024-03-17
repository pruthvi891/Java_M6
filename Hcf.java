class Hcf
{
    public static void main(String[] args) {

        int hcf=0;
        int n1=17;
        int n2=7;

        int small = Math.min(n1, n2);

        for (int i=small;i<=small; i++)
        {
            if (n1%i==0 && n2%i == 0)
            {
                hcf=i;

            }
        }

        System.out.println(hcf);
    }
}
