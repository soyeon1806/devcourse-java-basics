package day05;

class Parent02{
    Parent02(){
        System.out.println("Parent 생성자 호출");
    }
}

class Child02_1 extends Parent02{
    Child02_1() {
        System.out.println("Child1 생성자 호출");
    }
}

class Child02_2 extends Parent02{
    Child02_2(){
        System.out.println("Child2 생성자 호출");
    }
}

public class Ex02_Poly02 {
    public static void main(String[] args) {
        Parent02 p = new Parent02();

        System.out.println();

        Child02_1 ch1 = new Child02_1();

        System.out.println();

        /*
         * 형변환 X
         * -> 관계가 없는 클래스는 형변환 불가 : Child02_1 cannot be converted to Parent02
         * p = c1;
         */


        /*
         * 자동 형변환 (업캐스팅)
         */

        Child02_2 c2 = new Child02_2();

        System.out.println();

        p = c2;

        Parent02 p2 = new Child02_2();

        System.out.println();
        
        Parent02 p3 = c2;

        /*
         * 강제 형변환 (다운캐스팅)
         * 
         * Child02_2 c3 = (Child02_2) p; // 런타임 에러 발생 : ClassCastException
         */
        /*
         * Child02_2 c3 = (Child02_2) p2;는 부모 클래스 타입의 참조를 다시 자식 클래스 타입으로 변환함
         * -> 자식 클래스의 필드와 메서드에 접근할 수 있게 됨
         * 
         * 잘못된 다운 캐스팅 시도 시에는 런타임에 에러가 발생하니 주의 !
         */

        Child02_2 c3 = (Child02_2) p2;
    }
}
