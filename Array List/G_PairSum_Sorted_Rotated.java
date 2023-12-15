import java.util.*;
public class G_PairSum_Sorted_Rotated {
    public static Boolean sumTarget(ArrayList<Integer> array, int target) {

        // Breaking Point
        int bp=-1;
        for(int i=0;i<array.size();i++){
            if(array.get(i)>array.get(i+1)){
                bp=i;
                break;
            }
        }

        // Left Pointer 
        int lp= bp+1;
        //Right Pointer
        int rp = bp;
        int n= array.size();

        while(lp!=rp){

            // Case 1
            if(array.get(lp)+array.get(rp)== target){
                return true;
            }
            // Case 2
            else if(array.get(lp)+array.get(rp)>target){
                rp= (n+rp-1)%n;
            }
            // Case 3
            else{
                lp=(lp+1)%n;
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
