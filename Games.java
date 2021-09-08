import java.util.Scanner;
import java.lang.Math;

public class Games {
  public Games() {}

  public static void rpsGame() {
        int rpsCpuChoice = (int)(Math.random()*3)+1;
        Scanner rpsInput = new Scanner(System.in);
        Scanner rpsNameInput = new Scanner(System.in);
        System.out.println("Welcome to rock, paper, scissors! What is your name?");
        String rpsName = rpsNameInput.nextLine();
        while (2 > 1) { 
        System.out.println("Welcome, " + rpsName + ". Please make selection.");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.println("4. Exit");
        int rpsChoice = rpsInput.nextInt();
    
        // if player chose rock:
    
        if (rpsChoice == 1 && rpsCpuChoice == 1) {
          System.out.println("CPU chose rock as well.");
          System.out.println("Stalemate; no winner");
        }
        else if (rpsChoice == 1 && rpsCpuChoice == 2) {
          System.out.println("CPU chose paper.");
          System.out.println("CPU wins");
        }
        else if (rpsChoice == 1 && rpsCpuChoice == 3) {
          System.out.println("CPU chose scissors.");
          System.out.println(rpsName + " wins");
        }
    
        // if player chose paper:
    
        else if (rpsChoice == 2 && rpsCpuChoice == 1) {
          System.out.println("CPU chose rock.");
          System.out.println(rpsName + " wins");
        }
        else if (rpsChoice == 2 && rpsCpuChoice == 2) {
          System.out.println("CPU chose paper as well.");
          System.out.println("Stalemate; no winner");
        }
        else if (rpsChoice == 2 && rpsCpuChoice == 3) {
          System.out.println("CPU chose scissors.");
          System.out.println("CPU wins");
        }
    
        // if player chose scissors:
    
        else if (rpsChoice == 3 && rpsCpuChoice == 1) {
          System.out.println("CPU chose rock.");
          System.out.println("CPU wins");
        }
        else if (rpsChoice == 3 && rpsCpuChoice == 2) {
          System.out.println("CPU chose paper.");
          System.out.println(rpsName + " wins");
        }
        else if (rpsChoice == 3 && rpsCpuChoice == 3) {
          System.out.println("CPU chose scissors as well.");
          System.out.println("Stalemate; no winner");
        }
        
        // quit game
        
        else if (rpsChoice == 4) {
            System.out.println("Exiting...");
            return;
        }
      }
    }

