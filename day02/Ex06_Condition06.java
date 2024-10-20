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

        String grade = "";
        if ( score >= 90 ) {
            grade = "A";
        }
        else if ( score >= 80 ) {
            grade = "B";
        }
        else if ( score >= 70 ) {
            grade = "C";
        }
        else if ( score >= 60 ) {
            grade = "D";
        }
        else {
            grade = "F";
        }

        System.out.println(grade);
        }
}
