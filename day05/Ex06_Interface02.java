package day05;

interface Employee{
    /*
     * Employee는 인터페이스로, 메서드의 선언만 포함하고 구현은 포함하지 않음
     * 구현하는 것은 이 인터페이스를 구현하는 클래스들의 책임임
     */

     void salary(); // 추상 메서드: 각 클래스에서 반드시 구현해야 함
}

class Child1Employee implements Employee{
    // salary() 메서드 구현
    public void salary(){
        System.out.println("Child1Employee.salary()");
    }
}

class Child2Employee implements Employee{
    // salary() 메서드 구현
    public void salary(){
        System.out.println("Child2Employee.salary()");
    }
}

public class Ex06_Interface02 {
    public static void main(String[] args) {
        /*
         * 다형성이 이 부분에서 잘 드러남
         * 
         * e1과 e2는 둘 다 Employee 인터페이스 타입의 참조 변수임
         * -> 즉, Employee 인터페이스를 구현한 모든 객체를 참조할 수 있음
         */

        Employee e1 = new Child1Employee(); // Child1Employee 객체 참조
        Employee e2 = new Child2Employee(); // Child2Employee 객체 참조


        // 실제 객체 타입에 따라 salary() 메서드가 실행됨
        e1.salary();
        e2.salary();
    }
}
