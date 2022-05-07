/* Q8.Write program to calculate power of number (a raise to b) using while & for loop*/
class PowerOfNum {
  public static void main(String[] args) {

    int base = 3, exponent = 4;

    long result = 1;

    for (; exponent != 0; --exponent) {
      result *= base;
    }

    System.out.println("Answer = " + result);
  }
}