import java.util.Scanner;

class Algebra{
    int add(int a , int b){
        int ans = a+b;
        return ans;

    }
}


public class Main {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner Sc = new Scanner(System.in);
        int x = Sc.nextInt();
        int y = Sc.nextInt();

        System.out.println("sum or input number is ");
        int ans = obj.add(x,y);
        System.out.println(ans);
    }
}