  public static void pTest() {
    Scanner pTestInput = new Scanner(System.in);
    int goldScore = 0;
    int orangeScore = 0;
    int greenScore = 0;
    int blueScore = 0;
    System.out.println("Welcome! This personality test uses the Ketterman Temperament scale.");
    System.out.println("What is your name?");
    String pTestName = pTestInput.nextLine();
    System.out.println("Hello, " + pTestName + ". We'll be asking you a few questions; try to answer as truthfully as possible.");
    System.out.println("Rate how much you agree with the statement from 0-5. Let's begin!");

    System.out.println("1. I am naturally organised. I create order and structure in my life.");
    int choice1 = pTestInput.nextInt();
    goldScore = goldScore + choice1;

    System.out.println("2. I need to do fun and exciting things in my life.");
    int choice2 = pTestInput.nextInt();
    orangeScore = orangeScore + choice2;

    System.out.println("3. I value gaining knowledge. I want to spend my time learning more about what interests me.");
    int choice3 = pTestInput.nextInt();
    greenScore = greenScore + choice3;

    System.out.println("4. I like it when someone around me gets along and does not argue or fight because I need and value harmony.");
    int choice4 = pTestInput.nextInt();
    blueScore = blueScore + choice4;

    System.out.println("5. I need others to show they really care about me.");
    int choice5 = pTestInput.nextInt();
    blueScore = blueScore + choice5;

    System.out.println("6. I am curious. I like to ask questions and want to know why.");
    int choice6 = pTestInput.nextInt();
    greenScore = greenScore + choice6;

    System.out.println("7. I need change and excitement in my life, or I become bored.");
    int choice7 = pTestInput.nextInt();
    orangeScore = orangeScore + choice7;

    System.out.println("8. I like to plan ahead. I need to be prepared ahead of time.");
    int choice8 = pTestInput.nextInt();
    goldScore = goldScore + choice8;

    System.out.println("9. I like to think deeply about subjects that interest me.");
    int choice9 = pTestInput.nextInt();
    greenScore = greenScore + choice9;

    System.out.println("10. I am naturally impulsive. I often do things without thinking first.");
    int choice10 = pTestInput.nextInt();
    orangeScore = orangeScore + choice10;

    System.out.println("11. I naturally care about people and need them to care about me.");
    int choice11 = pTestInput.nextInt();
    blueScore = blueScore + choice11;

    System.out.println("12. I naturally do what is right and like to follow the rules.");
    int choice12 = pTestInput.nextInt();
    goldScore = goldScore + choice12;

    System.out.println("13. I like to take risks and that sometimes gets me in trouble.");
    int choice13 = pTestInput.nextInt();
    orangeScore = orangeScore + choice13;

    System.out.println("14. I need to be treated so I feel special and important to others.");
    int choice14 = pTestInput.nextInt();
    blueScore = blueScore + choice14;

    System.out.println("15. I live a cautious life. I need to be safe and avoid danger.");
    int choice15 = pTestInput.nextInt();
    goldScore = goldScore + choice15;

    System.out.println("16. I like to tell others what I know and have learned in my life.");
    int choice16 = pTestInput.nextInt();
    greenScore = greenScore + choice16;

    System.out.println("17. I like to make lists and follow them to accomplish many things.");
    int choice17 = pTestInput.nextInt();
    goldScore = goldScore + choice17;

    System.out.println("18. I really want to be friendly and get along with everyone I know.");
    int choice18 = pTestInput.nextInt();
    blueScore = blueScore + choice18;

    System.out.println("19. I hate to make mistakes. I need to have the right answer.");
    int choice19 = pTestInput.nextInt();
    greenScore = greenScore + choice19;

    System.out.println("20. I go all out to win. I like activities that are physical and competitive");
    int choice20 = pTestInput.nextInt();
    orangeScore = orangeScore + choice20;

    System.out.println("21. I learn and work best when by myself rather than in a group.");
    int choice21 = pTestInput.nextInt();
    greenScore = greenScore + choice21;

    System.out.println("22. I need freedom and flexibility. I hate following other people's rules.");
    int choice22 = pTestInput.nextInt();
    orangeScore = orangeScore + choice22;

    System.out.println("23. I like to belong to clubs and groups that do good deeds");
    int choice23 = pTestInput.nextInt();
    goldScore = goldScore + choice23;

    System.out.println("24. I am naturally sensitive. I get my feelings hurt easily.");
    int choice24 = pTestInput.nextInt();
    blueScore = blueScore + choice24;

    System.out.println("25. I need to learn and do things by following a schedule and routine");
    int choice25 = pTestInput.nextInt();
    goldScore = goldScore + choice25;

    System.out.println("26. I want to make the world a better place for others because I care");
    int choice26 = pTestInput.nextInt();
    blueScore = blueScore + choice26;

    System.out.println("27. I am naturally playful and have a good sense of humour");
    int choice27 = pTestInput.nextInt();
    orangeScore = orangeScore + choice27;

    System.out.println("28. I like to spend time alone so I can think and analyse my thoughts.");
    int choice28 = pTestInput.nextInt();
    greenScore = greenScore + choice28;

    System.out.println("29. I love it when people work together and cooperate.");
    int choice29 = pTestInput.nextInt();
    blueScore = blueScore + choice29;

    System.out.println("30. I enjoy entertaining others and making people laugh.");
    int choice30 = pTestInput.nextInt();
    orangeScore = orangeScore + choice30;

    System.out.println("31. I need to be responsible and have others see me as responsible");
    int choice31 = pTestInput.nextInt();
    goldScore = goldScore + choice31;

    System.out.println("32. I enjoy thinking and using my mind to solve problems.");
    int choice32 = pTestInput.nextInt();
    greenScore = greenScore + choice32;

    System.out.println("33. I like to spend time helping others get along and feel happy");
    int choice33 = pTestInput.nextInt();
    blueScore = blueScore + choice33;

    System.out.println("34. I am a natural problem-solver and enjoy analysing problems.");
    int choice34 = pTestInput.nextInt();
    greenScore = greenScore + choice34;

    System.out.println("35. I desire excitement and adventure. I crave feeling a 'rush.'");
    int choice35 = pTestInput.nextInt();
    orangeScore = orangeScore + choice35;

    System.out.println("36. I need to do what is right. I have a strong sense of right and wrong.");
    int choice36 = pTestInput.nextInt();
    goldScore = goldScore + choice36;

    System.out.println("37. I have a difficulty sitting still and being attentive for long periods of time.");
    int choice37 = pTestInput.nextInt();
    orangeScore = orangeScore + choice37;

    System.out.println("38. I am affectionate and nurturing in my relationships.");
    int choice38 = pTestInput.nextInt();
    blueScore = blueScore + choice38;

    System.out.println("39. I really value intelligence. Others see me as intelligent.");
    int choice39 = pTestInput.nextInt();
    greenScore = greenScore + choice39;

    System.out.println("40. I complete my work before I relax or play. Work comes before play.");
    int choice40 = pTestInput.nextInt();
    goldScore = goldScore + choice40;

    System.out.println("All done! Your results are:");
    System.out.println("Gold: " + goldScore);
    System.out.println("Orange: " + orangeScore);
    System.out.println("Green: " + greenScore);
    System.out.println("Blue: " + blueScore);

    if (goldScore > orangeScore && goldScore > greenScore && goldScore > blueScore) {
      System.out.println("Your dominant colour is gold.");
      System.out.println("Others may perceive gold as:");
      System.out.println("-Rigid");
      System.out.println("-Controlling, bossy");
      System.out.println("-Buzzkill");
      System.out.println("-Rule-bound");
      System.out.println("Gold may perceive self as:");
      System.out.println("-Dependable");
      System.out.println("-Consistent");
      System.out.println("-Traditional");
      System.out.println("-Moral");
    }
    else if (orangeScore > goldScore && orangeScore > greenScore && orangeScore > blueScore) { 
        System.out.println("Your dominant colour is orange.");
        System.out.println("Others may perceive orange as:");
        System.out.println("-Irresponsible");
        System.out.println("-Goofing off too much");
        System.out.println("-Manipulative");
        System.out.println("-Self-centred");
        System.out.println("Orange may perceive self as:");
        System.out.println("-Flexible, easy-going");
        System.out.println("-Bold, assertive");
        System.out.println("-Having many interests");
        System.out.println("-Having a playful attitude");
    }
    else if (greenScore > goldScore && greenScore > orangeScore && greenScore > blueScore) { 
        System.out.println("Your dominant colour is green.");
        System.out.println("Others may perceive green as:");
        System.out.println("-Cold");
        System.out.println("-Aloof, head in the clouds");
        System.out.println("-Overly critical");
        System.out.println("-Know-it-all");
        System.out.println("Green may perceive self as:");
        System.out.println("-Rational");
        System.out.println("-Thinking deeply");
        System.out.println("-Mentally tough, strong");
        System.out.println("-Constructively opinionated");
    }
    else if (blueScore > goldScore && blueScore > greenScore && blueScore > orangeScore) { 
        System.out.println("Your dominant colour is blue");
        System.out.println("Others may perceive blue as:");
        System.out.println("-Mushy");
        System.out.println("-Too trusting");
        System.out.println("-Overly sensitive");
        System.out.println("-Weak, illogical");
        System.out.println("Blue may perceive self as:");
        System.out.println("-Honouring feelings");
        System.out.println("-Nurturing");
        System.out.println("-Liking to please people");
        System.out.println("-Empathetic");
    }
    }

