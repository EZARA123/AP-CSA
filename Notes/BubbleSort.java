 
/**
 * Write a description of class SortPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BubbleSort
{
    private int[] arr = {2, 1, 4, 3, 9, 6};
    public void bubbleSort(){
        int smallest = 0;
        int largest = 0;
        for(int j = 0; j < arr.length; j++){
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr[i+1]){
                    largest = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = largest;
                }
            }
        }
    }
    public void printBubble(){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
