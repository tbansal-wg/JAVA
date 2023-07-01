public class Dp{
    public static int fib(int n, int f[]){
        if(n==0||n==1){
            return n;
        }
        if(f[n]!=0){
            return f[n];
        }

        f[n]=fib(n-1,f)+fib(n-2,f);
        return f[n];

    }

    // Tabulation
    public static int fibTabulation(int n){
        int dp[]= new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String args[]){
        int n=6;
        int f[] = new int[n+1]; // size is n+1 bcoz we calulate the fibonacci from 0 to n so n+1 numbers are there
        // by 
        //System.out.println(fib(n,f));
        System.out.println(fibTabulation(n));

    }
}