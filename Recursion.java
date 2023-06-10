public class Recursion{
    public static void printDec(int n ){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n +" ");
        printDec(n-1);
    }

    public static void printInc(int n ){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");

    } 
    public static int fact(int n ){
        if(n==0){
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
    public static int sum(int n ){
        if(n==0){
            return 0;
        }
        int s= sum(n-1);
        int sumn = n+sum(n-1);
        return sumn;

    }
    public static int fibonacci(int count){
        if(count ==0){
            return 0;
        }
        if(count ==1 || count == 2){
            return 1;
        }
        int fnm1 = fibonacci(count-1);
        int fnm2 = fibonacci(count-2);
        int fbn = fnm1 +fnm2 ;
        return fbn;
        // return fibonacci(count);
    }
    public static boolean issorted(int arr[] , int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1] ){
            return false;
        }

        return issorted(arr , i+1);
    }
    public static int firstO(int arr[], int key  , int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstO(arr , key , i+1);
    }
    public static int lastO(int arr[], int key , int i){
        if(i==-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastO(arr , key , i-1);
    }
    public static int power(int x , int n){
        if(n==1){
            return x;
        }
        // int xnm1 = power(x,n-1);
        int xn = x*(power(x,n-1));
        return xn;
    }
    public static int digit(int num ){
        if(num==0){
            return 0;
        }
        int sum = num%10 + digit(num/10);
        return sum;
    }
    public static int optimizedPower(int a , int n){
        if(n==0){
            return 1;
        }
        int s = optimizedPower(a,n/2);
        int halfpowersq = s*s;
        // n is odd
        if(n%2 !=0){
            halfpowersq = a* halfpowersq;
        }
        return halfpowersq;
    }    
    public static int decimaltobinary(int n,int pow ){
        if( n ==0){
            return 0;
        }
        int s = (int)Math.pow(10,pow)*(n%2)+ decimaltobinary(n/2,pow+1);
        return s;
    }
    public static int binarytodecimal(int n , int pow){
        if(n==0){
            return 0;
        }
        int s =(int)Math.pow(2,pow)* (n%10) + binarytodecimal(n/10 , pow+1);
        return s;
    }
    public static void table5(int x , int n ){
        if(n==11){
            return;
        }
        System.out.println(x*n);
        table5(x,n+1);
    }
    public static String reverseString(String s , String y , int x){
        if(x==-1){
            return " ";
        }
        y = s.charAt(x)+reverseString(s,y,x-1);
        return y;
    }
    public static int tilingproblem(int n ){// 2 x n (floor size)
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = tilingproblem(n-1);
        // horizontal choice
        int fnm2 = tilingproblem(n-2);
        //total ways
        int totways= fnm1 + fnm2;

        return totways;
    }
    public static void removeduplicates(String str,int idx , StringBuilder newstr ,boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        //kaam
        char currchar = str.charAt(idx);
        if(map[currchar-'a']==true){
            // dupliccate
            removeduplicates(str , idx+1,newstr,map );
        }else{
            map[currchar-'a']=true;
            removeduplicates(str , idx+1 , newstr.append(currchar), map);
        }
    }    
    public static int friendsPairing(int n ){
        if(n==1||n==2){
            return n;
        }
        //choice
        //single
        // int fnm1 = friendsPairing(n-1);
        // //pairing
        // int fnm2 = friendsPairing(n-2);
        // int pairWays=(n-1)*fnm2;

        // //total ways
        // int totways = fnm1 + pairWays;
        // return totways;
        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    }
    public static void printbinarystrings(int n , int lastplace , String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        // if(lastplace==0){
        //     // sit 0 on chair n 
        //     printbinarystrings(n-1 , 0 , str.append("0"));
        //     printbinarystrings(n-1 , 1 , str.append("1"));
        // }
        // else{
        //     printbinarystrings(n-1 , 0 , str.append("0"));
        // }
        printbinarystrings(n-1 , 0 , str+"0");
        if(lastplace ==0){
            printbinarystrings(n-1 , 1 , str+"1");
        }

    }
    public static void main(String args[]){
        System.out.println(power(2,4));
        //printbinarystrings(3,0,"");
        //System.out.println(friendsPairing(4));
        /*
        String str ="appnnacollege";
        removeduplicates(str,0,new StringBuilder(""),new boolean[26]);
*/
        //System.out.println(tilingproblem(5));
        /*
        String s = "tanvi";
        int x = s.length()-1;
        System.out.println(reverseString(s," ",x));
        */

        // table5(6,1);
        /*
        System.out.println(binarytodecimal(111 , 0));
        */
        //System.out.println(decimaltobinary(9,0));
                /*
        int a = 2;
        int n = 10;       
        System.out.println(optimizedPower(a ,n)); 
        */
        //System.out.println(digit(123));
        /*
        System.out.println(power(2,10));
        */
        /*
        int arr[] = {5,5,5,5,5,5};
        System.out.println(lastO(arr , 5, arr.length-1));
        */
        //System.out.println(firstO(arr,11,0));
        /*
        int arr[] = { 1 ,2 , 3 , 4 , 5};
        System.out.println(issorted(arr , 0));
        */
        /*
        int count =5;
        System.out.println(fibonacci(count));
        */
        /*
        int n = 6;
        System.out.println(sum(n));
        */
       // System.out.println(fact(n));
        //printInc(n);
    }
}