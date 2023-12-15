import java.util.*;

/**
 * A_Find_Maximum
 */
public class A_Find_Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the no. of elements of array-:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array-:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < list.size()-1; i++) {
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)>list.get(j)){
                    int temp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);

                }
            }
        }

        System.out.println("The Largest Element is -: "+list.get(list.size()-1));

        sc.close();
    }

}