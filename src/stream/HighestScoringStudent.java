package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Find top 3 by score
public class HighestScoringStudent {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Alice",85),
                new Student("Bob",92),
                new Student("Charlie",88),
                new Student("Dave",78),
                new Student("Eve", 91)
        );

        List<Student> topThree = students.stream().sorted(Comparator.comparingInt((Student s) -> s.score).reversed())
                .limit(3).collect(Collectors.toList());
        System.out.println("top Three "+ topThree);

    }
}

class Student {

    String name;
    int score;


    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}