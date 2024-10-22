class Car07 {
    int speed;
    public boolean operable;
    public char grade;
    
    Car07(int speed, boolean operable, char grade) {
        this.speed = speed;
        this.operable = operable;
        this.grade = grade;
    }
    
    public void run() {
        System.out.println("차가 달립니다.");
    }
}

public class Prac07_AccessModifier {
    public static void main(String[] args) {
        Car07 car = new Car07(150, true, 'B');
        
        System.out.println(car.speed);
        System.out.println(car.operable);
        System.out.println(car.grade);
        car.run();
    }
}
