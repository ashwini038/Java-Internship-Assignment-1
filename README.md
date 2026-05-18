public class Main {
    public static int findMax(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }
    public static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
    public static void main(String[] args) {

        System.out.println("Maximum: " + findMax(10, 20));

        if (isPrime(7))
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}
output
Testing Java basics
Maximum number: 20
Is 7 prime? true

2nd code
// Stream API Practice
// Complete the following using Streams

import java.util.*;
import java.util.stream.*;

class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class StreamPractice {

    public static List<String> processNames(List<String> names) {

        return names.stream()
                .filter(name -> name.length() > 3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }


    public static Map<String, List<Person>> groupByAge(List<Person> people) {

        return people.stream()
                .collect(Collectors.groupingBy(person -> {

                    if (person.getAge() < 18) {
                        return "Minor";
                    } else {
                        return "Adult";
                    }
                }));
    }


    public static int sumOfSquares(List<Integer> numbers) {

        return numbers.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        System.out.println("Testing Stream API...");

        
        List<String> names =
                Arrays.asList("Ram", "Ashiwini", "Amit", "Raj");

        System.out.println("Processed Names: " +
                processNames(names));


        List<Person> people = Arrays.asList(
                new Person("Ashiwini", 20),
                new Person("Ram", 15),
                new Person("Amit", 25)
        );

        System.out.println("Grouped By Age: " +
                groupByAge(people));

    
        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4);

        System.out.println("Sum of Squares: " +
                sumOfSquares(numbers));
    }
}
output
Testing Stream API...
Processed Names: [ASHIWINI, AMIT]
Grouped By Age: {Adult=[Ashiwini (20), Amit (25)], Minor=[Ram (15)]}
Sum of Squares: 30
