class ArrayExample{
    void multiArrays(){
        //int [][] arr_1 = new int  [5][3];
        int[][]arr = {{25,56,45},{25,89,74},{56,65,12}};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println();

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println();

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);

    }
}

public class Main {
  public static void main(String[] args) {
       ArrayExample obj =new ArrayExample();
       obj.multiArrays();

    }

}


