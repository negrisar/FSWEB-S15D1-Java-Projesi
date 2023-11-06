package grocery.models;

import java.util.ArrayList;
import java.util.List;

public class groceryList {

    private List<String> groceryList = new ArrayList<>();

    public void addItems (String item){

        if(!groceryList.contains(item)){
            groceryList.add(item);
            System.out.println(item +  " listeye eklendi.");
        } else {
            System.out.println(item + " listede mevcut.");
        }
    }

    public void removeItems(String item){
        if(groceryList.contains(item)){
            groceryList.remove(item);
            System.out.println(item + "" + "listeden çıkarıldı.");
        } else {
            System.out.println(item + "" + "listede mevcut değil.");
        }
    }

    public boolean checkItemIsInList(String item){

        return groceryList.contains(item);

    }

    public void printSorted(){

        for(String item : groceryList){
            System.out.println(item);
        }

    }
}
