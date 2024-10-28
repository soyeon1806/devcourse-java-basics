package day07.com.util;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Person{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }

    @Override
    public boolean equals(Object o){
        System.out.println("Person.equals 메서드 호출");
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode(){
        System.out.println("Person.hashCode 메서드 호출");
        return Objects.hash(name, age);
    }
}
