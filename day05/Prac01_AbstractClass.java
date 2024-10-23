package day05;

abstract class Car01 {
    /*
        2. 추상 메소드를 선언하세요.
            - 메소드명 : turnOn, turnOff
            - (둘다 결과를 반환하지 않습니다)
    */
    
    
    public abstract void turnOn();
    
    public abstract void turnOff();
    
}

/*
    1. Car 추상 클래스를 상속받고, 추상 메소드를 구현하세요.
        - turnOn 메소드에서는 "제네시스 시동을 켰습니다." 문자열을 출력합니다.
        - turnOff 메소드에서는 "제네시스 시동을 껐습니다." 문자열을 출력합니다.
*/

class GenesisCar01 extends Car01 {
    
    @Override
    public void turnOn(){
        System.out.println("제네시스 시동을 켰습니다.");
    }
    
    @Override
    public void turnOff(){
        System.out.println("제네시스 시동을 껐습니다.");
    }
}

public class Prac01_AbstractClass {
    public static void main(String[] args) {
        GenesisCar01 genesisCar = new GenesisCar01();
        genesisCar.turnOn();
        genesisCar.turnOff();
    }
}
