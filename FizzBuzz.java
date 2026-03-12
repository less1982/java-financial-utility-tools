import java.util.Scanner;

public class FizzBuzz {
  public static void main(String[] args) {
    // divisible by 5 = Fizz, divisible by 3 = Buzz, divisible by both = FizzBuzz, other = print out number
    Scanner input = new Scanner(System.in);
    System.out.print("Number: ");
    int num = input.nextInt();

    if ((num%5 == 0)&&(num%3 == 0))
      System.out.println("FizzBuzz");
    else if (num%5 == 0)
      System.out.println("Fizz");
    else if (num%3 == 0)
      System.out.println("Buzz");
    else
      System.out.println(num);
  }
}