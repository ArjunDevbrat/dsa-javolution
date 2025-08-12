import java.util.Scanner;

public class IVQuestion {

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


        System.out.println(" Is Shortd : " + isShorted(arr) );
    }
}

