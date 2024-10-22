class Constructor01 {

    // 기본 생성자 (Constructor)
    // 생성자는 클래스의 인스턴스가 생성될 때 자동으로 호출되며, 객체의 초기화를 담당함
    Constructor01(){
        System.out.println("생성자 호출");
    }
}

class Constructor01_1 {
    /*
     * 생성자가 명시되지 않으면 컴파일러가 자동으로 디폴트 생성자를 생성함
     * 디폴트 생성자는 매개변수가 없으며, 특별한 동작 없이 객체를 생성함
     * 예시: Constructor02() { }
     */
}

public class Ex04_Constructor01 {
    public static void main(String[] args) {
        // Constructor01 클래스의 인스턴스를 생성하면, 생성자가 자동으로 호출됨
        Constructor01 c = new Constructor01();

        // Constructor02 클래스는 생성자가 명시되지 않았지만, 컴파일러가 자동으로 디폴트 생성자를 생성함
        Constructor01_1 cc = new Constructor01_1(); 
    }
}
