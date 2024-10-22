class Car04 {
    /**
        Car 클래스에 final 필드를 선언하고, 생성자로 필드 값을 초기화하도록 합니다.
        - 정수타입 변수는 speed 필드를 초기화
        - boolean타입 변수는 operable 필드를 초기화
        - char타입 변수는 grade필드를 초기화
    */
    
    final int speed;
    final boolean operable;
    final char grade;
    
    Car04(int speed, boolean operable, char grade){
        this.speed = speed;
        this.operable = operable;
        this.grade = grade;
    }
}

public class Prac04_Final {
    public static void main(String[] args) {
        Car04 car = new Car04(10, false, 'C');
            
        System.out.println(car.speed);
        System.out.println(car.operable);
        System.out.println(car.grade);
    }
}
