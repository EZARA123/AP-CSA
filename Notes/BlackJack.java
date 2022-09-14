import java.util.Scanner;
/**
 * Write a description of class BlackJack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlackJack
{
    static Scanner scanner = new Scanner(System.in);

    public static void game(){
        Hand player = new Hand();
        Hand dealer = new Hand();
        System.out.println("Your got a "+ player.getCard1()+" and a "+ player.getCard2()+" ");
        System.out.println("Total is: " + player.getTotal());
        System.out.println("The Dealer's card is " + dealer.getDealerTotal());
        System.out.println("Would you like to Hit or Stand?");
    }
}
