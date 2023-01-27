import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumber {
  public static void main(String[] args) {
    
    Random rn = new Random();
    int computerChoice = rn.nextInt(20);
    System.out.println("computerChoice is"+computerChoice);

    // Converting Guess the Number
    for(int i = 0;i<=6;i++){
    System.out.println("Guess a number between 0 and 20");
    Scanner sc = new Scanner(System.in);
    int userchoice = sc.nextInt();

    if(userchoice>computerChoice){
     System.out.println("Your Guess is too high");}

     else if(userchoice<computerChoice){
     System.out.println("Your choice is too low");}

     else{
     System.out.println("GotchA! You guessed it right");
     break;}//To terminate the For Loop
    }
  }  
}
