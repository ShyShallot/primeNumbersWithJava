import java.util.HashMap;
public class numHandler{
  public int countFactors(int num){
    //System.out.println(primeNum);
    int numOfFac = 0;
    int i = 1;
    while(i<num){
      //System.out.println(i);
      //System.out.println(primeNum.get(i));
      if (num % i == 0){
        numOfFac++;
      }
      i++;
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

  public int countPrimes(int num){
    //System.out.println(Arrays.toString(primeNum));
    long start = System.currentTimeMillis();
    int numOfPrimes = 0;
    for(int i = 2;i<num;i++){
      long start2 = System.currentTimeMillis();
     // System.out.println("Checking if " + i + " is Prime");
      if(isPrime(i)){
        //System.out.println(i + " is prime");
        //System.out.println(Arrays.toString(primeNum));
        numOfPrimes++;
      }
      if(i % 1000 == 0){
        long time = System.currentTimeMillis() - start2;
        System.out.println(i + " Calc Took: " + time + "ms");
      }
    }
    System.out.println("Final Calc Took: " + (System.currentTimeMillis() - start) + "ms");
    return numOfPrimes;
  }

  public HashMap<String,Integer> countPrimesEff(int num){
    long start = System.currentTimeMillis();
    HashMap<String, Integer> primes = new HashMap<>();
    int numOfPrimes = -1;
    for(int i = num; i>0;i--){
      long start2 = System.currentTimeMillis();
      int numOfFac = 0;
      for(int y = 1; y<=i;y++){
        if(i % y == 0){
          numOfFac++;
        }
      }
      //System.out.println(numOfFac + ", " + i);
      if(numOfFac <= 2){
        //System.out.println(i + " is a prime number");
        primes.put(String.valueOf(i), i);
        numOfPrimes++;
      }
      if(i % 1000 == 0){
        long time = System.currentTimeMillis() - start2;
        System.out.println(i + " Calc Took: " + time + "ms");
      }
    }
    System.out.println("Final Calc Took: " + (System.currentTimeMillis() - start) + "ms");
    primes.put("primeNumbers",numOfPrimes);
    return primes;
  }
}