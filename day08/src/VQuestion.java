import java.util.Arrays;
import java.util.Scanner;

public class VQuestion {


    static int[] smallestAndLargestElement(int[]arr){
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]};
        return ans;
    }

    static  boolean isShorted(int[] arr){
        boolean check = true;

        for(int i= 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = Sc.nextInt();

        int[]arr = new int[n];
        System.out.println(" Enter "  +  n  +  " elements ");
        for(int i = 0; i< arr.length;i++){
            arr[i] = Sc.nextInt();
        }


       int[] ans = smallestAndLargestElement(arr);
        System.out.println("Smallest: " +ans[0]);
        System.out.println("Lasgest: " +ans[1]);

    }
}



