package day02;

public class Ex17_Loop08 {
    public static void main(String[] args) {
        /*
         * 중첩 반복문
         */

        for(int i = 1; i <= 5; i++){ // 5회 반복
            System.out.println("=====");

            for(int j = 1; j <= 5; j++){ // 25 (5*5) 회 반복
                System.out.println(i + " / " + j);
            }
        }
    }
}
