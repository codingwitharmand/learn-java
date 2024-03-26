package com.cwa.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Practice {

    //TODO: Create a framework that processes a collection of objects
    // (e.g., Person entities with attributes like name, age, and email).
    // This framework should provide functionalities to filter, sort, and perform
    // various aggregate operations on the collection,
    // similar to what you might find in a database or a data processing library.
    // Use Generics to allow your framework to work with any type of object.

    public static void main(String[] args) {

        Repository<Person> personRepository = buildPersonRepository();

        // Find person under 25
        List<Person> personsUnder25 = personRepository.findByCriterion(person -> person.getAge() < 25);
//        personsUnder25.stream().forEach(System.out::println);

        // Sorted persons
        List<Person> sortedList = personRepository.sorted(Comparator.comparing(Person::getName));
//        sortedList.stream().forEach(System.out::println);

        // Get only emails
        List<String> emails = personRepository.findAll().stream().map(Person::getEmail).collect(Collectors.toList());
        emails.stream().forEach(System.out::println);

        // Get average age
        double averageAge = personRepository.findAll().stream().mapToInt(Person::getAge).average().orElse(0);
        System.out.println("The average is " + averageAge);

        // Sum of age
        int sumAge = personRepository.findAll().stream().mapToInt(Person::getAge).sum();
        System.out.println("The sum of ages is " + sumAge);

        // Get first person with name starting with J
        Optional<Person> personOptional = personRepository.findFirstByCriterion(p -> p.getName().startsWith("J"));
        personOptional.ifPresent(System.out::println);


//        personRepository.findAll().forEach(System.out::println);
    }

    static Repository<Person> buildPersonRepository() {
        Repository<Person> personRepository = new Repository<>();

        personRepository.add(new Person("John Doe", 30, "john.doe@example.com"));
        personRepository.add(new Person("Jane Doe", 25, "jane.doe@example.com"));
        personRepository.add(new Person("Sam Smith", 28, "sam.smith@example.com"));
        personRepository.add(new Person("Alex Johnson", 35, "alex.johnson@example.com"));
        personRepository.add(new Person("Chris Lee", 22, "chris.lee@example.com"));
        personRepository.add(new Person("Pat Taylor", 33, "pat.taylor@example.com"));
        personRepository.add(new Person("Taylor Jordan", 29, "taylor.jordan@example.com"));
        personRepository.add(new Person("Jamie Parker", 24, "jamie.parker@example.com"));
        personRepository.add(new Person("Casey Smith", 27, "casey.smith@example.com"));
        personRepository.add(new Person("Drew Morgan", 31, "drew.morgan@example.com"));

        return personRepository;
    }
}
