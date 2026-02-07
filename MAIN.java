import java.util.Scanner;
class MAIN{  
  public static void main(String[] args){

    System.out.println("Guess a number between 1 and 100");
        Scanner scan = new Scanner(System.in);
        int guessNumber = 0;
        int hiddenNumber = 11;
        int attempts = 0;
        
        while (guessNumber!= hiddenNumber){
            System.out.print("Enter your guess: ");
            guessNumber= scan.nextInt();
            attempts++;
         if(guessNumber < hiddenNumber){
          System.out.println("Too low");
        }
        else if (guessNumber> hiddenNumber){
          System.out.println("Too high");
        }
        else{
          System.out.println("You got it!");
          System.out.println("The amount of guess you took were: " + attempts);
        }
      }
      scan.close();

  }
}