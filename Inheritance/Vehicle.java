
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//Car is a subclass of Vehicle
// Vehicle is a superclass of Car

public abstract class Vehicle //extends Object
{
    String name;
    public Vehicle(String name){
       //super(); //This is automatically called unless a different constructor is called
       this.name = name;
       System.out.println("The name was assigned");
    }
    //This abstract method must be defined in every subclass (because it isn't here)
    public abstract void park();
    public void move(){
        System.out.print(name + " moves");
    }
}
