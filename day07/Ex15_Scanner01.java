package day07;

import java.util.Scanner;

public class Ex15_Scanner01 {
    public static void main(String[] args) {
        // Scanner 객체를 사용하여 콘솔 입력 받기
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        String msg = sc.next(); // next() 메서드는 공백 이전까지의 문자열을 입력받음

        System.out.println("입력 : " + msg);

        // Scanner 객체 닫기 (자원 해제)
        sc.close();
    }
}
