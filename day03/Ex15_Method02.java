package day03;

class Method {
    void gugudan(int dan) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }
    }
}

public class Ex15_Method02 {
    public static void main(String[] args) {
        Method m = new Method();
        m.gugudan(6);
    }
}
