package dumps;

import demo.learn.Platypus;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Person {
    private int age;
    private String name;

    public Person() {
        super();
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>(
                List.of(
                new Person(44,"Tom"),
                new Person(40,"Aman"),
                new Person(40,"Peter"))
        );
        persons.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName).reversed());
        persons.forEach(p1->System.out.println(p1.getName()));

        var pool = Executors.newFixedThreadPool(5);
        Future outcome = pool.submit(()->1);
    }
}
