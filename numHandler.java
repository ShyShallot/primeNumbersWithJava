import java.util.HashMap;
public class numHandler{
  public int countFactors(int num){ // check countPrimesEff for comments
    //System.out.println(primeNum);
    int numOfFac = 0;
    int sqrt = (int)Math.sqrt(num)+1;
    for(int i = 1; i<sqrt; i++){
      if(num % i == 0){
        numOfFac += 2;
      }
    }
    //System.out.println(num + " has " + numOfFac + " factors"); 
    return numOfFac;
  }

  public boolean isPrime(int num){
    if(countFactors(num) <= 2){
      return true;
    }
    return false;
  }

  public HashMap<String,Integer> countPrimes(int num){ // check countPrimesEff for comments
    //System.out.println(Arrays.toString(primeNum));
    progressbar progress = new progressbar();
    HashMap<String, Integer> primes = new HashMap<>(); // create a map of all our prime numbers
    long start = System.currentTimeMillis(); // keep track of what time we started the calculation
    int numOfPrimes = 0;
    for(int i = 2;i<num;i++){ // starting from 2 to our input
     // System.out.println("Checking if " + i + " is Prime");
      if(isPrime(i)){
        //System.out.println(i + " is prime");
        //System.out.println(Arrays.toString(primeNum));
        primes.put(String.valueOf(i),i); // insert prime number into our map
        numOfPrimes++;
      }
      if(num >= 100000 && (i % 1000 == 0)){
        System.out.println(i);
      }
    }
    primes.put("primeNumbers", numOfPrimes);
    System.out.println("Final Calc Took: " + (System.currentTimeMillis() - start) + "ms");
    return primes;
  }
}