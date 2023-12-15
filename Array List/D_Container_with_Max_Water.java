import java.util.*;

public class D_Container_with_Max_Water {

    public static long maxArea(int A[]) {
        // Code Here
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            array.add(A[i]);
        }

        
        long max = 0;

        for (int i = 0; i < array.size()-1 ; i++) {
            for (int j = i + 1; j < array.size(); j++) {
                long height = (long) Math.min(array.get(i), array.get(j));
                long width = j-i;
                long current = height*width;

                if (current > max) {
                    max = (long) Math.max(current, max);
                }

            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Bars-: ");
        int n = sc.nextInt();
        System.out.print("Enter the Heights for the Bars-: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long ans = maxArea(arr);
        System.out.println("The Area of the Container with max area is -: " + ans);
        sc.close();
    }

}


// 2-pointer approach 
 
// class Solve {
    // long maxArea(int A[], int len) {
        // long max = 0;
        // int left = 0;
        // int right = len - 1;
 
        // while (left < right) {

            // Calculate Area

            // long current = (long) Math.min(A[left], A[right]) * (right - left);
            // max = Math.max(max, current);
 
            // Updte Value of Pointers

            // if (A[left] < A[right]) {
                // left++;
            // } else {
                // right--;
            // }
        // }
        // return max;
    // }
// }

