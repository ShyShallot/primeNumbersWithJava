import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
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
    //System.out.println(numcount.countPrimes(1000000));
    System.out.println(numcount.countPrimesEff(50000));
  }
  

}

