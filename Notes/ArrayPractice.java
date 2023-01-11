import java.lang.Math;
public class ArrayPractice
{
    int[] arr;
    int[] testArr = {1, 1, 2, 2, 1, 1, 1, 1, 1, 2, 3};

    public ArrayPractice(){
        arr = new int[6];
        for(int i =0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*10 + 1);
        }
    }

    public void print(){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
    }

    /**Removes the ith number from the list, and replaces the last index with 0
     * Maintains the same order otherwise
     * 
     * For example the array: 2 7 3 1 4 10
     * with the call removeIndex(2) becomes:
     */
    public void removeIndex(int index){
        for(int i = 0; i < testArr.length-1; i++){
            if(i >= index){
                testArr[i] = testArr[i+1];
            }
        }
        testArr[testArr.length - 1] = 0;
    }
    
     //Part B
    /**Adds num to the array at the specified index. To accommodate this change,
     * The last number in the array will be lost.
     *
     * For example the array: 2 7 3 1 4 10
     * with the call AddNum(9, 1) becomes: 2 9 7 3 1 4
     */
    public void AddNum(int num, int index){
       for(int i = arr.length-1;i > index; i--){
           arr[i] = arr[i - 1];
        }
        arr[index] = num;
    }
    //Part C:
    /**Finds and removes all entries with the specified num
     *
     */
    public void printTestArr(){
        for(int i = 0; i < testArr.length; i++){
            System.out.print(testArr[i] + " ");
        }
        System.out.println();
    }
    public void removeAll(int num){
        for(int i = testArr.length-1; i >= 0; i--){
            if(testArr[i] == num){
                removeIndex(i);
            }
        }
    }
}
