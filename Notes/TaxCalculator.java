import java.util.Scanner;
/**
 * Write a description of class TaxCalculator here.
 *
 * @author Elijah
 * @version 8/29/22
 */
public class TaxCalculator
{
    static Scanner scanner = new Scanner(System.in);
    
   public static void method1(){
       System.out.println("Enter your gross income(Down to the nearest penny)");
       double taxIncome = scanner.nextDouble();
       System.out.println("How many depentdents do you have?");
       int numDepentdents = scanner.nextInt();
       double taxableIncome = taxIncome - 10000 - 2000 * numDepentdents;
       double incomeTax = taxableIncome * .2;
       System.out.println(incomeTax);
      
       
    }
}
