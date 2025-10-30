package stream;

import java.util.*;
import java.util.stream.Collectors;

//Identify duplicate elements in a list.
public class FindDuplicate {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
        //Using Brute force method
        List<Integer> duplicates = new ArrayList<>();
        //With normal logic
        for (int i=0; i< numbers.size(); i++){
            for(int j= i+1; j<numbers.size(); j++){
                if(numbers.get(i) == numbers.get(j)){
                    duplicates.add(numbers.get(i));
                }
            }
        }
        System.out.println("Duplicate "+ duplicates);
        Map<Integer,Integer> findDuplicates = new HashMap<>();
        List<Integer> duplicateList = new ArrayList<>();
        for (int i=0; i<numbers.size(); i++){
            findDuplicates.put(numbers.get(i), findDuplicates.getOrDefault(numbers.get(i),0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: findDuplicates.entrySet()){
            if(entry.getValue() > 1){
                duplicateList.add(entry.getKey());
            }
        }
        System.out.println("Duplicates "+ duplicateList);

        //Using Stream
       Set<Integer> duplicateStream = numbers.stream()
                                        .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                                        .entrySet().stream()
                                        .filter(e -> e.getValue() > 1)
                                        .map(Map.Entry::getKey).collect(Collectors.toSet());

       System.out.println("Duplicates number  "+ duplicateStream);

       //find the common elements between 2 list
        List<Integer> ls1 = Arrays.asList(1,2,3,4,5);
        List<Integer> ls2 = Arrays.asList(3,4,5,6,7);

        List<Integer> common = ls1.stream().filter(ls2::contains).collect(Collectors.toList());
        System.out.println("common "+common);

        //find duplicate with another logic
        int arr[] = {1, 2, 3, 2, 4, 3, 5};
        Arrays.sort(arr);
        //1,2,2,3,3,4,5
        List<Integer> duplicate = new ArrayList<>();
        for(int num = 0; num < arr.length - 1; num ++){

            if(arr[num] == arr[num + 1]){
                duplicate.add(arr[num]);
            }

        }
        duplicate.stream().forEach(System.out::println);

    }
}
