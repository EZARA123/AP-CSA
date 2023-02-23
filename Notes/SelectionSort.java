
/**
 * Write a description of class SelectionSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SelectionSort
{
    private int[] arr = {2, 1, 4, 3, 9, 6};
    public void selectionSort() {
       int m = arr.length;
       for(int i = 0; i < m-1; i++) {
           int minIndex = i;
           for (int j = i+1; j < m; j++) {
               if (arr[j] < arr[minIndex]) {
                   minIndex = j;
               }
           }
           int num = arr[minIndex];
           arr[minIndex] = arr[i];
           arr[i] = num;
       }
   }
    public void printBubble(){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}