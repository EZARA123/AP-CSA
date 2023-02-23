
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(){
        Car yourCar = new Car("Your Car", 3, "Trash");
        Car myCar = new KeylessCar(" Mr.Wiebe's Awesome car of Awesome", 4, "Ferrari");
        yourCar.start();
        myCar.start();
        yourCar.move();
        myCar.move();
        //myCar.test(); Although it is defined, the test() method is not
        //defined for all Car Objects.
    }
}
