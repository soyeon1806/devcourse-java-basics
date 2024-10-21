package day03;

class Method01{
    /*
     * 메소드 선언하기
     * 메소드 명은 소문자로 시작하고, 동사를 사용해야 함
     */

    /*
     * return은 반드시 하나여야 함
     * void는 return이 없음을 의미함
     */

    void method1(){
        System.out.println("method1() 실행");
    }

    void method2(int a){
        System.out.println("method2() 호출 : " + a);
    }

    void method3(int a, int b, int c){
        System.out.println("method3() 호출 : " + a);
        System.out.println("method3() 호출 : " + b);
        System.out.println("method3() 호출 : " + c);
    }

    int method4(){
        int a = 10;
        int b = 20;
        int sum = a + b;
        return sum;
    }

    int method5(int a, int b){
        int sum = a + b;
        return sum;
    }
}

public class Ex14_Method01 {
    public static void main(String[] args) {
        Method01 m = new Method01();

        m.method1();
        m.method2(10);
        m.method3(20, 30, 40); // 만약 argument 개수와 매개변수 개수가 차이나면 컴파일 오류 발생

        int result = m.method4();
        System.out.println(result);

        result = m.method5(30, 40);
        System.out.println(result);
    }
}
