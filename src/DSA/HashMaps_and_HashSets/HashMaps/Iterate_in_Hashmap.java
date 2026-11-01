package DSA.HashMaps_and_HashSets.HashMaps;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.TreeMap;

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

        System.out.println();
        //---------------------------------------------------------------------------
        System.out.println("Print TreeSet");
        TreeMap<String, Integer> map1 = new TreeMap<>();
        map1.put("Aditya",89);
        map1.put("Himanshu",83);
        map1.put("Parag",13);
        map1.put("Ayushi",82);
        map1.put("Prachi",79);

        for(String key : map1.keySet()){
            System.out.println(key+" "+map1.get(key));//ye sorted print hoga
        }

    }
}
/*
Tree Set/ Tree Map -> ordered set/ordered map
Hash Set/ Hash Map -> unordered set/unorderd map
 */