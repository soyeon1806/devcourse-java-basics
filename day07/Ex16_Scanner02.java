package day07;

import java.util.Scanner;

public class Ex16_Scanner02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // nextLine()은 한 줄 전체를 입력받음
        System.out.print("아이디 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호 : ");
        String pw = sc.nextLine();

        System.out.println(id);
        System.out.println(pw);

        sc.close();
    }
}
