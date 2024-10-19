public class Ex14_Operator02 {
    public static void main(String[] args) {
        // overflow 문제

        int i1 = 1_000_000;
        int i2 = 2_000_000;

        int product1 = i1 * i2;

        long product2 = (long) i1 * i2;

        System.out.println(product1); // -1454759936
        System.out.println(product2); // 2000000000000
    }
}