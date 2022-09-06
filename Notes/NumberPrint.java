
/**
 * Write a description of class NumberPrint here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumberPrint
{
    public static void Number(){
        for (int i = 0; i < 5; i++){
            for (int j =1; j <= 5; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void Number2(){
        for (int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
     public static void Number3(){
         for (int i = 0; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void Number4(){
      for (int i = 5; i >= 1; i--){
            for(int j = 5; j >= i; j--){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
  
