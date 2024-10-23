package day05;

abstract class Car02 {
    public int speed;
    public boolean operable;
    public char grade;
    
    Car02(int speed, boolean operable, char grade) {
        this.speed = speed;
        this.operable = operable;
        this.grade = grade;
    }
    
    public abstract void turnOn();
    public abstract void turnOff();
}

class GenesisCar02 extends Car02{
    int price;
    
    GenesisCar02(int speed, boolean operable, char grade, int price) {
        super(speed, operable, grade);
        
        this.price = price;
    }
    
    @Override
    public void turnOn() {
        System.out.println("제네시스 시동을 켰습니다.");
    }
    
    @Override
    public void turnOff() {
        System.out.println("제네시스 시동을 껐습니다.");
    }
}

public class Prac02_ClassTypeConversion {
    public static void main(String[] args) {
        /**
            1. GenesisCar인스턴스를 생성하고, Car클래스로 자동 타입 변환 선언합니다.
                - GenesisCar 인스턴스 생성 시, 인자를 아래와 같이 대입해주세요.
                    - speed : 300
                    - operable : true
                    - grade : 'A'
                    - price : 8000
        */
        
        Car02 c = new GenesisCar02(300, true, 'A', 8000);
        
        // 2. 자동 타입 변환한 인스턴스에서 turnOn메소드를 호출합니다.
        
        c.turnOn();
            
        // 3. 자동 타입 변환한 인스턴스에서 turnOff메소드를 호출합니다.
        
        c.turnOff();
        
        // 4. 자동 타입 변환한 인스턴스에서 speed필드를 출력합니다. (System.out.println 활용)
        
        System.out.println(c.speed);
        
        // 5. car 인스턴스를 GenesisCar클래스로 강제 타입 변환합니다.
        
        GenesisCar02 gc = (GenesisCar02)c;
        
        // 6. 강제 타입 변환한 인스턴스에서 price필드를 출력합니다. (System.out.println 활용)
        
        System.out.println(gc.price);
    }
}
