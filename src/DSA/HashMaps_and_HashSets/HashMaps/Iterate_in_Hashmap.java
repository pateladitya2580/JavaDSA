package DSA.HashMaps_and_HashSets.HashMaps;

import java.util.HashMap;

public class Iterate_in_Hashmap {
    static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aditya",89);
        map.put("Himanshu",83);
        map.put("Parag",13);
        map.put("Ayushi",82);
        map.put("Prachi",79);

        for(String key : map.keySet()){// key print jis ki help se value bhi
            int val = map.get(key);// print kar sakte hai
            System.out.println(key+" "+val);
        }
        // kye vala most imp hai

        System.out.println();

        for(int val : map.values()){// khali value print karne ke liye
            System.out.println(val);
        }

        System.out.println();

        for(Object pair : map.entrySet()){// key or value ka pair print
            System.out.println(pair);// karne ke liye
        }
    }
}
