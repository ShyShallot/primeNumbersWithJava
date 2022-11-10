import java.util.HashMap;
public class numHandler{
  public int countFactors(int num){ // check countPrimesEff for comments
    //System.out.println(primeNum);
    int numOfFac = 0;
    double sqrt = Math.sqrt(num);
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

  public HashMap<String,Integer> countPrimes(int num, int printStep){ // check countPrimesEff for comments
    //System.out.println(Arrays.toString(primeNum));
    HashMap<String, Integer> primes = new HashMap<>();
    long start = System.currentTimeMillis();
    int numOfPrimes = 0;
    for(int i = 2;i<num;i++){
      long start2 = System.currentTimeMillis();
     // System.out.println("Checking if " + i + " is Prime");
      if(isPrime(i)){
        //System.out.println(i + " is prime");
        //System.out.println(Arrays.toString(primeNum));
        primes.put(String.valueOf(i),i);
        numOfPrimes++;
      }
      if(i % printStep == 0){
        long time = System.currentTimeMillis() - start2;
        System.out.println(i + " Calc Took: " + time + "ms");
      }
    }
    primes.put("primeNumbers", numOfPrimes);
    System.out.println("Final Calc Took: " + (System.currentTimeMillis() - start) + "ms");
    return primes;
  }
// The reason for this being a different function is that the design requirements for the base countPrimes function is that it had to call the other 2 functions, and i wanted to see if this was faster.
  public HashMap<String,Integer> countPrimesEff(int num, int printStep){ 
    long start = System.currentTimeMillis();  // Base Start time for total calculations
    HashMap<String, Integer> primes = new HashMap<>(); // create hash map to store calculated prime values
    int numOfPrimes = -1; // offset by 1 as for some reason this function is inaccurate by 1.
    for(int i = num; i>0;i--){ // start from our input number and work down as this gets slower the bigger the number
      long start2 = System.currentTimeMillis(); // start time for each number
      int numOfFac = 0; // Number of Factors for the number I in our for loop
      for(int y = 1; y<=i;y++){ // loop through each number to I starting from 1 and see if its a factor of that number
        if(i % y == 0){ // if there is no remainder Y is a factor of I
          numOfFac++;
        }
      }
      //System.out.println(numOfFac + ", " + i);
      if(numOfFac <= 2){ // if the number I has no other factor other than 1 and its self.
        //System.out.println(i + " is a prime number");
        primes.put(String.valueOf(i), i); // enter prime number into HashMap
        numOfPrimes++; // add to number of primes
      }
      if(i % printStep == 0){ // This is just to print every printStep, so ie every 100, 1000 and so on numbers, as printing every number and timestamp slows it down but we still need a marker of progress, give or take its about 100ms difference
        long time = System.currentTimeMillis() - start2;
        System.out.println(i + " Calc Took: " + time + "ms");
      }
    }
    System.out.println("Final Calc Took: " + (System.currentTimeMillis() - start) + "ms");
    primes.put("primeNumbers",numOfPrimes);
    return primes; // return our hashmap
  }
}