package day06;

class Person01{
    String name;
    int age;

    Person01(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Person{name = '" + name + "', age = " + age + "}";
    }

}

public class Ex01_toStringOverridig {
    public static void main(String[] args) {
        Person01 p = new Person01("홍길동", 30);
        System.out.println(p.toString());
    }
}
