package DSA.HashMaps_and_HashSets.HashMaps;

import java.util.HashMap;

public class Basic_HashMaps {
    //In a hashmap , there can be 2 or more keys with same values
    //but keys are unique;
    static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aditya",89);
        map.put("Himanshu",83);
        map.put("Parag",13);
        map.put("Ayushi",82);
        map.put("Prachi",79);

        System.out.println(map);

        System.out.println(map.containsKey("Aditya"));// true

        System.out.println(map.containsValue(85));// false

        map.put("Aditya",100);// replace 89 to 100

        System.out.println(map);

        map.put("Aradhya",100);

        System.out.println(map);

        System.out.println("Size is "+map.size());//6

        map.remove("Aditya");
        System.out.println(map+" "+map.size());//5

        System.out.println(map.get("Himanshu"));//83
    }
}
