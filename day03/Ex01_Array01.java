package day03;

public class Ex01_Array01{
    public static void main(String[] args) {
        // 정수형 배열 선언
        int[] arr1;
        int arr2[];

        // 정수형 배열 생성
        arr1 = new int[10];
        arr2 = new int[30];

        // 선언과 생성 동시에
        int[] arr3 = new int[3];

        
        // 사용
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[9] = 100;

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[9]);

        /*
         * 아래의 명령을 실행하면 런타임 오류가 발생함
         * (실행 시 오류가 발생하지만, 컴파일은 정상적으로 되긴 함)
         * 
         * arr1[10] = 110;
         * -> java.lang.ArrayIndexOutOfBoundsExeption
         */

         

    }
}