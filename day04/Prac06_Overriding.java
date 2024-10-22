class Car {
    int speed;
    boolean operable;
    char grade;
    
    Car(int speed, boolean operable, char grade) {
        this.speed = speed;
        this.operable = operable;
        this.grade = grade;
    }
    
    void run() {
        System.out.println("차가 달립니다.");
    }
}

class GenesisCar06 extends Car{
    GenesisCar06() {
        super(150, true, 'A');
    }
    
    /**
        부모 클래스 Car의 run 메소드를 오버라이딩합니다.
        1. "제네시스" 문자열을 출력한 뒤
        2. 부모 클래스의 run 메소드를 호출합니다.
    */
    @Override
    void run() {
        System.out.println("제네시스");
        super.run();
    }
}

public class Prac06_Overriding {
    public static void main(String[] args) {
        GenesisCar06 genesisCar = new GenesisCar06();
        genesisCar.run();
    }
}
