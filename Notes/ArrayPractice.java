import java.lang.Math;
public class ArrayPractice
{
    int[] arr;

    public ArrayPractice(){
        arr = new int[6];
        for(int i =0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*10 + 1);
        }
    }

    public void print(){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    /**Removes the ith number from the list, and replaces the last index with 0
     * Maintains the same order otherwise
     * 
     * For example the array: 2 7 3 1 4 10
     * with the call removeIndex(2) becomes:
     */
    public void removeIndex(int index){
        for(int i = index; i< arr.length; i++){
           
        }
    }
}
