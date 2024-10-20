package day02;

public class Ex26_Loop17 {
    public static void main(String[] args) {
        /*
         * 정사각형 별찍기
         */

        int n = 10;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        /*
         * 직각삼각형 별찍기
         */

        for(int i = 0; i < n; i++){
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
