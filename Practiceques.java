public class Practiceques{
    public static void reverseArray(int num[]){
        int first=0;
        int last=num.length-1;
        while(first<last){
            int temp= num[last];
            num[last]=num[first];
            num[first]=temp;
            first++;
            last--;
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i] + " ");
        }
    }
    public static void main(String args[]){
        int num[] ={1,2,3,4,5};
        reverseArray(num);
    }
}