package day02;

public class Ex25_Loop16 {
    public static void main(String[] args) {
        /*
         * 1 ~ 100 사이의 짝수 합 구하기
         */

        int sum = 0;

        int i = 1;
        while(i < 100){
            if(i % 2 != 0){
                i++;
                continue;
            }

            sum += i;
            i++;
        }

        System.out.println(sum);
    }
}
