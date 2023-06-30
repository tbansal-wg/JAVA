import java.util.*;
public class Sorting{
    public static void printArr(int arr[]){
        for(int i=0 ; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }
    public static void mergeSort(int arr[] , int si , int ei){
        if(si>=ei){
            return ;
        }
        //kaam
        int mid = si+(ei-si)/2; 
        mergeSort(arr , si , mid); // left part
        mergeSort(arr , mid+1 , ei); // right part 
        merge(arr , si ,mid , ei );

    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i=si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0 ; //iterator for temp arr

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        // copy temp to original arr
        for( k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void quicksort(int arr[] , int si , int ei){
        if(si>=ei){
            return;
        }
        //pivot is last element
        int pidx= partition(arr,si,ei);
        quicksort(arr,si,pidx-1); //left part
        quicksort(arr,pidx+1,ei);  //right part

    }
    public static int partition(int arr[] , int si ,int ei){
        int pivot=arr[ei];
        int i = si-1;     // to make place for els smaller than pivot
        for(int j=si ;j<ei ;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }
    public static int search(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        //kaam
        int mid = si+(ei-si)/2;

        //case FOund
        if(arr[mid]==tar){
            return mid;
        }
        // mid on L1
        if(arr[si]<=arr[mid]){
            //case a : left
            if(arr[si]<=tar && tar<=arr[mid]){
                return search(arr,tar,si,mid);
            }else{
                //case b: right
                return search(arr,tar,mid+1,ei);
            }

        }
        //mid on L2
        else{
            // case c : right
            if(arr[mid]<=tar && tar<=arr[mid]){
                return search(arr,tar,mid+1,ei);
            }else{
                return search(arr,tar,si,mid-1);
            }
        }
    }
    public static int majorelement(int nums[]){
        int count=0;
        int majorcount = nums.length/2;
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    count++;
                }                
            }
            if(count>majorcount){
                return nums[i];
            }
        }
        return -1;
    }
    public static int inversioncount(int arr[]){
        int count =0;
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j] ){
                    count ++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]){
        int arr[] = {2,4,1,3,5};
        System.out.println(inversioncount(arr));
        // int nums[] ={2,2,1,1,1,2,3,3,3,3,3,3,3,3,3};
        // System.out.println(majorelement(nums));
        // int arr[] = { 4,5,6,7,0,1,2};
        // int target=0;
        // int taridx = search(arr,target,0,arr.length-1);
        // System.out.println(taridx);

        // quicksort(arr,0,arr.length-1);
        // mergeSort(arr , 0 , arr.length-1);
        // printArr(arr);

    }
    }
