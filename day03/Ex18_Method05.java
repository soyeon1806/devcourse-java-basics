package day03;

class Method05{

    // 가변인자 (Varargs) : 하나의 메서드에 여러 개의 인자를 전달할 수 있도록 하는 기능
    void doFunc2(int... args){
        System.out.println("doFunc(int... args) 호출");

        /*
         * 내부적으로 배열처럼 처리 됨
         * -> 길이 확인 가능
         * -> 반복문 사용 가능
         */
        
        System.out.println(args.length);
        
        for(int arg : args){
            System.out.println(arg + ", ");
        }
        System.out.println();
    }
}

public class Ex18_Method05 {
    public static void main(String[] args) {
        Method05 m = new Method05();
        m.doFunc2(10);
        m.doFunc2(10, 20);
        m.doFunc2(10, 20, 30, 40);
    }
}
