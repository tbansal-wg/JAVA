import java.util.*;

public class IteratorsHS{
    public static void main(String args[]){
        // hashsets are unordered
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        // Iteration using iterators
        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();

        //Iteration using advanced/enhanced loop
        for(String city : cities){
            System.out.println(city);
        }
    }
}