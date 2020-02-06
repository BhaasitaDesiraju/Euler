/**
 * Created by bhaasita on 04/08/2019
 */
import java.util.Scanner;

/** Question:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class SumOfMultiples {

  //Function for calculating the sum of multiples of a number, n
  private int multiplesSum(int n) {
    int sum=0;
    //Sum of multiples of a number n is  n*(n+1)/2
    sum = n*(n+1)/2;
    return sum;
  }

  public static void main(String args[]) {
    SumOfMultiples sumOfMultiples = new SumOfMultiples();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number:");
    int n1 = sc.nextInt();
    System.out.println("Enter the second number:");
    int n2 = sc.nextInt();
    int totalSum = (sumOfMultiples.multiplesSum(n1) + sumOfMultiples.multiplesSum(n2)) - sumOfMultiples.multiplesSum(n1 * n2);
    System.out.println(totalSum);
  }
}
