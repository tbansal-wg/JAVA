public class patterns{
    public static void hollowRectangle(int rows , int columns){
        // outer loop
        for(int i = 1 ; i<=rows ; i++){
            // inner loop
            for(int j = 1 ; j<= columns ; j++){
                // cell(i,j)
                if(i==1 ||i==rows || j ==1||j==columns){
                    System.out.print("*");                
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void pyramid(int rows , int columns){
        for(int i = 1; i<=rows ; i++){
            for(int j = 1; j<=rows-i ;j++){
                System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }           
            System.out.println();
        }
    }
    public static void halfpyramid(int rows){
        for(int i=1 ; i<=rows ; i++){
            for(int j = 1 ; j <=rows+1-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floydtriangle(int rows){
        int n=1;
        for(int x=1; x<=rows ; x++){
            for(int j=1;j<=x ;j++){
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }        
    }
    public static void zeroneTriangle(int rows){
        
        
        for(int x=1; x<=rows ; x++){
            
            for(int j=1;j<=x;j++){
                if((x+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");               
            }
            }
            System.out.println();
        }
    }
    public static void butterfly(int rows ){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            for(int j=1 ;j<=2*(rows-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows ; i>=1 ;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(rows-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void rhombus(int rows){
        for(int x=1; x<=rows ; x++){
            for(int j=1;j<=rows-x;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=rows;j++){
                System.out.print("*");
            }
           /* for(int j=1;j<=x-1;j++){
                System.out.print(" ");
            }*/
            System.out.println();
        }
    }
    public static void holrhombus(int rows){
        for(int x=1;x<=rows;x++){
            for(int j=1;j<=rows-x;j++){
                System.out.print(" ");
            }
            // hollow rectangle
            for(int j=1;j<=rows;j++){
                if(x==1 ||x==rows||j==1||j==rows){
                    System.out.print("*");
                }               
                else{
                    System.out.print(" ");
                }                
            }
            System.out.println();           
        }
    }
    public static void diamond(int rows){
        for(int x=1;x<=rows;x++){
            for(int j=1;j<=rows-x;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*x-1 ; j++){
                System.out.print("*");
            }
            for(int j=1;j<=rows-x;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int x=rows ; x>=1 ; x--){
            for(int j =1; j<=rows-x ; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*x-1 ; j++){
                System.out.print("*");
            }
            for(int j=1 ; j<=rows-x ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }          
    }
    public static void main(String args[]){
        diamond(7);
        //holrhombus(5);
        //rhombus(5);
       // butterfly(20);
          //  zeroneTriangle(5);
       // floydtriangle(5);
        //halfpyramid(5);
        //pyramid(4,4);
        //hollowRectangle(4,5);
    }
    }

