import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int binary_num = Sc.nextInt();

        int ans =0;
        int power = 1;

        while (binary_num > 0){
            int unit_digit = binary_num % 10 ;
            ans +=(unit_digit * power);
            binary_num /= 10;
            power *= 2;
        }
        System.out.println(ans);
    }
}

