import java.util.Scanner;
import java.util.Arrays;

public class Attendant {
  public Attendant() {}

  public static void prompt() {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the fair! What game would you like to play?");
    System.out.println("1. Rock, paper, scissors");
    System.out.println("2. Personality test");
    System.out.println("3. Predict coin flip");
    int selection = input.nextInt();
    Games g = new Games();
    
    int[] array = {1, 2, 3};

    if (selection == 1) {
      g.rpsGame();
    }
    else if (selection == 2) {
        g.pTest();
    }
    else if (selection == 3) { 
        g.diceRoll();
    }
    
    else if (!(Arrays.asList(array).contains(selection))) { 
        System.out.println("Invalid input");
    }
  }
}
