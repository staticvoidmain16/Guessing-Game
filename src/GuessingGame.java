//3-4-16
//staticvoidmain16

import java.util.Scanner;
import java.util.Random;

public class GuessingGame 
{
  public static void main(String[] args) 
  {
    
    Random randomInt = new Random();
    Scanner scan = new Scanner(System.in);
    
    int random = randomInt.nextInt(20) + 1;
    
    int count = 0;
    
    System.out.println("Guess an integer between 1 and 20 (inclusive): ");
    int Guess = scan.nextInt();
    count++;
    int Guess1;
    int Guess2;
    
    while (Guess != random) 
    {
      Guess1 = Guess;
      while (Guess < 1 || Guess > 20) 
      {
        
        System.out.println("That is not between 1 and 20. Try again");
        Guess = scan.nextInt();
        
      }
      
      System.out.println("That is incorrect. Try again!");
      System.out.println("Guess an integer between 1 and 20 (inclusive): ");
      
      Guess = scan.nextInt();
      count++;
      Guess2 = Guess;
      
      if (Guess != random) 
      {
        
        int difference = Math.abs(random - Guess1);
        int difference2 = Math.abs(random - Guess2);
        
        if (difference2 > difference)
          System.out.println("You're getting colder");
        else
          System.out.println("You're getting warmer");
        
      }
      
      else
        System.out.println("You got it in " + count + " guesses!");
      
    }
    
  }
  
}
