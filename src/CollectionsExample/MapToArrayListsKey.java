package CollectionsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToArrayListsKey {
    public static void main(String[] args) {
        Map<String, Integer> myMap= new HashMap<>();

        myMap.put("xyz",1);
        myMap.put("abc",2);
        myMap.put("pqr",3);

        List<Map.Entry<String,Integer>> entryList = new ArrayList<>(myMap.entrySet());
        System.out.println(entryList);
    }
}


