import java.util.*;
import java.io.*;

public class Greedy{
    // static class Job{
    //     int deadline;
    //     int profit;
    //     int id;

    //     // constructor is made
    //     public Job(int i,int d , int p){
    //         id = i;
    //         deadline =d;
    //         profit =p;
    //     }
    // }
    public static void main(String args[]){
        int n =4, m =6;

        Integer costVer[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2};

        // sorted in descending order
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h=0,v=0;  // h -> abhi mai kon sa horizontal cut lgane waali hu , v-> abhi mai konsa vertical cut lgane waali hu 
        int hp=1, vp =1;   // hp-> horizontal pieces , vp-> vertical pieces
        int cost =0; 

        while(h< costHor.length && v< costVer.length){
            // vertical cost < horizontal cost ->>> then i will do horizontal cut
            if(costVer[v]<= costHor[h]){
                // horizontal cut
                cost+=(costHor[h]*vp);
                hp++;
                h++;
            }else{
                // vertical cut
                cost +=(costVer[v]*hp);
                vp++;
                v++;
            }
        }

        // horizontal cuts which are remaining
        while(h< costHor.length){
            cost+=(costHor[h]*vp);
            hp++;
            h++;
        }
        // vertical cuts which are remaining
        while(v< costVer.length){
            cost +=(costVer[v]*hp);
            vp++;
            v++;
        }
        System.out.println("min cost of cuts " + cost);


        // int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};
        // ArrayList<Job> jobs = new ArrayList<>();

        // for(int i=0;i<jobsInfo.length;i++){
        //     jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));

        // }
        // // lambda function
        // Collections.sort(jobs, (obj1,obj2) -> obj2.profit-obj1.profit); // i will get all profits in descending order
        // ArrayList<Integer> seq = new ArrayList<>();

        // int time =0;
        // for(int i=0;i<jobs.size();i++){
        //     Job curr = jobs.get(i);
        //     if(curr.deadline > time){
        //         seq.add(curr.id);
        //         time++;
        //     }
        // }
        // // print sequence of jobs
        // System.out.println("max jobs =" + seq.size());
        // for(int i=0;i<seq.size();i++){
        //     System.out.print(seq.get(i)+ " ");
        // }
        // System.out.println();



        // Integer coins[] = {1,2,5,10,20,50,100,500,2000};

        // Arrays.sort(coins,Comparator.reverseOrder());
        // int countofCoins =0;
        // int amount =  1059;
        // ArrayList<Integer> ans = new ArrayList<>();

        // for(int i=0;i<coins.length;i++){
        //     if(coins[i]<=amount){
        //         while(coins[i]<=amount){
        //             countofCoins++;
        //             amount -= coins[i];
        //             ans.add(coins[i]);
        //         }
        //     }
        // }
        // System.out.println(countofCoins);
        // for(int i=0;i<ans.size();i++){
        //     System.out.print(ans.get(i) +" ");

        // }
        



        // // MAX LENGTH CHAIN OF PAIRS

        // // O(nlogn)

        // int pairs[][] = {{5,24}, {39,60}, {5,28}, {27,40}, {50,90}};
        // Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));
        
        // int chainLen =1;
        // int chainEnd = pairs[0][1];  // last selected pair end 

        // for(int i=1;i<pairs.length;i++){
        //     if(pairs[i][0] > chainEnd){
        //         chainLen++;
        //         chainEnd = pairs[i][1];
        //     }
        // }
        // System.out.println(chainLen);

        // // O(nlogn) -->> because i have sorted the array and then run a single loop
        // int A[] = {1,2,3};
        // int B[]= {2,1,3};

        // Arrays.sort(A);
        // Arrays.sort(B);
        // int minDiff =0;
        // for(int i=0;i<A.length;i++){

        //     minDiff =+Math.abs(A[i]-B[i]);

        // }
        // System.out.println("min absolute difference =" + minDiff);


        // int val [] = {60,100,120};
        // int weight[] = {10,20,30};
        // int W=50;

        // double ratio[][] = new double[val.length][2];
        // // 0th col => idx ; 1st col => ratio
        // for(int i=0;i<val.length;i++){
        //     ratio[i][0]=i;
        //     ratio[i][1] = val[i]/(double)weight[i];
        // }
        // int capacity = W;
        // int finalval = 0;

        // // ascending order
        // Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        // // but we need to start from descending order so we can start the loop in reverse manner
        // for(int i=ratio.length-1;i>=0;i--){
        //     int idx = (int)ratio[i][0];
        //     if(capacity>=weight[idx]){ // include full item
        //         finalval +=val[idx];
        //         capacity -=weight[idx];
        //     }else{
        //         // include fractional item
        //         finalval +=capacity*ratio[i][1];
        //         capacity = 0;
        //         break;
        //     }
        // }
        // System.out.println(finalval);



        // int start[] = {1,3,0,5,8,5};
        // int end[]= {2,4,6,7,9,9};

        // // if end time array is not sorted then we will create a 2D array
        // int activities[][] = new int[start.length][3];
        // for(int i=0;i<start.length;i++){
        //     activities[i][0]=i;
        //     activities[i][1] =start[i];
        //     activities[i][2] =end[i];
        // }
        // // lambda function--->>> short form of big function
        // Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

        // //end time basis sorted
        // int maxAct=0;
        // ArrayList<Integer> ans = new ArrayList<>();

        // // 1st activity
        // maxAct =1;
        // ans.add(activities[0][0]);
        // int lastEnd = activities[0][2];
        // for(int i=0;i<end.length;i++){
        //     if(activities[i][1]>=lastEnd){
        //         // activity select
        //         maxAct++;
        //         ans.add(activities[i][0]);
        //         lastEnd = activities[i][2];
        //     }
        // }

        // System.out.println(maxAct);
        // for(int i=0;i<ans.size();i++){
        //     System.out.print(ans.get(i)+" ");
        // }
    }
}