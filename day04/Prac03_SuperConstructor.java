class Car03 {
    int speed;
    boolean operable;
    char grade;
    
    Car03(int speed, boolean operable) {
        this(speed, operable, 'B');
    }
    
    Car03(int speed, boolean operable, char grade) {
        this.speed = speed;
        this.operable = operable;
        this.grade = grade;
    }
}

class GenesisCar extends Car03{
    int price;
    
    /**
        1. 매개변수 4개를 받는 생성자 선언하기
            - super를 사용해서 부모 클래스의 필드를 초기화하세요.
    */
    GenesisCar(int speed, boolean operable, char grade, int price) {
        super(speed, operable, grade);
        this.price = price;
    }
    
    
    /**
        2. 매개변수 3개를 받는 생성자 선언하기
            - super를 사용해서 부모 클래스의 필드를 초기화하세요.
            - price는 0으로 초기화하세요
            - (또는 this를 사용해서 생성자 오버로딩으로 완성해도 됩니다.)
    */
    GenesisCar(int speed, boolean operable, char grade) {
        super(speed, operable, grade);
        this.price = 0;
    }
    
    
    /**
        3. 매개변수 2개를 받는 생성자 선언하기
            - super를 사용해서 부모 클래스의 필드를 초기화하세요.
            - price는 0으로 초기화하세요
    */
    GenesisCar(int speed, boolean operable) {
        super(speed, operable);
        this.price = 0;
    }
}

public class Prac03_SuperConstructor {
    public static void main(String[] args) {
        GenesisCar genesisCar = new GenesisCar(150, true);
        System.out.println(genesisCar.speed);
        System.out.println(genesisCar.operable);
        System.out.println(genesisCar.grade);
        System.out.println(genesisCar.price);
    }
}
