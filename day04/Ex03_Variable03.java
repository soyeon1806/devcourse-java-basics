package day04;

class Variable03{
    /*
     * 인스턴스 멤버 필드는 자동으로 초기화 됨
     * 문자열은 null
     * 숫자는 0
     * char는 '\u0000' <- 빈 문자
     */

    String instanceVariable;
    int instanceVariable2;
    char instanceVariable3;

    void doFunc(){
        // 지역 변수는 반드시 초기화 해야 사용할 수 있음
        String localVariable;

        /*
         * System.out.println("localVariable = " + localVariable);
         * -> 컴파일 에러 발생 : variable localVariable might not have been initialized
         */
    }
}

public class Ex03_Variable03 {
    public static void main(String[] args) {
        Variable03 v = new Variable03();

        // 초기화 없이도 멤버 필드 내용 확인 가능 <- 자동 초기화 되었기 때문
        System.out.println("instanceVariable = " + v.instanceVariable);
        System.out.println("instanceVariable2 = " + v.instanceVariable2);
        System.out.println("instanceVariable3 = " + v.instanceVariable3);

        v.doFunc();
    }
}
