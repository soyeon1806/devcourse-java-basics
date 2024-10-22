package day05;

class Parent03 {
    String data = "Parent data";
    void viewData() {
        System.out.println("Parent viewData() 호출");
    }
}

class Child03_1 extends Parent03 {
    String data = "Child1 data";
    @Override
    void viewData() {
        System.out.println("Child1 viewData() 호출");
    }
}

class Child03_2 extends Parent03 {
    String data = "Child2 data";
    @Override
    void viewData() {
        System.out.println("Child2 viewData() 호출");
    }
}

public class Ex03_Poly03 {
    public static void main(String[] args) {
        // 1. 부모 타입으로 자식 객체를 참조하는 업캐스팅(Upcasting)
        Parent03 p1 = new Child03_1(); // Child1 객체를 Parent 타입 변수에 저장
        p1.viewData();                 // 결과: "Child1 viewData() 호출" (오버라이딩된 메서드 호출)
        // 참조 타입은 Parent지만 실제 객체는 Child1이므로 자식 클래스의 메서드가 호출됨
        System.out.println(p1.data);   // 결과: "Parent data" (필드는 참조 타입 기준)

        // 2. 부모 타입의 변수를 자식 타입으로 변환하는 다운캐스팅(Downcasting)
        Child03_1 c1 = (Child03_1) p1; // Parent 타입 p1을 다시 Child1 타입으로 다운캐스팅
        c1.viewData();                 // 결과: "Child1 viewData() 호출" (정상적으로 자식 클래스의 메서드 호출)
        System.out.println(c1.data);   // 결과: "Child1 data" (자식 클래스의 필드 사용 가능)

        // 3. 부모 객체를 자식 타입으로 캐스팅 시도 - 오류 발생 (ClassCastException)
        Parent03 p2 = new Parent03(); // Parent 객체 생성
        // Child1 c2 = (Child1) p2; // 잘못된 다운캐스팅, 이 코드를 실행하면 ClassCastException 발생
        // 이유: p2는 실제로 Parent 객체이므로 Child1 타입으로 변환할 수 없음
        // 런타임 예외 발생을 피하려면 이 코드를 실행하지 않아야 함

        // 4. 안전한 형변환을 위한 instanceof 체크
        if (p2 instanceof Child03_1) {
            Child03_1 c2 = (Child03_1) p2; // 안전하게 캐스팅 수행
            c2.viewData();
        } else {
            System.out.println("p2는 Child1 타입이 아닙니다."); // 결과: "p2는 Child1 타입이 아닙니다."
        }

        // 5. 또 다른 자식 클래스로의 업캐스팅
        Parent03 p3 = new Child03_2(); // Child2 객체를 Parent 타입 변수에 저장 (업캐스팅)
        p3.viewData(); // 결과: "Child2 viewData() 호출" (Child2의 메서드가 호출됨)

        // 6. 잘못된 다운캐스팅 시도 - ClassCastException 발생 가능성
        // Child1 c3 = (Child1) p3; // 이 코드도 잘못된 다운캐스팅으로 ClassCastException 발생
        // 이유: p3는 실제로 Child2 객체이므로 Child1 타입으로 변환할 수 없음
        // 런타임 예외 발생을 피하려면 이 코드를 실행하지 않아야 함

        // 7. 안전한 형변환을 위한 또 다른 instanceof 사용
        if (p3 instanceof Child03_2) {
            Child03_2 c4 = (Child03_2) p3; // 안전하게 Child2로 캐스팅
            c4.viewData(); // 결과: "Child2 viewData() 호출"
        } else {
            System.out.println("p3는 Child2 타입이 아닙니다.");
        }
    }
}
