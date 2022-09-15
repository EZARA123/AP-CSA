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

        while(dealer.getDealerTotal() < 21 && player.getTotal() < 21){
            String answer = scanner.next();
            if(answer.equals("Hit")){
                player.hit();
                System.out.println("Your new Total is: " + player.getTotal());
                System.out.println("Dealer Total is: " + dealer.getDealerTotal());
            }
            if(dealer.getTotal() < 17 || player.getTotal() < 21){
                dealer.hit();
            }
            if(answer.equals("Stand")){
                System.out.println("Your Total is: " + player.getTotal());
                System.out.println("The Dealer Total is: " + dealer.getTotal());
                if(player.getTotal() > dealer.getTotal()){
                    System.out.println("You Have the Better Hand. You Win!");
                }else{
                    System.out.println("Dealer Has Better Hand. You Lost");
                }
            }
            if(player.getTotal() > 21){
                System.out.println("Your Total is: " + player.getTotal()+ " You Busted");
                System.out.println();
                System.out.println("Dealer Hand: " + dealer.getTotal() + " Dealer Won");
            }
            
        }
    }
}
