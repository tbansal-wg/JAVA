public class Practicenew{

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return fact(n-1)*n;

    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return sum(n-1)+n;

    }
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static boolean sorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        
        return sorted(arr,i+1);
    }
    public static int firstoccur(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;

        }
        return firstoccur(arr,i+1,key);
        
    }
    public static void main(String args[]){
        //int n=4;
        //System.out.println(fact(n));
        //System.out.println(sum(n));
        // System.out.println(fib(n));
        int arr[]={1,2,3,9,5,5};
        System.out.println(firstoccur(arr,0,5));
        //System.out.println(sorted(arr,0));
    }
}