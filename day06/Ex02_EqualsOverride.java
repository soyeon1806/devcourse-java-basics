package day06;

class Person02 {
    String name;
    int age;

    Person02(String name, int age){
        this.name = name;
        this.age = age;
    }

    // equals 메서드를 오버라이딩하여 객체 비교를 구현함
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true; // 같은 객체인 경우 true
        if (obj == null || getClass() != obj.getClass()) return false; // 타입 확인
        Person02 person = (Person02) obj;
        return age == person.age && name.equals(person.name);
    }
}

public class Ex02_EqualsOverride {
    public static void main(String[] args) {
        Person02 p1 = new Person02("홍길동", 25);
        Person02 p2 = new Person02("홍길동", 25);

        System.out.println(p1.equals(p2));
    }
}
