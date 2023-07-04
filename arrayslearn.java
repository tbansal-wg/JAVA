import java.util.Arrays;
public class arrayslearn{
    public static void update(int marks[]){
        for(int i=0; i<marks.length ; i++){
            marks[i] = marks[i]+1;
        }
    }
    public static int linearSearch(int numbers[] , int key){
        for(int i=1 ; i<numbers.length ; i++){
            if(numbers[i]== key){
                return i;
            }
        }
        return -1;
    }
    public static int menusearch(String menu[] , String key){
        for(int i =1;i<menu.length;i++){
            if(menu[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int largestget(int numbers[] ){
        int largest = Integer.MIN_VALUE;  // -infinity
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length ; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest>numbers[i] ){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest value is " + smallest);
        return largest;        
    }
    public static int binaryS(int numbers[],int key){
        int start=0 , end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            // comparisions
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){ //right condition so we will search in 2nd half
                start=mid+1;                
            }
            else{
                end=mid-1;                
            }
        }
        return -1;
    }
    public static void reverseA(int numbers[]){
        int first=0; 
        int last=numbers.length-1;
        while(first<last){
            // swap
            int temp = numbers[last];
            numbers[last] =numbers[first];
            numbers[first] =temp;
            first++;
            last--;
        }
        // print array
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); 
    }
    public static void pairs(int numbers[]){
        int tp=0;
        for(int i=0; i<numbers.length;i++){
            int curr = numbers[i];  // 2,4,6,8,10
            for(int j=i+1; j<numbers.length ;j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs:" + tp);
        // time complexity is O(n^2)
    }
    public static void maxSubarraysum(int numbers[]){
        int currSum =0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        // calculate prefix array
        for(int i=1; i<prefix.length ; i++){
            prefix[i] = prefix[i-1] + numbers[i];        
        }        

        for(int i=0;i <numbers.length ; i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end =j;
                currSum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxsum < currSum){
                    maxsum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxsum);
    }
    public static void kadanes(int numbers[]){
        int ms= Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<numbers.length ; i++){
            cs = cs+ numbers[i];
        if(cs<=0){
            cs =0;
        }
        ms = Math.max(cs,ms);
        }
        System.out.println("our max subarray sum is " + ms);
    }
    public static int trappedrainwater(int height[]){
        int n = height.length;
        // calculate left max boundary
        int leftMax[] = new int [n];
        leftMax[0] = height[0];
        for(int i=1; i<n ;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        //calculate right max boundaries
        int rightMax[] = new int[n];
        rightMax[n-1]= height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        //loop
        int tw =0;
        for(int i=0;i<n;i++){
            //water level = min(left max b , right max b)
            int wl =Math.min(leftMax[i],rightMax[i]);
            tw += wl - height[i];
        }
        return tw;
    }
    public static int buysell(int prices[]){
        int bp = Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(bp<prices[i]){
                int profit = prices[i]-bp;  // todays profit
                maxprofit = Math.max(maxprofit , profit);
            }
            else{
                bp=prices[i];
            }
        }
        return maxprofit;
    }
    public static boolean repeat(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }

        }
        return false;
    }
    public static int rotatearr(int nums[]){
        int newnum[]=new int [nums.length];
        int pivot = 3;
        newnum[0] =nums[pivot];
        for(int i=1;i<nums.length;i++){
            newnum[i]=nums[pivot+1];
            pivot++;
        }
        return 0;
    }
    public static void bubblesort(int arr[]){
        int swap=0;
        for(int turn =0; turn<arr.length-1 ; turn++){
            for(int j=0; j <arr.length-1-turn ; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
        }
        System.out.println(swap);
    }
    public static void printArr(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void selectionsort(int arr[]){
        for(int i=0 ; i<arr.length-1 ; i++){
            int minpos=i;
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }   
            //swap
            int temp = arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void insertionsort(int arr[]){
        for(int i=1 ; i<arr.length ; i++){
            int curr =arr[i] ;
            int prev = i-1 ;
            // finding the correct position to insert
            while( prev >=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev +1] = curr;
        }
    }
    public static void countingsort(int arr[]){
        int largest = Integer.MIN_VALUE; //largest element nikalna hoga
        for(int i=0 ; i<arr.length ;i++){
            largest=Math.max(largest , arr[i]);
        }
        int count[] =new int[largest+1]; 
        for(int i=0; i<arr.length ; i++){
            count[arr[i]]++;

        }
        //sorting 
        int j=0;
        for(int i=0;i<count.length ;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {1,4,1,3,2,4,3,7};
        countingsort(arr);
        //Arrays.sort(arr,0,3);
        //insertionsort(arr);
        //bubblesort(arr);
        printArr(arr);
       /* int nums[] = {0,1,2,4,5,6,7};
        rotatearr(nums);
        System.out.println(newnum);   */
        
       // int nums[] ={1,1,1,3,3,4,3,2,4,2};
        //System.out.println(repeat(nums));
       // int height[] = {4,2,0,6,3,2,5};
       // System.out.println(trappedrainwater(height));
       // kadanes(numbers);
       // maxSubarraysum(numbers);
        /*
        int numbers[] ={2,4,6,8,10,12,14};
        int key=100;
        System.out.println("index for key is : " + binaryS(numbers,key));
*/
        /*  int numbers[] ={1,2,6,3,5};
        System.out.println("largest number is :" + largestget(numbers)); */
       /* String menu[] = {"dosa" , "idli" , "noodles", "milk"};
        String key = "mlk";
        int ind = menusearch(menu , key);
        
        if(ind==-1){
            System.out.println(" NOT FOUND");
        }
        else{
            System.out.println(ind);
        }   */

        /*
        int numbers[]= {2,4,6,8,10,12,14,16};
        int key = 10;

        int index = linearSearch(numbers , key);
        if(index==-1){
            System.out.println(" NOT FOUND");
        }
        else{
            System.out.println(index);
        }  
*/

       /*  int marks[] = {97,98,99};
        update(marks);

        for(int i=0; i<marks.length ; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();  */
       // int marks[] = new int[100];
       // Scanner sc = new Scanner(System.in);
        //System.out.println("length of array =" + marks.length);
        /*
        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); // chem
        marks[2] = sc.nextInt(); // math

        System.out.println("phy :" + marks[0]);
        System.out.println("chem :" + marks[1]);
        System.out.println("math :" + marks[2]);
        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("percentage is : " + percentage + "%");  */

        /* int marks[] = new  int[50];
        int numbers[] = {1,2,3};        */

    }
}