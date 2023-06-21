public class OOPSLEARN{
    public static void main(String args[]){
        Horse h = new Horse ();
        System.out.println(h.color);
        /*
        Student s1 = new Student ();
        s1.schoolName = "JMV";

        Student s2 = new Student ();
        System.out.println(s2.schoolName);
        */
        /*
        Bear b = new Bear();
        b.eatsflesh();
        */

        /*
        Queen q= new Queen();
        q.moves(); 
        */
    }
}
class Animal{
    String color ;
    Animal(){
        System.out.println("animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super.color= "brown";
        //super();  // super keyword se animal class ka constructor call ho jayega 
        System.out.println("horse constructor is called");
    }
}
/*
class Student {
    static int returnPercentage(int math , int phy , int chem ){
        return (math + phy + chem)/3 ;
    }

    String name ;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
*/
/*
interface Herbivore{
    void eatsgrass();
}
interface Carnivore{
    void eatsflesh();
}
class Bear implements Herbivore , Carnivore{
    public void eatsgrass(){
        System.out.println("bear eats grasss");
    }
    public void eatsflesh(){
        System.out.println("bear eats flesh");
    }
}
*/
/*
interface ChessPlayer{
    void moves();   // by default public bhi hai abstract bhi hai
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up , down , left , right , diagonal in all 4 directions");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up , down , left , right ");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up , down , left , right , diagonal by 1 step");
    }
} */

