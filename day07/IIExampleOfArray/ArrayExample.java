package IIExampleOfArray;

public class ArrayExample {
    //linearSearch
    void searchinArray(){
        int[] arr = {155,5, 3, 6, 2,3, 8, 4};
        int x = 3;

        int ans = -1;

        for( int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                ans = i;
                break;
            }
        }
        System.out.println("found  " + x + " at index " + ans);
    }

    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.searchinArray();
    }

}
