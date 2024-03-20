class LcmOfDigit {
    public static void main(String[] args) {
        int a = 6;
        int b = 40;
        int largest = (a > b) ? (a) : (b);
        int v = 1;
        int i = largest;

        while (true) {
            if (largest % a == 0 && largest % b == 0) {
                System.out.println("The LCM of given number is " + largest);
                break;
            }
            largest = i * v;
            v++;

        }

    }
}

 

