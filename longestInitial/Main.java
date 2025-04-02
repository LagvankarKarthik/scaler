import java.util.*;

public class Main{
    static String longestCommonPrefix(String[] A, int N){
        int count = 0;
        StringBuilder longestPrefix = new StringBuilder();

        for(int i = 0; i < N; i++){
            char ch = A[0].charAt(i);
            for(int j = 1; j < A.length; j++){
                if(i >= A[j].length() || A[j].charAt(i) != ch){
                    return longestPrefix.toString();
                }
                
            }
            longestPrefix.append(ch);
            
        }
        return longestPrefix.toString();
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();
        String[] A = new String[N];

        for(int i = 0; i < N; i++){
            A[i] = scn.next();
        }

        String ans = longestCommonPrefix(A, N);
        System.out.println(ans); 

        scn.close();
    }
}