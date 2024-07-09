

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;
public class hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);
        System.out.println(set.size());
//        set.remove(2);s
        if(!set.contains(2)){
            System.out.println("does not contain 2");
        }else{
            System.out.println("2 exists");
        }
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
//        System.out.println(it.next());  // sirf 3 q print hua ??

        // chaliye hashmap shuru krte he
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 140);
        map.put("china", 150);
        map.put("US", 50);
        map.put("pakistan", 30);
        System.out.println(map);
        map.put("china", 160);
        System.out.println(map);
        if(map.containsKey("indonesia")){
            System.out.println("indonesia exist");
        }else{
            System.out.println("indonesia does not exist");
        }

        System.out.println(map.get("India"));
        for(Map.Entry<String, Integer> e : map.entrySet()){
//            int k = map.getKey(words[i].charAt(j))
//            map.remove(k);
            System.out.print(e.getKey()+"-->");
            System.out.println(e.getValue());
        }
//        Map.Entry<String, Integer> e : map.entrySet();
//        System.out.println(e.getKey(160));


    }

}
