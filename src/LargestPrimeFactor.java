public class LargestPrimeFactor {
  public static boolean isPrime(int n) {
    //if not prime
    int i = 2;
    for (; i <= n / 2; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    // System.out.print("Enter the number: ");
    // Scanner in = new Scanner(System.in);
    // long n = in.nextInt(); 
    long n = 600851475143L;
    int limit = (int) Math.sqrt(n);
    //find prime numbers between 2 and limit
    //check if that prime number divides the number n;
    for (int i = 2; i <= limit; i++) {
      if (isPrime(i)) {
        if (n % i == 0) {
          System.out.println(i);
        }
      }
    }
  }
}

