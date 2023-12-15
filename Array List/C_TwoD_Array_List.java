import java.util.*;
public class C_TwoD_Array_List {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1;i<=10;i++){
            list1.add(1*i);   //Table of 1
            list2.add(2*i);  //Table of 1
            list3.add(3*i);  //Table of 1
        }

        // Adding all the List to the main List.

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        // Removing few elements of list 2
        // Remove the elements dynamically
        // list2.remove(2);
        // list2.remove(3);
        // list2.remove(4);

        //Printing the main List
        //System.out.println(mainList);

        // printing in 2D arraysList

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currentList= mainList.get(i);
            System.out.println("Table of "+ (i+1) +" is-:");
            for(int j=0;j<currentList.size();j++){
                System.out.print(currentList.get(j) + " ");
            }
            System.out.println();
        }
    }
    
}
