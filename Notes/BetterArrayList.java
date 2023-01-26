import java.util.List;
import java.util.ArrayList;
public class BetterArrayList{
    List<String> shoppingList;
    public BetterArrayList(){
        shoppingList = new ArrayList();
    }
    public void addStuff(){
        shoppingList.add("eggs");
        shoppingList.add("oranges");
    }
    public void printFirstLetter(){
        for(String s :shoppingList){
            System.out.println(s.substring(0,1));
        }
    }
    public void addItem(String name){
        shoppingList.add(name);
    }
    public String changeFirstItem(){
        return shoppingList.set(0,"EGGS");
    }
    public void removeItems(int index){
        String itemRemoved = shoppingList.remove(index);
    }
    public void addFirstItem(String name){
        shoppingList.add(0, name);   
    }
    public String getIndexOne(){
        return shoppingList.get(1);
    }
    
}

