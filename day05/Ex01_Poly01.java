package day05;

// 부모 클래스
class Parent01{
    String data = "박문수"; // 부모 클래스의 멤버 변수

    // 부모 클래스의 생성자
    Parent01(){
        System.out.println("Parent 생성자 호출");
    }

    // 부모 클래스의 메서드 (오버라이딩 가능)
    void viewData1(){
        System.out.println("Parent viewData1() 호출");
    }

    // 부모 클래스의 메서드 (오버라이딩 가능)
    void viewData2(){
        System.out.println("Parent viewData2() 호출");
    }
}

// 자식 클래스 1
class Child01_1 extends Parent01{
    String data = "홍길동"; // 자식 클래스의 멤버 변수 (부모와 같은 이름, 하지만 오버라이딩 아님)

    // 자식 클래스 1의 생성자
    Child01_1(){
        System.out.println("Child1 생성자 호출");
    }

    // 부모 클래스의 메서드를 오버라이딩
    @Override
    void viewData1() {
        System.out.println("Child1 viewData1() 호출");
    }

    // 부모 클래스의 메서드를 오버라이딩
    @Override
    void viewData2(){
        System.out.println("Child1 viewData2() 호출");
    }
}

// 자식 클래스 2
class Child01_2 extends Parent01{
    // 자식 클래스 2의 생성자
    Child01_2(){
        System.out.println("Child2 생성자 호출");
    }

    // 부모 클래스의 메서드를 오버라이딩
    @Override
    void viewData1(){
        System.out.println("Child2 viewData1() 호출");
    }

    // 부모 클래스의 메서드를 오버라이딩
    @Override
    void viewData2(){
        System.out.println("Child2 viewData2() 호출");
    }
}

public class Ex01_Poly01 {
    public static void main(String[] args) {
        // 부모 클래스를 사용한 객체 생성
        Parent01 p1 = new Parent01();
        System.out.println(p1.data);
        p1.viewData1();
        p1.viewData2();

        System.out.println();

        // 자식 클래스를 부모 타입으로 참조 (다형성)
        /*
         * 참조 변수 p2는 Parent 타입이기 때문에
         * p2.data를 호출하면 Parent 클래스의 data 필드가 참조됨
         */
        /*
         * Parent01 p2 = new Child01_1();에서 자식 객체를 부모 클래스 타입으로 참조함
         * -> 이는 암묵적으로 허용되며, 자바의 다형성을 지원함
         * 
         * 오버라이딩된 메서드는 실제 객체 타입인 Child01의 메서드가 호출되지만,
         * 필드는 참조 타입에 따라 Parent01 클래스의 값이 출력됨
         */
        Parent01 p2 = new Child01_1();
        System.out.println(p2.data); // 부모 클래스의 멤버 변수를 참조 (오버라이딩 아님)
        p2.viewData1(); // 자식 클래스에서 오버라이딩된 메서드 호출 (다형성)
        p2.viewData2(); // 자식 클래스에서 오버라이딩된 메서드 호출 (다형성)

        System.out.println();

        p2 = new Child01_2();
        p2.viewData1(); // 자식 클래스에서 오버라이딩된 메서드 호출 (다형성)
        p2.viewData2(); // 자식 클래스에서 오버라이딩된 메서드 호출 (다형성)
    }
}
