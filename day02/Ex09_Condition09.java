package day02;

public class Ex09_Condition09 {
    public static void main(String[] args) {
        /*
         * 삼항 연산자는 if 문이 한 문장으로 축약된 형태임
         * 조건 ? 값1 (참인 경우) : 값2 (거짓인 경우);
         */
        int num1 = 10, num2 = 3;
        char ch = (num1 > num2) ? 'a' : 'b';
        System.out.println(ch);

        int a = 12, b = 10, c = 4;
        ch = (a < b && b < c) ? 'a' : 'b';
        System.out.println(ch);
    }
}
