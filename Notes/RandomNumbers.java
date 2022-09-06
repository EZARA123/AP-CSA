import java.lang.Math;
/**
 * Write a description of class RnadomStuff here.
 *
 * @author Elijah Zaragoza 
 * @version 9/2/22
 */
public class RandomNumbers
{
    public static void random(){
        //Random number between [0, 1)
        double num = Math.random();
        System.out.println(num);
        
        //Random number between [0, 10)
        double num2 = Math.random() * 10;
        System.out.println(num2);
        
        
        int num3 = (int)(Math.random() * 9);
        System.out.println(num3);
        
    }
    public static void random2(){
        int num4 = (int)(Math.random() * 57 + 44);
        System.out.println(num4);
        
        int num5 = (int)(Math.random() * 493 + 156);
        System.out.println(num5);
    }
}
