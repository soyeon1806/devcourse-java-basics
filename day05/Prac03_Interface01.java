package day05;

interface TV03 {
    
    // TV를 키는 기능 (추상 메서드)
    public abstract void on();
    
    // TV를 끄는 기능 (추상 메서드)
    public abstract void off();
    
    // TV 사이즈를 나타내는 기본 단위 (상수)
    public static final String UNIT = "inch";
}

class LedTV03 implements TV03{
    @Override
    public void on(){
        System.out.println("켜다");
    }
    @Override
    public void off(){
        System.out.println("끄다");   
    }
}

public class Prac03_Interface01 {
    public static void main(String[] args) {
        TV03 tv = new LedTV03();
        tv.on();
        tv.off();
        System.out.println(TV03.UNIT);
    }
}
