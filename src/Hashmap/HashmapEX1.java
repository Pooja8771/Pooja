package Hashmap;
import java.util.HashMap;
public class HashmapEX1 {
    public static void main(String[] args) {
        // create an empty hashmap by declaring object of String and Integer.
        HashMap<String, Integer> map = new HashMap<>();

        //adding elements to Map using standard put method
        map.put("vishal", 10);
        map.put("pooja", 12);
        map.put("raj", 20);
        map.put("shyam", 30);

        // print size of Map
        System.out.println("Size of the Map :" + map.size());

        // print the elements  in the object of Map
        System.out.println(map);

      //checking if map contains key print value
        if(map.containsKey("raj")){
            System.out.println(map.get("raj"));
        }
    }
}

