import java.util.*;

public class extractingNums{
    static int extractingNumbers(String A){
        int sum = 0;
        for(int i = 0; i < A.length(); i++){
            int curr = 0;
            if(A.charAt(i) >= '0' && A.charAt(i) <= '9'){
                while(i < A.length() && A.charAt(i) >= '0' && A.charAt(i) <= '9'){
                    curr = (curr * 10) + (A.charAt(i) - '0');
                    i++;
                }
                sum += curr;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String A = in.nextLine();

        int ans = extractingNumbers(A);
        System.out.println(ans);

        in.close();
    }
}