package day07.com.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Ex24_HashMap02 {
    public static void main(String[] args) {
        // 사용자 정의 클래스도 Map에 지정 가능
        // 1. Student 객체 생성 (학번과 이름을 인자로 전달)
        Student s1 = new Student("1001", "박문수");
        Student s2 = new Student("1002", "홍길동");
        Student s3 = new Student("1003", "임꺽정");

        // 2. HashMap 생성 (키는 String 타입, 값은 Student 객체 타입)
        HashMap<String, Student> map = new HashMap<>();

        // 3. HashMap에 키-값 쌍으로 Student 객체 추가
        map.put("a", s1);  // "a" 키에 박문수 객체 추가
        map.put("b", s2);  // "b" 키에 홍길동 객체 추가
        map.put("c", s3);  // "c" 키에 임꺽정 객체 추가

        System.out.println(map);

        System.out.println();

        /*
         * 실습 문제
         * HashMap의 키셋과 값컬렉션을 추출하고, 반복문으로 출력하기
         */

        Set<String> keys = map.keySet();
        for(String k : keys){
            System.out.println(k);
        }

        System.out.println();

        Collection<Student> values = map.values();
        for(Student s : values){
            System.out.println(s);
        }
    }
}