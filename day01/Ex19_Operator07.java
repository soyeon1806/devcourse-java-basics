public class Ex19_Operator07 {
   public static void main(String[] args) {
        /*
         * 비교 연산자
         * >, <, >=, <=, ==, !=
         * 결과 값은 논리값임 (true or false)
         * 주로 제어문에서 사용됨
         */

        System.out.println(10 == 5); // false
        System.out.println(10 != 5); // true

        /*
         * 논리 연산자 <- 이항 연산자임 (항이 2개이기 때문)
         * 
         * 논리합 (||) -> or
         * true || true -> true
         * true || false -> true
         * 
         * 논리곱 (&&) -> and
         * true && true -> true
         * true && false -> false
         */

         boolean bool1 = (10 > 3); // true
         boolean bool2 = (3 > 10); // false

         System.out.println(bool1 || bool2); // true
         System.out.println(bool1 && bool2); // false
   } 
}
