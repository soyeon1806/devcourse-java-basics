public class Ex18_Operator06 {
    public static void main(String[] args) {
        // 증감 연산자 <- 단항 연산자임 (항이 하나이기 때문)

        int a = 10;
        System.out.println(a);
        a = a + 1;              // 산술 연산자
        System.out.println(a);
        a += 1;                 // 복합 대입 연산자
        System.out.println(a);
        a++;                    // 증감 연산자 (후위)
        System.out.println(a);
        ++a;                    // 증감 연산자 (전위)
        System.out.println(a);
        a--;                    //감소
        System.out.println(a);

        int a1 = 10;
        int a2 = 10;

        int b1 = ++a1; // 증가 후 대입
        int b2 = a2++; // 대입 후 증가

        System.out.println("b1 = " + b1); // 11
        System.out.println("b2 = " + b2); // 10
        System.out.println("a1 = " + a1); // 11
        System.out.println("a2 = " + a2); // 11
    }
}
