import java.awt.Color;
/**
 * Write a description of class Crown here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Crown
{
    // private instance variables
    private String metal;
    private String shape;
    private int numberOfJewels;
    private double size;
    private Color color;
    private int durability = 100;

    // This is a horrible practice, but we are doing it for education...
    public String owner;
    /**
     * Constructor for objects of class Crown
     */
    public Crown(String metalType, String crownShape, 
    int numberOfJewels, double size, Color color)
    {
        metal = metalType;
        shape = crownShape;
        this.numberOfJewels = numberOfJewels;
        this.size = size;
        this.color = color;
    }

    public Crown(){
        metal = "Silver";
        shape = "Round";
        numberOfJewels = 5;
        size = 4.3;
        color = new Color(192, 192, 192);
    }

    public Crown(Color color){
        this("Silver", "Round", 5, 4.4, color);
    }
    // public void crownTest()
    // {
    // Kingdom.kingdomTester();
    // }

    //Accessor Methods
    public String getMetal(){
        return metal;
    }

    public double getSize(){
        return size;
    }

    //Mutator Method
    public void setSize(double newSize){
        size = newSize;
    }

    //Other Methods
    public void breakCrown(){
        durability = 0;
        System.out.println("It broke");
    }

    public void wear(String owner){
        if (durability <=0){
            System.out.print("It's Broken");
        }else{
            this.owner = owner;
            durability--;
            System.out.println(owner + " wear the crown now!");
        }
    }
    
}
