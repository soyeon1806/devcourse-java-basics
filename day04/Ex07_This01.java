package day04;

class This{
    // 기본 생성자
    This(){
        System.out.println("생성자 호출");
    }

    // 매개변수가 있는 생성자 (오버로딩된 생성자)
    // this()를 사용하여 기본 생성자를 먼저 호출한 후 추가 작업을 수행
    This(String name){
        this(); // 같은 클래스의 다른 생성자를 호출할 때 사용되며, 중복된 코드를 줄일 수 있음
        System.out.println("생성자 오버로딩 호출");
    }
}

public class Ex07_This01 {
    public static void main(String[] args) {
        This t = new This("홍길동");
    }
}
