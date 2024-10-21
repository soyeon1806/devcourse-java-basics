package day04;

class Variable01{
    String instanceVariable;     // 인스턴스 변수: 객체가 생성될 때마다 독립적으로 생성되는 변수
    static String classVariable; // 클래스 변수: 모든 인스턴스가 공유하는 변수

    void doFunc(){
        // 지역 변수: 메소드 내에서만 유효하며, 메소드가 끝나면 사라짐
        String localVariable = "10";
        System.out.println(localVariable);

        int num1 = 10;
        System.out.println("시작");

        // 블록 안에서 선언된 변수는 해당 블록 내에서만 유효함
        {
            // int num1 = 20; // 바깥에서 이미 정의된 변수는 같은 블록 내에서 재정의할 수 없음

            System.out.println("중간");

            // num2는 블록 안에서만 사용 가능한 지역 변수
            int num2 = 10;
            System.out.println("num1 = " + num1); // 바깥에서 선언된 num1은 여전히 사용 가능
            System.out.println("num2 = " + num2); // 블록 내에서 선언된 num2 사용 가능
        }

        System.out.println("끝");
        System.out.println("num1 = " + num1); // num1은 메소드 내에서 유효하므로 출력 가능

        // 블록 외부에서는 num2를 사용할 수 없음 (컴파일 에러 발생)
        /*
         * System.out.println("num2 = " + num2); // num2는 블록을 벗어나면 사용할 수 없음
         */
    }
}

public class Ex01_Variable01{
    public static void main(String[] args) {
        // 클래스 변수는 클래스명으로 직접 접근 가능
        Variable01.classVariable = "10";
        System.out.println(Variable01.classVariable);

        // 인스턴스 변수는 객체를 통해 접근
        Variable01 v = new Variable01();
        v.instanceVariable = "10";
        System.out.println(v.instanceVariable);

        System.out.println();

        v.doFunc();
    }
}