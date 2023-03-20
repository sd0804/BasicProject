package org.example.collections;

import java.util.*;
import java.util.Map.Entry;

class Main {

    public static void main(String[] args) {

        // create a map and store elements to it
        HashMap<String, String> capitals = new HashMap();
        capitals.put("Nepal", "Kathmandu");
        capitals.put("India", "New Delhi");
        capitals.put("United States", "Washington");
        capitals.put("England", "London");
        capitals.put("Australia", "Canberra");

        // call the sortMap() method to sort the map
        Map<String, String> result = sortMap(capitals);

        for (Map.Entry entry : result.entrySet()) {
            System.out.print("Key: " + entry.getKey());
            System.out.println(" Value: " + entry.getValue());
        }
    }

    public static HashMap sortMap(HashMap map) {
        List <Entry<String, String>> capitalList = new LinkedList<>(map.entrySet());

        // call the sort() method of Collections
        Collections.sort(capitalList, (l1, l2) -> l1.getValue().compareTo(l2.getValue()));

        // create a new map
        HashMap<String, String> result = new HashMap();

        // get entry from list to the map
        for (Map.Entry<String, String> entry : capitalList) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
}