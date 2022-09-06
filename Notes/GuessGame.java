import java.lang.Math;
import java.util.Scanner;
/**
 * Write a description of class GuessGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class GuessGame{
    static Scanner scanner = new Scanner(System.in);
    public static void guessingGame(){
        int num = (int)(Math.random() * 10 + 1);
        System.out.println(num);
        System.out.println("Guess a number between 1 - 10");
        for(int i = 0; i < 5; i++){
            int randomNum = scanner.nextInt();
            if(randomNum == num){
                System.out.println("Thats Right!");
                return;
            }else if(randomNum > num){
                System.out.println("Guess lower");
            }else{
                System.out.println("Guess higher");
            }

        }
    }
}
