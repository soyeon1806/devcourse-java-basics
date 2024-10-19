public class Ex09_DataType05 {
    public static void main(String[] args){
        /*
         * 정수
         * byte
         * short
         * int
         * long
         */

        int i = 10;
        System.out.println(i);

        byte b = 10;
        short s = 10;
        System.out.println(b);
        System.out.println(s);

        // 진법
        int i2 = 0b1010; // 2진법
        int i8 = 030;    // 8진법
        int i16 = 0xA4;  // 16진법

        // 10진법으로 출력
        System.out.println(i2);
        System.out.println(i8);
        System.out.println(i16);

        // 10진법을 다른 진법으로 출력
        System.out.printf("%s%n", Integer.toBinaryString(7)); // 2진법
        System.out.printf("%o%n", 9);                   // 8진법
        System.out.printf("%x%n", 15);                  // 16진법

        // 큰 수 표기법
        int i3 = 1_000_000_000;
        System.out.println(i3);
    }
}
