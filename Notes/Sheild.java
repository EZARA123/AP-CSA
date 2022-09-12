import java.awt.Color;
/**
 * Write a description of class Phone here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sheild
{
    private String metal;
    private String shape;
    private double size;
    private int durability = 100;
    private Color color;
    private String handle;
    
    
    public String owner;
    public Sheild(String metalType, String sheildShape, String sheildHandle,
    double size, Color color)
    {
        metal = metalType;
        shape = sheildShape;
        handle = sheildHandle;
        this.size = size;
        this.color = color;
    }

    public Sheild(){
        metal = "Titianium";
        shape = "Pointed";
        handle = "Wood";
        size = 4.3;
        color = new Color(184, 184, 184);
    }
    
    public String getMetal(){
        return metal;
    }
}