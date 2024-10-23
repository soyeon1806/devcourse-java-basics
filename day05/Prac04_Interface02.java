package day05;

interface TV04 {
    public static final String UNIT = "inch";
    public abstract void on();
    public abstract void off();
}


/**
    TV인터페이스를 구현하는 SmartTV클래스를 작성하세요.
    - on 메소드를 구현할 땐, 실행블록 내용에 "스마트TV를 켜다" 문자열을 출력합니다
    - off 메소드를 구현할 땐, 실행블록 내용에 "스마트TV를 끄다" 문자열을 출력합니다
*/

class SmartTV04 implements TV04{
    @Override
    public void on(){
        System.out.println("스마트TV를 켜다");
    }
    
    @Override
    public void off(){
        System.out.println("스마트TV를 끄다");
    }
}


public class Prac04_Interface02 {
    public static void main(String[] args) {
        TV04 tv = new SmartTV04();
        tv.on();
        tv.off();
    }
}
