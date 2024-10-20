package day02;

public class Ex04_Condition04 {
    public static void main(String[] args) {
        /*
         * data 값이 5와 10 사이에 있으면 "영역 내"라고 출력하고,
         * 그렇지 않으면 "영역 외"라고 출력하기
         */

        System.out.println("시작");

        int data = 11;

        if((data > 5) && (data < 10)){
            System.out.println("영역 내");
        }
        else{
            System.out.println("영역 외");
        }

        data = 7;

        if((data > 5) && (data < 10)){
            System.out.println("영역 내");
        }
        else{
            System.out.println("영역 외");
        }

        System.out.println("끝");
    }
}
