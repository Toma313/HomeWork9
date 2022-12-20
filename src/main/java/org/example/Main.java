package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(8518, "value1");
        map.put(5223, "value3");
        map.put(9656, "value2");
        map.put(7686, "valuen");
        //System.out.println(map);
        //Set<String> stringSet= new HashSet<>(map.keySet());
        //System.out.println(stringSet);
        //Set<String> set =new HashSet<>(map.values());
        //System.out.println(set);
      // List<String> list = new ArrayList<>(map.values());
        //System.out.println(list);
//        for (Map.Entry<Integer, String> pair:map.entrySet()){
//            System.out.println(pair.sort);
//        }
        Set<Integer> set = new TreeSet<>(map.keySet());
        for(Integer s:set){
            System.out.println(s+"="+map.get(s));
        }

    }
    }

