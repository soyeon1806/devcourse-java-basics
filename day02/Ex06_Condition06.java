package day02;

public class Ex06_Condition06 {
    public static void main(String[] args) {
        /*
         * score를 기준으로
         * 90점 이상 -> A
         * 80점 이상 -> B
         * 70점 이상 -> C
         * 60점 이상 -> D
         * 기타 -> F
         */

        int score = 77;

        if (score >= 90){
            System.out.println("A");
        }
        else if (score >= 80){
            System.out.println("B");
        }
        else if (score >= 70){
            System.out.println("C");
        }
        else if (score >= 60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}
