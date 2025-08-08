class ArrayExample{
    public static void main (String[]args){
        ArrayExample obj = new ArrayExample();
        obj.maxOfArrays();


    }
    void maxOfArrays() {
        int[] arr = {155,5, 3, 6, 2, 8, 4};

        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println(" max " + ans);



        }

}



