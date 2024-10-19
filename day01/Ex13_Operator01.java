public class Ex13_Operator01 {
    public static void main(String[] args) {
        // 정수 / 정수 = 정수
        System.out.println(3 / 2);
        System.out.println(5 / 2);

        // 정수 / 실수 = 실수
        System.out.println(5 / 2.0);
        System.out.println(5 / (double)2);

        int i1 = 5;
        int i2 = 2;
        // int result = i1 / i2; // <- 정수로 나옴
        double result = i1 / (double)i2;
        System.out.println(result);
    }
}
