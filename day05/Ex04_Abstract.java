package day05;

// 일반 클래스 Parent05_1
class Parent05_1{
    // Parent05_1의 생성자
    Parent05_1(){
        System.out.println("Parent05_1 생성자 호출");
    }
}

// 추상 클래스 Parent05_2
abstract class Parent05_2{
    /*
     * 추상 클래스의 생성자
     * 
     * 추상 클래스도 생성자를 가질 수 있지만,
     * 직접 객체를 생성할 수는 없음
     */

     Parent05_2(){
        System.out.println("Parent05_2 생성자 호출");
     }

     // 일반 메서드 : 추상 클래스에 일반 메서드도 포함될 수 있음
     void viewData1(){
        System.out.println("Parent05_2.viewData1()");
     }

     /*
      * 추상 메서드 : 구현이 없는 메서드
      * -> 자식 클래스에서 반드시 구현해야 함
      * 
      * 추상 메서드는 본문이 없고,
      * 자식 클래스에서 이 메서드를 오버라이딩 해서 구현해야 함
      */
      abstract void viewData2();
}

// Child05_1 클래스는 Parent05_2 추상 클래스를 상속받아 추상 메서드를 구현함
class Child05_1 extends Parent05_2{
    // Child05_1의 생성자
    Child05_1(){
        System.out.println("Child05_1 생성자 호출");
    }

    // 추상 클래스 Parent05_2의 추상 메서드를 구현 (오버라이딩)
    @Override
    void viewData2(){
        System.out.println("Child05_1.viewData2()");
    }
}

public class Ex04_Abstract {
    public static void main(String[] args) {
        // Parent05_1은 일반 클래스이므로 직접 객체를 생성할 수 있음
        Parent05_1 p1 = new Parent05_1();

        System.out.println();

        /*
         * 에러 케이스
         * Parent05_2 p2 = new Parent05_2();
         * 
         * -> Parent05_2는 추상 클래스이기 때문에 객체를 직접 생성할 수 없음
         */

        // Child05_1은 Parent05_2의 자식 클래스이며, 추상 메서드를 구현했으므로 인스턴스화가 가능함
        Child05_1 c1 = new Child05_1();

        System.out.println();

        // 상속받은 일반 메서드 호출
        // -> viewData1()은 Parent05_2에서 정의된 일반 메서드이므로 자식 클래스에서 그대로 사용 가능함
        c1.viewData1();

        System.out.println();

        // 오버라이딩한 일반 메서드 호출
        // -> viewData2()는 자식 클래스인 Child05_1에서 구현되었으므로 호출 가능
        c1.viewData2();
    }
}
