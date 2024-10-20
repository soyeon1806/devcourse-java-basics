package day02;

public class Ex11_Loop02 {
    public static void main(String[] args) {
        /*
         * A B C , ... , Z 출력하기
         * (ascii 코드 활용)
         * (cf. 'A' == 65)
         */

        for (int i = 65; i <= 90; i++){
            System.out.println((char)i);
        }

        System.out.println();

        for (char ch = 'A'; ch <= 'Z'; ch++){
            System.out.println(ch);
        }
    }
}
