import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    numHandler numcount = new numHandler();
    //System.out.println("Hello world!");
    //System.out.println(numcount.countFactors(24));
    //System.out.println(numcount.countFactors(27));
    //System.out.println(numcount.isPrime(27));
    //System.out.println(numcount.isPrime(47));
    //System.out.println(isPrime(24));
    //System.out.println(numcount.countPrimes(24));
    //System.out.println(numcount.countPrimes(100));
    //System.out.println(numcount.countPrimes(1000000, 1000));
    //System.out.println(numcount.countPrimesEff(1000000, 1000));
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a Number");
    int num = input.nextInt();
    input.close();
    System.out.println("Factors of " + num + ": " + numcount.countFactors(num));
    boolean isPrime = numcount.isPrime(num);
    System.out.println("Is " + num + " prime? " + isPrime);
    System.out.println("Prime Factors between 2 and " + num + ": " + numcount.countPrimes(num).get("primeNumbers"));

    
  }
  

}

