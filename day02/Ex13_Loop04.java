package day02;

public class Ex13_Loop04 {
    public static void main(String[] args) {
        /*
         * 1 ~ 50 사이의 수 중에서 2의 배수이자 3의 배수인 값 출력하기
         * ex) 6, 12, ...
         */

        for (int i = 1; i < 50; i++){
            if(i % 2 == 0 && i % 3 == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println("end");
    }
}
