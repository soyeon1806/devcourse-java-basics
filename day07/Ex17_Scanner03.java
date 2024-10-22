package day07;

import java.util.Scanner;

public class Ex17_Scanner03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("구구단 단수를 입력하세요 : ");
        int dansu = Integer.parseInt(sc.nextLine());

        for(int i = 1; i <= 9; i++){
            System.out.println(dansu + " X " + i + " = " + (dansu * i));
        }

    }
}
