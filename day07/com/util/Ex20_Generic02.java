package day07.com.util;

import java.util.ArrayList;

public class Ex20_Generic02 {
    public static void main(String[] args) {
        Student s1 = new Student("1001", "홍길동");
        Student s2 = new Student("1002", "박문수");
        Student s3 = new Student("1003", "임꺽정");

        // Student 타입만 저장 가능한 ArrayList 생성
        ArrayList<Student> a1 = new ArrayList<>();

        a1.add(s1);
        a1.add(s2);
        a1.add(s3);

        System.out.println(a1);

        System.out.println();

        for(int i = 0; i < a1.size(); i++){
            Student s = a1.get(i);
            System.out.println(s.getHakbun());
            System.out.println(s.getName());
        }

        System.out.println();

        for(Student s : a1){
            System.out.println(s.getHakbun());
            System.out.println(s.getName());
        }
    }
}
