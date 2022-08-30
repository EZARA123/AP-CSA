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
}