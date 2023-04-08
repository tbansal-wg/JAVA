import java.util.*;

public class arrays{
    public static boolean search(int matrix[][], int key ){
        for(int i=0; i <matrix.length ; i++){
            for(int j=0; j<matrix[0].length ; j++){
                if(matrix[i][j] == key){
                    System.out.println("found the element in the matrix at cell ("+ i + ","+j+ ")");
                    return true;
                }
    }
        }
        System.out.println("key not found ");
        return false; 
    }
    public static void largestnum(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i <matrix.length ; i++){
            for(int j=0; j<matrix[0].length ; j++){
                
                largest = Math.max(largest,matrix[i][j]);
            }
    }
    System.out.print("largest number is " + largest); 
    }
    public static void printspiral(int matrix[][]){
        int startRow =0;
        int startCol =0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol<=endCol){
            //top
            for(int j=startCol ; j <=endCol ;j++ ){
                System.out.print(matrix[startRow][j]+ " ");
            }
            // right
            for(int i = startRow+1 ; i<=endRow ; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            // bottom 
            for(int j=endCol-1 ; j>=startCol ; j--){
                if(startRow == endRow){
                    break; 
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i = endRow-1 ;i>=startRow+1 ; i-- ){
                if(startCol == endCol){
                    break; 
                }
                System.out.print(matrix[i][startCol]+ " ");
            }
            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
    public static int diagonalSum(int matrix[][]){ // O(n^2)
        int sum = 0;
        /* for(int i = 0 ; i <matrix.length;i++){
            for(int j = 0 ; j <matrix[0].length ; j++){
                // primary diagonal
                if(i==j){
                    sum +=matrix[i][j];
                }
                else if(i+j == matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        } */
        for(int i = 0 ; i <matrix.length;i++){ // O(n) --> optimised code for diagonal sum
            //pd
            sum+= matrix[i][i];
            //sd 
            if(i!=matrix.length-1-i){
                sum +=matrix[i][matrix.length-1-i];
        }}
        return sum;
    } 
    public static boolean staircaseSearch(int matrix[][], int key){
        int row = 0;
        int col = matrix[0].length-1;
        while(row<matrix.length && col>=0 ){
            if(matrix[row][col]==key){
                System.out.println("found key at (" + row+ "," +col+ ")");
                return true;
            }
                else if(key<matrix[row][col]){
                    col--;
                }
                else{
                    row++;
                }
            }
            System.out.println("key not found");
            return false;
    }
    public static void number(int matrix[][], int key){
        int n =0;
        for(int i = 0 ; i <matrix.length ; i++){
            for(int j = 0 ; j<=matrix[0].length-1 ; j++){
                if(key==matrix[i][j]){
                    n++;
                }
            }
        }
        System.out.print(key+ " occured " +n+ " number of times");
    }
    public static void sumofrow(int matrix[][]){
        int sum=0;

        for(int j=0 ; j <matrix.length ; j++){
            sum+=matrix[1][j];
        }
        System.out.print(sum);
    }
    public static void main(String args[]){
        int matrix[][] = {{1,4,9,},
                          {11,9,3},
                          {2,2,3}};
        sumofrow(matrix);                  

     /* int matrix[][] ={{4,7,8},
                         {8,8,7}};

        int key = 8;                         
        number(matrix , key);     */    
      /*  int matrix[][] = {{10,20,30,48},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};
        int key = 363;         
        staircaseSearch(matrix , key) ;      */  
     /*  int matrix[][] ={{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
        System.out.print(diagonalSum(matrix));  */
        //printspiral(matrix);                 
      /*  int matrix[][] = new int [3][3]; // 3*3 ka humne matrix bana diya
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i <n ; i++){
            for(int j=0; j<m ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }    
        //output
        for(int i=0; i <n ; i++){
            for(int j=0; j<m ; j++){
                System.out.print(matrix[i][j]+ " ");
    }
    System.out.println();
}
        search(matrix , 5);
        largestnum(matrix);
    } */
}
}


