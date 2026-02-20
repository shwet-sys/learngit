import java.util.Random;
import java.util.Scanner;

class GuessTheno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100)+1;
        int guess =0;
        int attempts =0;
        while(guess != number){
            System.out.println("Enter your guess: ");
            guess = sc.nextInt();
            
            if(guess > number){
                System.out.println("too high! try again.");
            }
            else if (guess < number) {
                System.out.println("too low ! try again.");
            }
            else{
                attempts++;
                System.out.println("correct! you guessed the number in "+ attempts + " attempts.");
            }
        }
        

        sc.close();
    }
    
}
