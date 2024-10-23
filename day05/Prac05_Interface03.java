package day05;

interface TV05 {
    public static final String UNIT = "inch";
    public abstract void on();
    public abstract void off();
}

class LedTV05 implements TV05{
    @Override
    public void on(){
        System.out.println("LED TV를 켜다");
    }
    @Override
    public void off(){
        System.out.println("LED TV를 끄다");   
    }
}

class SmartTV05 implements TV05{
    @Override
    public void on(){
        System.out.println("스마트TV를 켜다");
    }
    @Override
    public void off(){
        System.out.println("스마트TV를 끄다");
    }
}

public class Prac05_Interface03 {

    public static void test(TV05 tv) {
        tv.on();
        tv.off();
    }

    public static void main(String[] args) {
        /**
            1. SmartTV 인스턴스를 생성해서 TV 타입 변수 tv1에 대입합니다.
            2. test메소드를 호출합니다. 인자로 tv1 변수를 넣어보세요.
        */
        TV05 tv1 = new SmartTV05();
        test(tv1);
            
        /**
            3. LedTV 인스턴스를 생성해서 TV 타입 변수 tv2에 대입합니다.
            4. test메소드를 호출합니다. 인자로 tv2 변수를 넣어보세요.
        */
        TV05 tv2 = new LedTV05();
        test(tv2);
            
    }
}
