/**
 * Write a description of class Hand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hand
{
    private int card1;
    private int card2;
    private int dealerHand; 
    private int total;
    public Hand(){
        card1 = hit();
        card2 = hit();
        total = card1 + card2;
        dealerHand = card1;
    }

    public int hit(){
        int newCard = (int)(Math.random()*10 + 1);
        total += newCard;
        return newCard;
    }

    public int getTotal(){
        return total;
    }

    public int getCard1(){
        return card1;
    }

    public int getCard2(){
        return card2;
    }

    public int getDealerTotal(){
        return dealerHand;
    }
}
