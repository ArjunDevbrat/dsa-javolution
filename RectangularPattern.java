import java.util.Scanner;

public class RectangularPattern {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int r = Sc .nextInt();
        int c = Sc.nextInt();

        for(int i =1; i <= r; i++){
            for (int j =1; j <= c; j++){
               // if (i ==1 || i == r || j ==1 ||j==c)
                if((i+j) % 2 ==0){
                    System.out.print(1);

                }
                //System.out.print("*");
                else
                    //System.out.print(" ");
                    System.out.print(2);
            }
            System.out.println();
        }
    }
}
