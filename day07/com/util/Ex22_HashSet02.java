package day07.com.util;

import java.util.HashSet;

public record Ex22_HashSet02() {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", 31);
        Person p2 = new Person("박문수", 33);
        Person p3 = new Person("임꺽정", 35);

        HashSet<Person> set = new HashSet<>();
        set.add(p1);  // 중복 아님 추가됨
        set.add(p2); // 중복 아님 추가됨
        set.add(p3); // 중복 아님 추가됨

        System.out.println(set);

        System.out.println();

        Person p4 = new Person("홍길동", 31);
        set.add(p4);  // 중복된 객체, 추가되지 않음

        // HashSet 출력 (중복된 객체는 추가되지 않음)
        System.out.println(set);
    }
}
