package day02;

public class Ex03_Condition03 {
    public static void main(String[] args) {
        /*
         * data 값이 짝수면 "짝수"라고 출력하고,
         * 홀수면 "홀수"라고 출력하기
         */

        System.out.println("시작");

        int data = 10;

        if(data % 2 == 0){
            System.out.println("짝수");
        }
        else{
            System.out.println("홀수");
        }

        data = 11;
        
        if(data % 2 == 0){
            System.out.println("짝수");
        }
        else{
            System.out.println("홀수");
        }

        System.out.println("끝");
    }
}
