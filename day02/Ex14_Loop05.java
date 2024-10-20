package day02;

public class Ex14_Loop05 {
    public static void main(String[] args) {
        /*
         * 1 ~ 10 까지의 합 구하기
         */

        int sum = 0;

        for(int i = 1; i <= 10; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}
