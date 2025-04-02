import java.util.*;

public class Main{
    public static int highestCommonFactor(int A, int B){

        int min = Math.min(A, B);
        int commonFactor = min;

        for(int i = min; i >= 1; i--){
            if(A % i == 0 && B % i == 0){
                commonFactor = i;
                return commonFactor;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();

        int ans = highestCommonFactor(A, B);

        System.out.print(ans);

        in.close();
    }
}