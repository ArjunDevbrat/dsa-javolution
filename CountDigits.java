// (Q) Count the  number of digits for a given number n!

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        int n = Sc.nextInt();
        int numOfDigits = 0;
        int original_n =n;

        while (n > 0){
            n = n/10;
            numOfDigits++;
        }
        System.out.println("number of digits in "+ n + "=" + numOfDigits);
    }
}
