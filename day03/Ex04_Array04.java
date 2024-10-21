package day03;

public class Ex04_Array04 {
    public static void main(String[] args) {
        /*
         * 짝수 인덱스에 해당하는 데이터의 합 계산하기
         */

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;

        for(int i = 0; i < arr.length; i = i + 2){
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
