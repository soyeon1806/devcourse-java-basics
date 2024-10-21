package day03;

class Method04{
    void doFunc(){
        System.out.println("doFunc() 호출");
    }

    /*
     * Overroding
     * -> 같은 이름의 메소드더라도, 매개변수가 다르다면 만들 수 있음
     */

    void doFunc(int a){
        System.out.println("doFunc(int a) 호출");
    }

    /*
     * 오버로딩의 조건
     * 매개변수의 타입이 다르거나, 개수가 다르거나, 순서가 달라야 함
     */

    void doFunc(String s){
        System.out.println("doFunc(String s) 호출");
    }

    void doFunc(int a, String s){
        System.out.println("doFunc(int a, String s) 호출");
    }

    void doFunc(String s, int a){
        System.out.println("doFunc(String s, int a) 호출");
    }
}

public class Ex17_Method04 {
    public static void main(String[] args) {
        Method04 m = new Method04();
        m.doFunc();
        m.doFunc(10);
        m.doFunc("10");
        m.doFunc(10, "10");
        m.doFunc("10", 10);
    }
}