    public static void diceRoll() {
          Scanner drInput = new Scanner(System.in);
          System.out.println("Welcome to the dice rolling game. Player 1, what is your name?");
          String drName1 = drInput.nextLine();
          System.out.println("Hello, " + drName1 + ". Player 2, please enter your name:");
          String drName2 = drInput.nextLine();
          System.out.println("Hello, " + drName2 + ".");
          while (2 > 1) {
          System.out.println("Please select desired dice.");
          System.out.println("1. d4");
          System.out.println("2. d6");
          System.out.println("3. d8");
          System.out.println("4. d12");
          System.out.println("5. d20");
          System.out.println("6. Exit");
          int drSelection = drInput.nextInt();

          if (drSelection == 1) {
            int target = (int)(Math.random()*4)+1;

            System.out.println("Player 1, please enter your guess:");
            int guess1 = drInput.nextInt();
            System.out.println("Player 2, please enter your guess:");
            int guess2 = drInput.nextInt();

            System.out.println("The target was " + target);

            if (Math.abs(target - guess1) < Math.abs(target - guess2)) {
              System.out.println("Player 1 wins");
            }

            else if (Math.abs(target - guess1) > Math.abs(target - guess2)) {
              System.out.println("Player 2 wins");
          }
            else if (Math.abs(target - guess1) == Math.abs(target - guess2)) {
              System.out.println("Stalemate");
            }
            
        }

          else if (drSelection == 2) {
            int target = (int)(Math.random()*6)+1;

            System.out.println("Player 1, please enter your guess:");
            int guess1 = drInput.nextInt();
            System.out.println("Player 2, please enter your guess:");
            int guess2 = drInput.nextInt();

            System.out.println("The target was " + target);

            if (Math.abs(target - guess1) < Math.abs(target - guess2)) {
              System.out.println("Player 1 wins");
            }

            else if (Math.abs(target - guess1) > Math.abs(target - guess2)) {
              System.out.println("Player 2 wins");
            }
            else if (Math.abs(target - guess1) == Math.abs(target - guess2)) {
              System.out.println("Stalemate");
            }
          }

          else if (drSelection == 3) {
            int target = (int)(Math.random()*8)+1;

            System.out.println("Player 1, please enter your guess:");
            int guess1 = drInput.nextInt();
            System.out.println("Player 2, please enter your guess:");
            int guess2 = drInput.nextInt();

            System.out.println("The target was " + target);

            if (Math.abs(target - guess1) < Math.abs(target - guess2)) {
              System.out.println("Player 1 wins");
            }

            else if (Math.abs(target - guess1) > Math.abs(target - guess2)) {
              System.out.println("Player 2 wins");
            }
            else if (Math.abs(target - guess1) == Math.abs(target - guess2)) {
              System.out.println("Stalemate");
            }
          }

          else if (drSelection == 4) {
            int target = (int)(Math.random()*12)+1;

            System.out.println("Player 1, please enter your guess:");
            int guess1 = drInput.nextInt();
            System.out.println("Player 2, please enter your guess:");
            int guess2 = drInput.nextInt();

            System.out.println("The target was " + target);

            if (Math.abs(target - guess1) < Math.abs(target - guess2)) {
              System.out.println("Player 1 wins");
            }

            else if (Math.abs(target - guess1) > Math.abs(target - guess2)) {
              System.out.println("Player 2 wins");
            }
            else if (Math.abs(target - guess1) == Math.abs(target - guess2)) {
              System.out.println("Stalemate");
            }
          }

          else if (drSelection == 5) {
          int target = (int)(Math.random()*20)+1;

          System.out.println("Player 1, please enter your guess:");
          int guess1 = drInput.nextInt();
          System.out.println("Player 2, please enter your guess:");
          int guess2 = drInput.nextInt();

          System.out.println("The target was " + target);
          
          if (guess1 > 20 || guess1 < 1) {
            System.out.println("Player 1: Guess must be between 1 and 20");
            }
          else if (guess2 > 20 || guess2 < 1) { 
            System.out.println("Player 2: Guess must be between 1 and 20");
            }

          else if (Math.abs(target - guess1) < Math.abs(target - guess2)) {
            System.out.println("Player 1 wins");
          }

          else if (Math.abs(target - guess1) > Math.abs(target - guess2)) {
            System.out.println("Player 2 wins");
          }
          else if (Math.abs(target - guess1) == Math.abs(target - guess2)) {
            System.out.println("Stalemate");
          }
        }
        else if (drSelection == 6) { 
            System.out.println("Exitting...");
            return;
        }
    }
}
}
