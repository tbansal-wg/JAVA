import java.util.*;

public class ClimbingStairs{

    // public static int countways(int n){

    //     // using recursion  ----------->>>>>>  O(2^n)
    //     if(n==0){
    //         return 1;
    //     }
    //     if(n<0){
    //         return 0;
    //     }
    //     return countways(n-1)+countways(n-2);
    // }

    public static int countways(int n , int ways[]){
        // using memoization  ------------>>>>>>  O(n)
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n]!=-1){ // already calculated
            return ways[n];
        }
        ways[n]= countways(n-1 , ways)+countways(n-2,ways);
        return ways[n];

    }

    public static int countwaysTab(int n){ // --------->>>>>> O(n)
        int dp[]= new int[n+1];
        dp[0]=1;

        // tabulation
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[i]=dp[i-1]+0;
            }else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }


    public static void main(String args[]){
        int n=5;
        int ways[]= new int[n+1];
        Arrays.fill(ways,-1); // all index will be filled with -1 value
        System.out.println(countways(n,ways));
        System.out.println(countwaysTab(n));

    }
}