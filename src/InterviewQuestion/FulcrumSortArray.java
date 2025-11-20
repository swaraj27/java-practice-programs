package InterviewQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FulcrumSortArray {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,-1,3,-5,1,-4,10,11);

        //Output : {-5,1,-4,2,-1,3,10,11}

        List<Integer> positive = list.stream().filter(s -> s >= 0).sorted().collect(Collectors.toList());

        List<Integer> negative = list.stream().filter(s -> s < 0).sorted().collect(Collectors.toList());

        List<Integer> finalOutput = new ArrayList<>();

        int i=0, j=0;

        while(i < negative.size() && j < positive.size()){
            negative.add(negative.get(i++));
            positive.add(positive.get(j++));
        }

        while( i < negative.size()){
            finalOutput.add(negative.get(i++));
        }

        while (j < positive.size()){
            finalOutput.add(positive.get(j++));
        }

        System.out.println("final op "+ finalOutput);

    }
}
