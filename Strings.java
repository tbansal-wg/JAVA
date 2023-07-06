import java.util.*;
public class Strings{
    public static void printLetters(String str){
        for(int i =0 ; i <str.length() ; i++){
            System.out.print(str.charAt(i) +" ");
        }
        System.out.println();
    }
    public static boolean palindrome(String name1){  // time complexity = O(n)
        for(int i = 0 ; i <(name1.length())/2 ; i++){
            if(name1.charAt(i)!=name1.charAt(name1.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static float shortestDistance(String path){
        int x =0 ;
        int y=0;
        for(int i=0 ; i<path.length() ; i++){
            char dir = path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            //north
            else if(dir =='N'){
                y++;
            }
            //west
            else if(dir == 'W'){
                x--;
            }
            //east
            else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static String substring(String str , int si , int ei){
        String substr = "";  //empty string
        for(int i=si ; i <ei ; i++ ){
            substr+= str.charAt(i);
        }
        return substr;
    }
    public static String toUpperCase(String str){   // time complexity -> O(n)
        StringBuilder  sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String compress(String str){  //time complexity --> O(n)
        String newstr = "";
        for(int i =0;i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
                count++;
                i++;
            }
            newstr+=str.charAt(i);
            if(count >1){
                newstr +=count.toString();
            }
        }
        return newstr;
    }
    public static int vowelscount(String str){
        int count =0;
        for(int i =0 ; i <str.length() ; i++){
            if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println((5&6));
        System.out.println((5|6));
        System.out.println((~0));
       /* String str1 = "race";
        String str2 = "cae";
        System.out.println(anagrams(str1, str2));  */

 /*       String str = "aeiAEIubacds";
        System.out.println(vowelscount(str));  */
      /*  String str = "aaabbcccdd";
        System.out.println(compress(str));   */
     /*   String str = "hi , i am shradha";
        System.out.println(toUpperCase(str));   */
 /*       StringBuilder sb = new StringBuilder("");
        for(char ch = 'a' ; ch<='z' ;ch++){
            sb.append(ch);   //time complexity -> O(26)
        }
        System.out.println(sb);   */
     /*   String fruits[] = {"apple" ,"mango","banana"};  // time complexity --> O(x*N)
        String largest = fruits[0];
        for(int i =1 ; i <fruits.length ; i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);  */
        //substring 
       /* String str = "HelloWorld";
        System.out.println(str.substring(0,5));
        System.out.println(substring(str,0,5));  */
  /*      String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");  */
/*
        if(s1==s2){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal ");
        }
        if(s1==s3){
            System.out.println("strings are equal");
        }-
        else{
            System.out.println("strings are not equal ");
        } */
      /*  if(s1.equals(s3)){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal ");
        }  */
     /*   String path = "WNEENESENNN";
        System.out.println(shortestDistance(path));  */
      /*  String name1 = "raar";
        System.out.println(palindrome(name1));  */
     /*   char arr[] = {'a' , 'b' , 'c' , 'd'};
        String str = "abcd";
        String str2 = new String("xyz");

        // strings are immutable
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);  */

      //  String fullname = "Tony Strak";
      //  System.out.println(fullname.length());

        //concatenation
     /*   String firstName = "TANVI";
        String lastName = "BANSAL";
        String fullname = firstName +" " + lastName ;
        printLetters(fullname); */
    }
}