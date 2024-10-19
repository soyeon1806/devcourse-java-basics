public class Ex16_Operator04 {
    public static void main(String[] args) {
        /*
         * '+' 연산자
         * 기본 자료형에서는 산술
         * 문자열에선 문자열 연결 연산자
         */

         System.out.println("1" + "1"); // 11 (문자열 연결)
         System.out.println(1 + 1);     // 2  (산술 연산)

         System.out.println("1" + 1 + 1); // 111
         System.out.println(1 + "1" + 1); // 111
         System.out.println(1 + 1 + "1"); // 21
    }
}
