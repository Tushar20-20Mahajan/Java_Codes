// // import java.util.ArrayList;
// // import java.util.Scanner;

// import java.util.*;

// public class E_PairSum_1 {

//     // 1-> Brute Force Approach;

//     public static ArrayList<String> sumTarget(ArrayList<Integer> array, int target) {
//         ArrayList<String> sum = new ArrayList<>();
//         Collections.sort(array);
//         for (int i = 0; i < array.size() - 1; i++) {
//             for (int j = i + 1; j < array.size(); j++) {
//                 if ((i != j) && (array.get(i) + array.get(j) == target)) {
//                     sum.add("(" + array.get(i) + "," + array.get(j) + ")");
//                 }
//             }
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number of elements in the array: ");
//         int n = sc.nextInt();
//         System.out.print("Enter the elements of the array: ");
//         ArrayList<Integer> array = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             array.add(sc.nextInt());
//         }

//         System.out.print("Enter the Target sum: ");
//         int target = sc.nextInt();

//         System.out.println("The Pairs are:");
//         ArrayList<String> pairs = sumTarget(array, target);
//          System.out.println(pairs);
//         sc.close();
//     }
// }






import java.util.*;

public class E_PairSum_1 {

       // 2-> 2-Pointer Approach conditioned sorted array

    public static ArrayList<String> sumTarget(ArrayList<Integer> array , int target){
        ArrayList<String> sum = new ArrayList<>();
        Collections.sort(array);
       // Left Pointer
        int lp =0;
        //Right Pointer
        int rp = array.size()-1;
        while (lp < rp) {
            
            if (array.get(lp) + array.get(rp) < target) {
                lp++;
            }
            else if (array.get(lp) + array.get(rp) == target) {
                sum.add("(" + array.get(lp) + "," + array.get(rp) + ")");
                lp++;
            } else if (array.get(lp) + array.get(rp) > target) {
                rp--;
            } 
        }
    
        return sum;

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

        System.out.println("The Pairs are:");
         ArrayList<String> pairs = sumTarget(array, target);
         System.out.println(pairs);
        sc.close();
    }
}

