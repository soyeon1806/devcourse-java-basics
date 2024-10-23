package day05.com;

import day05.com.example.Pack2;

public class Ex09_Package {
    public static void main(String[] args) {
        Pack1 p1 = new Pack1();

        // 패키지 안의 클래스에 접근
        day05.com.example.Pack2 p2 = new day05.com.example.Pack2();

        // import문으로 접근
        Pack2 p22 = new Pack2();

        // 긴 패키지 이름
        day05.com.example.java.test.Pack3 p3 = new day05.com.example.java.test.Pack3();
    }
}
