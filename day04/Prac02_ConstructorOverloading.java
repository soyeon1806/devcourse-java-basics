class Car02 {
    int speed;
    boolean operable;
    char grade;
    
    Car02(int speed, boolean operable, char grade) {
        this.speed = speed;
        this.operable = operable;
        this.grade = grade;
    }
    
    /**
        1. 매개변수를 받지 않는 생성자를 작성합니다.
        - speed는 10, operable은 true, grade는 'B' 값으로 초기화하세요
    */
    
    Car02(){
        this.speed = 10;
        this.operable = true;
        this.grade = 'B';
    }
    
    /**
        2. 매개변수를 speed 하나만 받는 생성자를 작성합니다.
        - operable은 true, grade는 'B' 값으로 초기화하세요
    */
    
    Car02(int speed){
        this.speed = speed;
        this.operable = true;
        this.grade = 'B';
    }
    
    /**
        3. 매개변수를 speed와 operable 두개를 받는 생성자를 작성합니다.
        - grade는 'B' 값으로 초기화하세요
    */
    
    Car02(int speed, boolean operable){
        this.speed = speed;
        this.operable = operable;
        this.grade = 'B';
    }
}

public class Prac02_ConstructorOverloading{
    public static void main(String[] args) {
        Car02 car1 = new Car02();
        Car02 car2 = new Car02(20);
        Car02 car3 = new Car02(20, false);
        Car02 car4 = new Car02(20, true, 'A');
        
        System.out.println(car3.speed);
        System.out.println(car3.operable);
        System.out.println(car3.grade);
    }
}