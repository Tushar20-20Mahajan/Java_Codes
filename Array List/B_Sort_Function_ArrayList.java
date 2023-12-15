import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class B_Sort_Function_ArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the size of Array List");
        int n= sc.nextInt();
        System.out.println("Enter the Elements of Array List");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }

        // Assending Order
        Collections.sort(list);
        System.out.println(list);

        // Desending Order
        Collections.sort(list,Collections.reverseOrder());   // Comparator - Defines Function Logic
        System.out.println(list);
        

        sc.close();
    }
    
}
