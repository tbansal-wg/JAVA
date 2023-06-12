import java.util.*;

public class javaBasics {
    public static void main(String args[]) {
      /*
          System.out.println("Hello Tanvi!");
          System.out.println("Hello Tanvi!");
          System.out.println("Hello Tanvi!");  */


/*
          System.out.println("****");
          System.out.println("***");
          System.out.println("**");
          System.out.println("*");  */ 
          /*

          int a = 10;
          int b = 5;
          System.out.println(a);
          String name = " tanvi bansal";
          System.out.println(name); */

          /* byte b= 8;
          System.out.println(b);
          char ch = 'a';
          System.out.println(ch);
          boolean var= true; 
          float price = 10.5;
          int number = 25;
          //long
          //double
          short n = 240; // least used     */

         /*  int a = 10;
          int b = 5;
          int sum = a+b;
          System.out.println(sum);
            */
          Scanner sc = new Scanner(System.in);
          /* String input = sc.next();
          System.out.println(input);         */

          /* String name = sc.nextLine();
          System.out.println(name);

          int num = sc.nextInt();
          System.out.println(num);   */
           
           /*

          float price = sc.nextFloat();
          System.out.println(price);  */
/*
          int a = sc.nextInt();
          int b = sc.nextInt();
          int sum = a+b ;
          System.out.println(sum);  */
/*
          int a = sc.nextInt();
          int b = sc.nextInt();
          int product = a*b;
          System.out.println(product);  

          float rad  = sc.nextFloat();
          float area = 3.14f*rad*rad;
          System.out.println(area); */

         /* int a = 25;
          long b = a ; */

          /* long a = 25;
          int b = a ;
          System.out.println(b);  */ 

          //int number = sc.nextFloat(); // maine input liya integer ko par scan karwaya float ko
          //System.out.println(number); 
/*
          float number = sc.nextInt();
          System.out.println(number);        // type conversion
          */

          /* float a = 25.12f;
          int b = (int)a;
          System.out.println(b);  */

          /* char ch = 'a';
          int n = ch;
          System.out.println(n); */

         /* char a = 'a';
          char b = 'b';  */

         /* System.out.println((int)(a));
          System.out.println((int)(b));
          System.out.println(a-b);
          System.out.println(a+b); */

          /* char c = a-b;
          System.out.println(c);  */

         /* short a = 5;
          byte b = 25;
          char c = 'c';
          byte bt = (byte)(a+b+c);
          System.out.println(bt);   */
/*
          int a = 10;
          float  b = 20.25f;
          long c = 25;
          double d = 30;
          int ans = (int) (a+b+c+d);
          System.out.println(ans);   */
          /*  byte b = 5;
          byte a =(byte) (b * 2);   //typecast
          System.out.println(a);  */

          //practice questions
          // ques 1
          /*
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          int avg = (a+b+c)/2;
          System.out.println(avg);  */

          // ques2 
          /*
          int a =sc.nextInt();
          int area = a*a;
          System.out.println(area);  */

          //ques 3 
          /*
          float f1= sc.nextFloat();
          float f2 = sc.nextFloat();
          float f3 = sc.nextFloat();
          float totalbill = f1+f2+f3;
          System.out.println(totalbill); */

          //ques 4 
          /* int $ = 24;
          System.out.println($);
          */
/* 
          int x = 2, y = 5;
          int exp1 = (x * y / x);
          int exp2 = (x * (y / x));
          System.out.println(exp1);
          System.out.print(exp2);  */
/*
          int income = sc.nextInt();
          if (income<500000){
           float tax = (0*income)/100;
            System.out.println("tax to be paid is " +  tax);
          }
          else if (income>500000 && income<1000000){
            float tax = (20*income)/100;
            System.out.println("tax to be paid is " + tax);

          }
          else{
           float tax=(30*1000000)/100;
            System.out.println("tax to be paid is " + tax);
          } */
/*
          int num = 4;

          String type = ((num%2)==0)?"even":"odd";
          System.out.println(type);  */
/*
          int num  = sc.nextInt();
          String result = (num>=33)?"pass":"fail";
          System.out.println(result);
*/
/*
          int num = 2;
          switch(num){
            case 1 : System.out.println("samosa");
            break;
            case 2 : System.out.println("burger");
            break;
            case 3 : System.out.println("dosa");
            break;
            default : System.out.println("we realize we are dreamimg ");
            break;           }   */

/*
            int num = sc.nextInt();
            String type = (num>0)?"positive":"negative";
            System.out.println(type); */
/*
            double temp = 103.5;
            if(temp > 100){
              System.out.println("you have fever");
            }
            else 
            {
              System.out.println("you don't have fever");
            } */
/*
            int num = sc.nextInt();
            switch(num){
              case 1 : System.out.println("monday");
              break;

              case 2 : System.out.println("tuesday");
              break;

              case 3: System.out.println("wednesday");
              break;

              case 4 : System.out.println("thursday");
              break;

              case 5 :  System.out.println("friday");
              break;

              case 6 :  System.out.println("saturday");
              break;

              case 7 :  System.out.println("sunday");
              break;

              default :  System.out.println("invalid input"); 
            } */

            //false
            //63
/*           int year = sc.nextInt();
            String type = (year % 4 ==0)?"leap year" : "not leap year";
            System.out.println(type);

            */

            //loops
            //while loop

            /*
            int i=0;
            while(i<100){
              System.out.println("HELLO WORLD");
              i++;

              */
            // PRINT NUMBERS FROM 1 TO 10
/*
            int i = 1;
            while(i<11){
              System.out.println(i);
              i++;
            }  */
/*
            int i = sc.nextInt();
            System.out.println("printing numbers from 1 to" + i);
            int num = 1;
            while(num<=i){
              System.out.println(num);
              num++;
            }*/
            // sum of first n natural numbers
            /*

            int i = sc.nextInt();
            int sum = 0;
            int n = 0;
            while(n <=i){
              sum= sum+n;
              //System.out.println(sum);
              n++;
              //System.out.println(sum);

            }
            System.out.println(sum);  */

            //FOR LOOP
            /*
            for(int i = 1; i<=10 ; i++){
              System.out.println("Hello world");
            }*/
            // pattern printing
/*
            for(int i=1 ; i <=4;i++){
              System.out.println("****");
            } */

            /*
            int i = 1;
            while(i<=4){
              System.out.println("****");
              i++;
            }*/
            // PRINT REVERSE OF A NUMBER
            /*
            int i = 10899;
            int rev=0;            
            while(i>0){
            int lastdigit = i%10;
            rev = rev*10 + lastdigit;
            i = i/10;

            }
            i = rev;
            System.out.print(i);
            */
            // do while loop
            /*
            int i = 10;
            do{
              System.out.println("hello world");
              i--;
            }
            while(i >=0);        
            */
/*
            for (int i = 1; i <=5 ;i++){
              if(i==3){
                break;
              }
              System.out.println(i);
            }
            System.out.println("i am out of the loop");
            }*/

            // keep entering number till user enters a multiple of 10
            /*
            do{
              System.out.println("enter your number :");
              int i = sc.nextInt();
              if(i%10==0){
                System.out.println("entered multiple of 10");
                break;

              }
              System.out.println(i);
            }
            while(true);
          */
          // continue statement 
          /*
          for (int i= 1 ; i<=5 ; i++){
            if(i==3){
              continue;
            }
            System.out.println(i);  */

            // display all numbers entered by user except multiples of 10
            /* do{
              int i = sc.nextInt();

              if(i%10==0){
                System.out.println("i wont print");
                continue;
              }
              System.out.println("you entered");
              System.out.println(i);

            }
            while(true);  */

            // check if a number is prime or no
            /*
            int n = sc.nextInt();
            if(n==2){
              System.out.println(" 2 i prime");
            }
            else{
              boolean isprime=true;
              for(int i = 2; i<Math.sqrt(n) ; i++){
                if(n%i==0){
                  isprime= false;
              }
              }
              if(isprime == true){
                System.out.println(" n is prime");
              }
                else{
                System.out.println("n is not prime ");
              }
            }*/
            //loops questions

            // ques1 = 2
            // ques2 
            // sum of even and odd numbers





// think some different logic for this ques **********************




            /*
            int number ;
            int choice;
            int evensum=0;
            int oddsum=0;
            do{
              System.out.println("enter the number :");
              number = sc.nextInt();

              if(number%2==0){
                evensum+=number;
              }
              else{
                oddsum+=number;
              }
              System.out.println("do you want to contiue , 1 for yes and 0 for no :");
              choice=sc.nextInt();
            }
            while(choice==1);

            System.out.println("sum of even numbers " + evensum);
            System.out.println("sum of odd numbers" + oddsum);

            */
            //ques3

            // factorial of agiven number
            /*
            System.out.println("Enter the number");

            int i = sc.nextInt();
            
            int fact=1;
            if(i<0){
              System.out.println("invalid number");

            }
            else{
              do{
              
              fact=fact*i;
              
              //System.out.println(fact);
              i-=1;

            }
              while(i>=1);
              System.out.println("factorial of entered number is :");
              System.out.println(fact);
              

            }*/

            //ques4 
            // multiplication table of a number

            /*
            System.out.println("enter a number");
            int n = sc.nextInt();
            for(int i=1; i<=10 ; i++){
              System.out.println(n + "*" + i + "=" + n*i);
              }*/      

            // patterns 
/*
            for(int x = 1; x<=4 ; x++){
              //System.out.print("*");
              for(int y=1; y<=x;y++){
                System.out.print("*");
              }
              System.out.println();
            
            }  */
            // inverted star pattern
            /*
            for(int x = 1 ; x<=4 ; x++){
              int n=4;
              for(int y = 1 ; y<=n-x+1;y++){
                System.out.print("*");
              }
              System.out.println();
              
            }*/
            // half number pyramid
            /*
            for(int x = 1; x <=4 ; x++ ){
              for (int y = 1 ; y<=x ; y++){
                System.out.print(y);
              }
              System.out.println();  
            } */

            /*
            int n = 4;
            char ch='A';
            //outer loop
            for(int x=1;x<=4 ; x++){
              for(int y=1; y <=x ; y++ ){
                System.out.print(ch);
                ch++;
              }
              System.out.println();
             }  */


            // HOLLOW RECTANGLE PATTERN

            for(int x = 1 ; x <=4 ; x++){
              if(x==1 || x==2 || x ==3 || x==4){
                System.out.print("*");
              }
              for(int y = 1 ; y<=5 ; y++){
                if(y==1 || y==5){
                    System.out.print("*");
                }
              }
              System.out.println();
            }

             




    }
    }



              
            



// boilerplate code ( template of java code , har baar likha jayega )
// ; terminator



