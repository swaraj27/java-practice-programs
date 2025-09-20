package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class ListRemoveNull {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Sachin");
        names.add("Sam");
        names.add("swaraj");
        names.add("pritam");
        names.add("vikas");
        names.add("sangram");
        names.add(null);

        List<String> nonNull =  names.stream().
                                filter(Objects::nonNull) //keeps non null
                                .collect(Collectors.toList());
        System.out.println("After removing non null : "+nonNull);

        List<String> removeFirstLetter = names.stream().
                                         filter(Objects::nonNull)
                                        .map(name -> name.length() >1 ?name.substring(1):"" )
                                        .collect(Collectors.toList());
        System.out.println("remove first "+removeFirstLetter);


        //get the first character as key and store string as value in map
        Map<Character,String> filterdMap = names.stream()
                                        .filter(Objects::nonNull)
                                        .collect(Collectors.toMap(
                                                name -> name.charAt(0),//
                                                name -> name,//
                                                (oldValue,newValue) -> oldValue //
                                        ));

        System.out.println("filterdMap "+filterdMap);
    }
}
