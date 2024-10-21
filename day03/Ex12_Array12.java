package day03;

public class Ex12_Array12 {
    public static void main(String[] args) {
        /*
         * String의 형 변환
         * 1) String -> int => Integer.parseInt()
         * 2) String -> double => Double.parseInt()
         */

        String str1 = "1";
        String str2 = "2";

        System.out.println(str1 + str2);
        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));

        System.out.println(args[0] + args[1]);
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
    }
}
