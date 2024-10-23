package day05;

interface Inter1{
    String STR1 = "박문수";

    void methodA();

    // 디폴트 메서드 : 기본적으로 존재해야 할 메소드
    default void methodB(){
        System.out.println("메소드B 호출");
    }
}

class Class1 implements Inter1{
    public void methodA(){
        System.out.println("메소드A 호출");
    }
}

public class Ex07_DefaultMethod01 {
    public static void main(String[] args) {
        Class1 a = new Class1();
        a.methodA();
        a.methodB();
    }
}
