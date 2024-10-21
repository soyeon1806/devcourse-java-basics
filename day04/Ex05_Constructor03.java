package day04;

class Constructor02{
    String name;

    // 생성자는 오버로딩이 가능함

    // 매개변수가 없는 기본 생성자
    Constructor02(){
        System.out.println("생성자 호출");
        this.name = "홍길동";
    }

    // 매개변수가 있는 생성자 (오버로딩된 생성자)
    Constructor02 (String name){
        System.out.println("매개변수가 있는 생성자 호출");
        this.name = name; // this를 통해 매개변수와 멤버 변수를 구분함
    }
}

public class Ex05_Constructor03 {
    public static void main(String[] args) {
        Constructor02 c1 = new Constructor02();
        System.out.println(c1.name);

        System.out.println();

        Constructor02 c2 = new Constructor02("박문수");
        System.out.println(c2.name);
    }
}
