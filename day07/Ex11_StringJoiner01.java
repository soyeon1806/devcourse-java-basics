package day07;

import java.util.StringJoiner;

public class Ex11_StringJoiner01 {
    public static void main(String[] args) {
        // 문자열 연결 방법

        // 1. + 연산자를 이용한 문자열 연결
        String fruits1 = "사과" + ", " + "수박" + ", " + "딸기" + ", " + "참외";
        System.out.println(fruits1);

        // 2. String.concat() 메서드를 이용한 문자열 연결
        String fruits2 = "사과".concat(", ").concat("수박").concat(", ").concat("딸기").concat(", ").concat("참외");
        System.out.println(fruits2);

        // 3. String.join() 메서드를 이용한 문자열 연결
        String fruits3 = String.join(", ", "사과", "수박", "딸기", "참외");
        System.out.println(fruits3);

        // 4. String.format() 메서드를 이용한 문자열 연결
        String fruits4 = String.format("%s, %s, %s, %s", "사과", "수박", "딸기", "참외");
        System.out.println(fruits4);

        // 5. StringJoiner를 이용한 문자열 연결
        StringJoiner sj = new StringJoiner(",");
        sj.add("사과").add("수박").add("딸기").add("참외");
    }
}
