public class Pratice2{
    public static void main(String[] args){
        System.out.println("Hello World!");
    }
    public static void testMethod(){
        main(new String[0]);
    }
    public static void testMethod2(){
        testMethod();
    }
    //Make a for loop that prints the number 1 through 1000.
    public static void forLoopPractice(){
        for (int i = 1; i <= 1000; i++){
            System.out.println(i);
        }
    }
    public static void nestedForLoops(){
        for (int i = 1; i <= 5; i--){
            for(int j = 1; j <= 5; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void triangle(){
        for (int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}