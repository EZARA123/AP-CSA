
/**
 * Write a description of class Tesla here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tesla extends KeylessCar implements DriverlessCar, BlankInterface
{
    public Tesla(){
        super("Model X", 4, "Tesla");
    }
    public void brake(){
        System.out.println("You brake");
    }
    public void accelerate(){
        System.out.println("You accelerate");
    }
}
