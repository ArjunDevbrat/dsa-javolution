import java.util.Scanner;

public class IIQuestion {



    static  int LastOccurrence(int[] arr, int x){
        int LastIndex = -1;
        for(int i =0; i < arr.length;i++){
            if (arr[i]==x){
                LastIndex = i;
            }
        }
        return LastIndex;
    }









    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = Sc.nextInt();

        int[]arr = new int[n];
        System.out.println("Enter" + n + "elements");
        for(int i = 0; i< arr.length;i++){
            arr[i] = Sc.nextInt();
        }
        System.out.println("Enter x");
        int x = Sc.nextInt();

        System.out.println("Lasrt Occurrance Of x:" + LastOccurrence(arr,x));
    }
}
