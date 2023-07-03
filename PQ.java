import java.util.PriorityQueue;
import java.util.*;

public class PQ{

    // static class Student implements Comparable<Student>{
    //     String name;
    //     int rank;

    //     public Student(String name, int rank){
    //         this.name = name;
    //         this.rank = rank;
    //     }

    //     @Override
    //     public int compareTo(Student s2){
    //         return this.rank-s2.rank;
    //     }
    // }
    // static class Heap{
    //     ArrayList<Integer> arr= new ArrayList<>();

    //     public void add(int data){  //O(logn)
    //         // add at last index

    //         arr.add(data);
    //         int x=arr.size()-1; // x is child index ( data added at the last of the arraylist )            
    //         int par = (x-1)/2;

    //         while(arr.get(x)<arr.get(par)){   //O(logn)
    //             //swap
    //             int temp=arr.get(x);
    //             arr.set(x,arr.get(par));
    //             arr.set(par,temp);

    //             x=par;
    //             par=(x-1)/2;
    //         }
    //     }
    //     public int peek(){
    //         return arr.get(0);
    //     }

    //     private void heapify(int i){
    //         int left = 2*i+1;
    //         int right= 2*i+2;
    //         int minidx=i;

    //         if(left<arr.size() && arr.get(minidx)>arr.get(left)){
    //             minidx=left;
    //         }
    //         if(right<arr.size() && arr.get(minidx)>arr.get(right)){
    //             minidx=right;
    //         }
    //         if(minidx!=i){
    //             //swap
    //             int temp= arr.get(i);
    //             arr.set(i,arr.get(minidx));
    //             arr.set(minidx,temp);

    //             heapify(minidx);
    //         }
    //     }

    //     public int remove(){
    //         int data = arr.get(0);

    //         //step1 - swap first and last
    //         int temp = arr.get(0);
    //         arr.set(0,arr.get(arr.size()-1));
    //         arr.set(arr.size()-1,temp);

    //         // step2 - delete last
    //         arr.remove(arr.size()-1);

    //         //step3 - heapify
    //         heapify(0);
    //         return data;
    //     }
        
    //     public boolean isEmpty(){
    //         return arr.size() == 0;
    //     }
    // }
    public static void heapify(int arr[],int i,int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxidx = i;

        if(left<size && arr[left]>arr[maxidx]){
            maxidx=left;
        }
        if(right<size && arr[right]>arr[maxidx]){
            maxidx=right;
        }
        if(maxidx!=i){
            //swap
            int temp=arr[i];
            arr[i]=arr[maxidx];
            arr[maxidx]=temp;

            heapify(arr,maxidx,size);
        }

    }
    public static void heapSort(int arr[]){
        // step 1 - build maxHeap
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        //step 2 - push largest at end
        for(int i=n-1;i>=0;i--){
            //swap the fisrt index with the last index
            int temp =arr[0];
            arr[0]=arr[i];
            arr[i]=temp;


            heapify(arr,0,i);
        }
    }
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x,int y,int distSq,int idx){
            this.x=x;
            this.y=y;
            this.distSq=distSq;
            this.idx=idx;
        }

        @Override
        public int compareTo(Point p2){
            return this.distSq-p2.distSq; // sorting will happen in ascending order
        }
    }
    static class Row implements Comparable<Row>{
        int soldiers;
        int idx;

        public Row(int soldiers,int idx){
            this.soldiers=soldiers;
            this.idx=idx;
        }

        @Override
        public int compareTo(Row r2){
            if(this.soldiers==r2.soldiers){
                return this.idx-r2.idx;
            }
            else{
                return this.soldiers-r2.soldiers;
            }
        }

    }
    static class Pair implements Comparable<Pair>{
        int val;
        int idx;

        public Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int compareTo(Pair p2){
            // //ascending
            // return this.val-p2.val;

            //descending 
            return p2.val-this.val;
        }
    }

    public static void main(String args[]){    

                          // sliding window maximum
                                               // O(nlogn)
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k=3; //window size
        int res[]=new int[arr.length-k+1];

        PriorityQueue<Pair> pq= new PriorityQueue<>();

        //1st window elements store
        for(int i=0;i<k;i++){
            pq.add(new Pair(arr[i],i));
        }
        res[0]=pq.peek().val;

        for(int i=k;i<arr.length;i++){
            while(pq.size()>0&&pq.peek().idx<=(i-k)){
                pq.remove();

            }
            pq.add(new Pair(arr[i],i));
            res[i-k+1]=pq.peek().val;
        }

        //print result
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();




        // int army[][] = {{1,0,0,0},
        //                 {1,1,1,1},
        //                 {1,0,0,0},
        //                 {1,0,0,0}};
        // int k=2;                
        // PriorityQueue<Row> pq = new PriorityQueue<>();
        // for(int i=0;i<army.length;i++){
        //     int count=0;
        //     for(int j=0;j<army[0].length;j++){
        //         count+= army[i][j]==1 ? 1:0;
        //     }
        //     pq.add(new Row(count,i));
        // }
        // for(int i=0;i<k;i++){
        //     System.out.println("R"+pq.remove().idx);
        // }

        // int ropes[]={2,3,3,4,6};

        // //create priority queue and save integers value in it
        // PriorityQueue<Integer> pq= new PriorityQueue<>();
        // for(int i=0;i<ropes.length;i++){
        //     pq.add(ropes[i]);
        // }

        // int cost=0;
        // while(pq.size()>1){
        //     int min=pq.remove();
        //     int min2= pq.remove();
        //     cost+=min+min2;
        //     pq.add(min+min2);
        // }

        // System.out.println("cost of connecting n ropes ="+cost);

        // int pts[][]={{3,3},{5,-1},{-2,4}};
        // int k=2;

        // PriorityQueue<Point> pq = new PriorityQueue<>();
        // for(int i=0;i<pts.length;i++){
        //     int distSq= pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
        //     pq.add(new Point(pts[i][0],pts[i][1],distSq,i));
        // }

        // //nearest k cars
        // for(int i=0;i<k;i++){
        //     System.out.println("C"+pq.remove().idx);
        // }
        // int arr[] = {1,2,4,5,3};
        // heapSort(arr);
        // //print 
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        // Heap h= new Heap();
        // h.add(3);
        // h.add(4);
        // h.add(1);
        // h.add(5);

        // while(!h.isEmpty()){
        //     System.out.println(h.peek());
        //     h.remove();
        // }
        
        // PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // pq.add(new Student("A",4));  //O(logn)
        // pq.add(new Student("B",5));
        // pq.add(new Student("C",2));
        // pq.add(new Student("D",12));

        // while(!pq.isEmpty()){
        //     System.out.println(pq.peek().name+"->"+pq.peek().rank); //peek in constant time  --->> O(1)
        //     pq.remove(); //O(logn)

        }
    }
