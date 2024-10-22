package day07;

public class Ex01_Wrapper01 {
    public static void main(String[] args) {
        /*
         * Wrapper 클래스 생성하기
         * -> 기본 자료형(int, double, etc.)을 객체로 다루기 위해 제공되는 클래스
         */

        // 명시적 Boxing
        Integer i1 = Integer.valueOf(10);

        // Auto Boxing
        // 자바에서는 기본 자료형(int)을 자동으로 Wrapper 클래스(Integer)로 변환해줌
        Integer i2 = 10;

        /*
         * i1 -> 참조 자료형 (Integer 객체)
         * i2 -> 참조 자료형 (Auto Boxing된 Integer 객체)
         */

        // 언박싱(Unboxing)
        // 참조 자료형(객체)에서 다시 기본 자료형으로 변환
        int i3 = i1; // Integer 객체에서 int로 자동 변환

        // i1과 i2는 Integer 객체지만, 기본 자료형처럼 연산이 가능 (Auto Unboxing)
        int sum = i1 + i2;
        System.out.println(sum);
    }
}
