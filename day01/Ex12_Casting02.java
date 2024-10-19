public class Ex12_Casting02 {
    public static void main(String[] args) {
        int i = 10;
        
        // short s = i; // <- 자동 형변환 불가

        short s = (short)i; // 이렇게 강제 형변환을 해야 됨

        System.out.println(i);
        System.out.println(s);

        // 정수 -> 문자 강제 형변환
        char c = 'A';
        int i2 = c + 3;
        System.out.println(c);
        System.out.println(i2);
        System.out.println((char)i2);

        char c2 = (char)12;
        System.out.println(c2);
    }
}
