package day02;

public class Ex21_Loop12 {
    public static void main(String[] args) {
        int i = 1;

        // 최초 1회는 반드시 실행됨
        do{
            System.out.println(i);
            i++;
        } while(i <= 10);
    }
}
