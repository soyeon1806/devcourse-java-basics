package day03;

class Person{
    // 클래스는 멤버 필드와 메서드로 구성되어 있음

    // 멤버 필드
    String name;
    int age;
    String jumin;
    double height;
    double weight;

    // 메서드
    void smile(){
        System.out.println("웃다 " + this);      // 자기 자신 객체 (메모리 주소)
        System.out.println("웃다 " + this.name); // 자기 자신의 이름
    }

    void eat() {
        System.out.println("먹다");
    }

    void sleep() {
        System.out.println("자다");
    }
}

public class Ex16_Method03 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "이순신";
        p1.age = 44;
        p1.jumin = "111";
        p1.height = 182.0;
        p1.weight = 85;

        p1.smile();
        p1.eat();
    }
}
