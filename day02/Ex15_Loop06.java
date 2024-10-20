package day02;

public class Ex15_Loop06 {
    public static void main(String[] args) {
        /*
         * 1 ~ 100 사이의 짝수의 합
         */

        int sum = 0;

        for(int i = 1; i < 100; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
