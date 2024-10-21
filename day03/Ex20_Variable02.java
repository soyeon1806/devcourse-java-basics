package day03;

class Variable02{
    String instanceVariable;     // 인스턴스 변수 -> 객체마다 고유하게 가지는 데이터
    static String classVariable; // 모든 객체가 동일한 값을 공유함

    /*
     * 인스턴스 메서드
     * -> 객체마다 다르게 동작하는 메서드임
     */

    void doFunc1(){
        System.out.println("doFunc1() 호출 : " + this.instanceVariable);
    }

    /*
     * 클래스 메서드
     * -> static 키워드로 선언된 메서드
     * -> 클래스 자체에 속한 메서드임
     */

    static void doFunc2(){
        /*
         * System.out.println("doFunc2() 호출 : " + this.instanceVariable);
         * -> 이거를 실행하면 에러 발생
         *    -> non-static variable this cannot be referenced from a static context
         *       == 클래스 메서드에서는 인스턴스 변수를 참조할 수 없음
         */

        System.out.println("doFunc2() 호출");
    }
}

public class Ex20_Variable02 {
    public static void main(String[] args) {
        Variable02 v1 = new Variable02();
        Variable02 v2 = new Variable02();

        v1.instanceVariable = "홍길동";
        v2.instanceVariable = "박문수";

        v1.doFunc1();
        v2.doFunc1();

        Variable02.doFunc2();
    }
}
