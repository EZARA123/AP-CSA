
/**
 * Write a description of class ArrayListsPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class ArrayListsPractice
{
   ArrayList list;
   public ArrayListsPractice(){
       list = new ArrayList();
   }
   
   public void test1(){
       list.add(new Integer(1));
       list.add(new Object());
       list.add(true);
   }

   public void forLoop(){
      for(int i = 0; i < list.size(); i++){
          System.out.println("Here is something");
      }
      for(Object o : list){
          System.out.println("Here is something");
      }
   }
   public Object remove(int index){
       return list.remove(index);
    }
} 
