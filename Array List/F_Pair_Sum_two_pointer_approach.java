


import java.util.*;

public class F_Pair_Sum_two_pointer_approach {

    public static Boolean sumTarget(ArrayList<Integer> array, int target) {
        
        int lp = 0;
        int rp = array.size() - 1;
        Collections.sort(array);

        while (lp < rp) {
            if (array.get(lp) + array.get(rp) == target) {
                return true;
                
               
            } else if (array.get(lp) + array.get(rp) > target) {
                rp--;
            } else {
                lp++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of elements in the array: ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array: ");
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array.add(sc.nextInt());
        }

        System.out.print("Enter the Target sum: ");
        int target = sc.nextInt();

        

        System.out.println("The Pairs Exist:");
        Boolean pairs = sumTarget(array, target);
        System.out.println(pairs);
        sc.close();
    }
}
