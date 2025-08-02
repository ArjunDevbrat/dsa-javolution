import java.util.Scanner;

public class sunSeries {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int ans = 0;

        for(int i = 1; i <=n; i++){
            if (i % 2==0){
                ans -=i;
            }
            else{
                ans+=i;

            }

        }
        System.out.println(ans);
    }
}
