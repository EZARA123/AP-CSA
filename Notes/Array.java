import java.lang.Math;
/**
 * Write a description of class Array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Array
{
    private String[] myFirstArray;
    private String[] shoppingList;

    public static void main(String[] args){
        System.out.println("Hello World!");
    }

    public Array(){
        myFirstArray = new String[2]; //There are 2 slots.
        myFirstArray[0] = "This"; //This sets the item at index 0 to "This"
        myFirstArray[1] = "That";

        shoppingList = new String[10];
        shoppingList[0] = "Toothpaste";
        shoppingList[1] = "Marshmellows";
        shoppingList[2] = "Mushrooms";
        shoppingList[3] = "Chicken";
        shoppingList[4] = "Noodles";
        shoppingList[5] = "Protein Powder????";
        shoppingList[6] = "Draino";
    }

    public void printShoppingList(){
        for(int i = 0; i < shoppingList.length; i++){
            System.out.println(shoppingList[i]);
        }
    }

    public void adVancePrintList(){
        //Enhanced For Loop
        //ONLY USE IT WHEN YOU DON'T NEED AN IDEX/TO MODIFY THE ARRAY
        for(String item:shoppingList){
            System.out.println(item);
        }
    }

    public static void ArrayTest(int num){
        int[] nums;
        Integer[] numsTwo;
        nums = new int[num];

        //Be careful here:
        int[] test = {1,2,3,4,5,6,7,8};
        //Only use the {} if you declare and instantiate on the same line!

        for(int i = 0; i < num; i++){
            nums [i] = i + 1;
            System.out.println(nums[i]);
        }
        //Modify an array
        test[7] = 1000;
        
        //Accesing an array
        System.out.println(test[0]);
    }
}

