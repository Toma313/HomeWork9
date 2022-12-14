package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key3", "value3");
        map.put("key2", "value2");
        map.put("keyn", "valuen");
        //System.out.println(map);
        //Set<String> stringSet= new HashSet<>(map.keySet());
        //System.out.println(stringSet);
        //Set<String> set =new HashSet<>(map.values());
        //System.out.println(set);
       List<String> list = new ArrayList<>(map.values());
        //System.out.println(list);
        for (Map.Entry<String, String> pair:map.entrySet()){
            System.out.println(pair);
        }

    }
    }

