package day03;

class Variable{
    // 인스턴스 멤버 필드
    String instanceVariable;

    /*
     * 클래스 멤버 필드
     * -> static으로 정의됨
     * -> 모든 객체가 동일한 값을 공유함
     */
    
     static String classVariable;
}

public class Ex19_Variable01 {
    public static void main(String[] args) {
        Variable v1 = new Variable();
        Variable v2 = new Variable();

        v1.instanceVariable = "홍길동";
        v2.instanceVariable = "박문수";
        
        System.out.println(v1.instanceVariable);
        System.out.println(v2.instanceVariable);

        System.out.println();

        // v1 인스턴스 변수를 변경해도 v2 인스턴스 변수에는 영향이 없음
        v1.instanceVariable = "임꺽정";

        System.out.println(v1.instanceVariable);
        System.out.println(v2.instanceVariable);

        System.out.println();

        // v1의 클래스 변수를 변경하면, v2의 클래스 변수도 변경됨
        v1.classVariable = "홍길동";
        
        System.out.println(v1.classVariable);
        System.out.println(v2.classVariable);

        System.out.println();

        // v2의 클래스 변수를 변경하면, v1의 클래스 변수도 변경됨
        v2.classVariable = "강감찬";

        System.out.println(v1.classVariable);
        System.out.println(v2.classVariable);

        System.out.println();

        // 공유하는 class 변수는 혼동되지 않도록 아래와 같이 클래스 명을 사용함
        System.out.println(Variable.classVariable);
    }
}
