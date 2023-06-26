 import java.util.*;

public class BitManipulation{
    public static void oddEven(int n){
        int bitMask = 1;
        if((n& bitMask) ==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static int getithbit(int n , int i ){
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setithbit(int n , int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int clearithbit(int n , int i){
        int bitMask = ~(1<<i);
        return n &bitMask ;
    }
    public static int updateithbit(int n , int i , int newbit){
        if(newbit == 0){
            return clearithbit(n,i);
        }
        else{
            return setithbit(n,1);
        }
    }
    public static int clearbit(int n , int i){
        int bitmask =(~0)<<i;
        return n & bitmask;
    }
    public static int clearibits(int n , int i , int j ){
        int a =((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void power(int n){
        if((n&(n-1))==0){
            System.out.println("it is power of 2");
        }
        else{
            System.out.println("not power of 2");
    }
    }
    public static int setbit(int n ){
        int bitMask =1;
        int count =0;
        while(n>0){
            if((n&bitMask)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int fastexpo(int a , int n  ){
        int ans =1 ;
        while(n>0){
            if((n&1) !=0){
                ans = ans*a;            
            }
            a=a*a;
            n=n>>1;
        }
        return ans; 
    }
    public static void main(String args[]){
        System.out.println(fastexpo(3,5));
        //System.out.println(setbit(0));
        //power(49);
       // System.out.println(clearibits(10,2,4));
        //oddEven(5);
    }
}
 