class OddEven {
  public static void main(String[] args) {
    int a=2799;
    int odd=0;
    int even = 0;
    do {
      int r = a % 10;
      if (r % 2 == 0) {
        even ++;
      } else {
        odd++;
      }
      a = a / 10;
    }while(a>0);
    System.out.println("odd "+odd+" odd "+even);

  }
}
