import java.util.Scanner;
/**
 * Write a description of class BlackJack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlackJack
{
    
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;
        
        do{
            game();
            System.out.println();
            System.out.println("Do you want to play again?(Y/N)");
            String playAgainAnswer = scanner.nextLine();
            playAgain = playAgainAnswer.equalsIgnoreCase("Y");
        }while (playAgain);
    }

    public static void game(){
        Hand player = new Hand();
        Hand dealer = new Hand();

        System.out.println(".------..------..------..------..------..------..------..------..------.");
        System.out.println("|B.--. ||L.--. ||A.--. ||C.--. ||K.--. ||J.--. ||A.--. ||C.--. ||K.--. |");
        System.out.println("| :  : || :  : || :  : || :  : || :  : || :  : || :  : || :  : || :  : | ");
        System.out.println("| :  : || :  : || :  : || :  : || :  : || :  : || :  : || :  : || :  : | ");
        System.out.println("| '--'B|| '--'L|| '--'A|| '--'C|| '--'K|| '--'J|| '--'A|| '--'C|| '--'K|");
        System.out.println("`------'`------'`------'`------'`------'`------'`------'`------'`------'");

        System.out.println("__________________________________________________________________________");

        System.out.println();
        System.out.println("Your hand is: "+ player.getCard1()+" and a "+ player.getCard2()+" ");
        System.out.println("Total is: " + player.getTotal());
        System.out.println();
        System.out.println("The Dealer's card is " + dealer.getDealerTotal());
        System.out.println();
        System.out.println("Would you like to Hit or Stand? (H/S)");
        Scanner scan = new Scanner(System.in);
        while(dealer.getDealerTotal() < 21 && player.getTotal() < 21){
            String answer = scan.next();
            if(answer.equals("H")){
                player.hit();
                System.out.println("Your new Total is: " + player.getTotal());
                System.out.println();
                System.out.println("Dealer Total is: " + dealer.getDealerTotal());
            }
            if(dealer.getTotal() < 17 || player.getTotal() < 21){
                dealer.hit();
            }
            if(answer.equals("S")){
                System.out.println("Your Total is: " + player.getTotal());
                System.out.println();
                System.out.println("The Dealer Total is: " + dealer.getTotal());
                if(player.getTotal() > dealer.getTotal()){
                    System.out.println("You Have the Better Hand. You Win!");
                    System.out.println();
                    System.out.println("Dealer's Starting hand: " + dealer.getCard1() + " " + dealer.getCard2());
                    return;
                }else if(dealer.getTotal() < 21 && dealer.getTotal() > player.getTotal()){
                    System.out.println("The Dealer Has the Better Hand. You Lose!");
                    System.out.println();
                    System.out.println("Dealer's Starting hand: " + dealer.getCard1() + " " + dealer.getCard2());
                    return;
                }
            }

            if(player.getTotal() > 21 && dealer.getTotal() < 21){
                System.out.println(player.getTotal()+ " You Busted");
                System.out.println();
                System.out.println("Dealer Hand: " + dealer.getTotal() + " Dealer Won");
                System.out.println();
                System.out.println("Dealer's Starting hand: " + dealer.getCard1() + " " + dealer.getCard2());
                return;
            }else if(player.getTotal() == dealer.getTotal() && answer.equals("s")){
                System.out.println("Its A Draw");
                System.out.println();
                System.out.println("Dealer's Starting hand: " + dealer.getCard1() + " " + dealer.getCard2());
                return;
            }else if(player.getTotal() == 21){
                System.out.println("You Have 21! You Win!");
                System.out.println();
                System.out.println("Dealer had: " + dealer.getTotal());
                System.out.println();
                System.out.println("Dealer's Starting hand: " + dealer.getCard1() + " " + dealer.getCard2());
                return;
            }else if(dealer.getTotal() == 21){
                System.out.println("Dealer has 21. You lost");
                System.out.println();
                System.out.println("You had: " + player.getTotal());
                System.out.println();
                System.out.println("Dealer's Starting hand: " + dealer.getCard1() + " " + dealer.getCard2());
                return;
            } else if(dealer.getTotal() > 21 && player.getTotal() < 21){
                System.out.println("Dealer's hand: "+ dealer.getTotal()+ " Dealer Busted");
                System.out.println();
                System.out.println("Your Hand: " + player.getTotal() + " You Won");
                System.out.println();
                System.out.println("Dealer's Starting hand: " + dealer.getCard1() + " " + dealer.getCard2());
                return;
            }

        }

    }
}
