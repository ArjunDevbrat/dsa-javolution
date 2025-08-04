import java.util.Scanner;

public class pyramidPattern {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int r = Sc.nextInt();

        for (int i = 1;i <= r; i++) { //{travesing over rows}

            //print r-1 spaces
            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }

            //print 2*i -1
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
