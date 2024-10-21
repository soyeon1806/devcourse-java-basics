package day03;

class Person{
    // member field
    String name;
    int age;
    String jumin;
    double height;
    double weight;
}

public class Ex13_Object01 {
    public static void main(String[] args) {
        // 객체 변수 생성하기 (인스턴스화)
        Person p1 = new Person();
        p1.name = "이순신";
        p1.age = 44;
        p1.jumin = "111";
        p1.height = 182.0;
        p1.weight = 85;

        Person p2 = new Person();
        p2.name = "강감찬";
        p2.age = 34;
        p2.jumin = "222";
        p2.height = 180.5;
        p2.weight = 80;

        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p2.name);
        System.out.println(p2.age);
        
        // 객체가 메모리에 저장된 위치
        System.out.println(p1);
        System.out.println(p2);
    }
}
