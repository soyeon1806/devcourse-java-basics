package day02;

public class Ex02_Condition02 {
    public static void main(String[] args) {
        /*
        * age가 18 이상이면 "선거 가능"이라고 출력하고,
        * 18세 미만이면 "선거 불가능"이라고 출력하기
        */

        int age = 15;

        System.out.println("시작");

        if (age > 18){
            System.out.println("선거 가능");
        }
        else{
            System.out.println("선거 불가능");
        }


        age = 20;
        
        if (age > 18){
            System.out.println("선거 가능");
        }
        else{
            System.out.println("선거 불가능");
        }

        System.out.println("끝");
        
    }


}
