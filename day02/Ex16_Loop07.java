package day02;

public class Ex16_Loop07 {
    public static void main(String[] args) {
        /*
         * 초기화식, 조건식, 증감식 부분을 2개 이상 사용하는 것도 가능함
         */

         for(int i = 10, j = 5; i <= 5 || j <= 10; i++, j++){
            System.out.println(i + " / " + j);
         }
    }
}
