import java.util.Random;
import java.util.Scanner;


public class Guessgame{
    public static void main(String[] args){

        Random rand =new Random();

        int randomNumber=rand.nextInt(50);
            for(int i=1;i<6;i++)
            { 
                System.out.println("Enter your guess number(1-50)");
                Scanner scanner =new Scanner(System.in);
        
                 int playerguess = scanner.nextInt();

                 if (playerguess == randomNumber)
                    {
                        System.out.println("The number you guess is correct.");
                        break;
                    }else if(randomNumber>playerguess)
                    {

                        System.out.println("the number is higher,guess again");

                    }
                     else
                    {
                        System.out.println("the number is lower, Guess again");
                        
                        
                    }
                    if(i==5){
                        System.out.println("last chance");
                    }
            }
    
    }



}
