package day05;

interface InterA{
    // 인터페이스 상수 (자동으로 public static final)
    String STR1 = "박문수";

    // 추상 메서드 (구현 없음)
    void methodA();
}

// 인터페이스 InterB는 InterA를 상속받음 (인터페이스 간 상속 가능)
interface InterB extends InterA{
    // 인터페이스 상수 (자동으로 public static final)
    String STR2 = "홍길동";

    // 추상 메서드 (구현 없음)
    void methodB();
}

// ClassA는 인터페이스 InterB를 구현
// InterB는 InterA를 상속받았으므로, ClassA는 InterA의 메서드도 구현해야 함
class ClassA implements InterB{
    // InterA의 추상 메서드 구현
    public void methodA(){
        System.out.println("메소드A 호출");
    }

    // InterB의 추상 메서드 구현
    public void methodB(){
        System.out.println("메소드B 호출");
    }
}

public class Ex05_Interface01 {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.methodA();
        a.methodB();
    }
}
