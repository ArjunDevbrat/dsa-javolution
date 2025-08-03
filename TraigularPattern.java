import java.util.Scanner;

public class TraigularPattern {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int r = Sc .nextInt();


        for(int i = r; i >= 1; i--){
            for (int j =1; j <= i; j++){

                    System.out.print("*");

            }
            System.out.println();
        }
    }

}
