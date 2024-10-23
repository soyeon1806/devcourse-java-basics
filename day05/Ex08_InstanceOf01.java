package day05;

abstract class E{

}

interface I {
    void method();
}

class E1 extends E implements I{
    public void method(){

    }
}

class E2 extends E{

}

public class Ex08_InstanceOf01 {
    public static void main(String[] args) {
        E1 e1 = new E1();
        E2 e2 = new E2();

        E e11 = new E1();
        E e12 = new E2();

        // instanceof
        // -> 특정 클래스나 인터페이스의 인스턴스인지 여부를 확인하는 데 사용됨
        // 형 변환이 가능하면 true !

        System.out.println(e11 instanceof E1);
        System.out.println(e12 instanceof E2);
        System.out.println(e11 instanceof E2);

        System.out.println();

        // 부모 타입도 true
        System.out.println(e11 instanceof E);
        System.out.println(e12 instanceof E);

        System.out.println();
        
        System.out.println(e1 instanceof I);
        I i1 = e1; // 형변환 가능
        
        System.out.println();

        System.out.println(e2 instanceof I);
        // I i1 = e2; // <- 형변환 불가
    }
}
