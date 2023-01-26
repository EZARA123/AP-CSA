
/**
 * Write a description of class ArrayListTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListTest
{
    //ArrayList containing int arrays
    ArrayList<int[]> test;
    //Array Containing ArrayList (made up of Integers)
    ArrayList<Integer>[] test1;
    //ArrayList Containing Boolean ArrayLists
    ArrayList<ArrayList<Boolean>> test2;
    
    
    //2D array
    ArrayList<ArrayList<Scanner>>[][] test3;
    
    public static void thing(){
        String[] a = new String[5];
        ArrayList<Float> b = new ArrayList<Float>();
        ArrayList<String[]> c = new ArrayList<String[]>();
        
        //Get the first item from b
        Float f = b.get(0);
        //Get the first item of a
        String A = a[0];
        
        //Get the first item from c(What data type is it?)
        String [] arr = c.get(0);
    }
}
