package day07;

import java.util.Calendar;

public class Ex07_Calendar02 {
    public static void main(String[] args) {
        // Calendar 인스턴스를 생성하여 특정 날짜를 설정함
        Calendar calendar = Calendar.getInstance();

        // set() 메서드를 사용하여 연, 월, 일 설정
        calendar.set(2024, 10 - 1, 1 - 1); // 2024년 9월 30일이 됨

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DATE));

        System.out.println(calendar.getTime().toLocaleString());

        // 날짜를 하루 더한 후 출력 
        calendar.add(Calendar.DATE, 1);
        System.out.println(calendar.getTime().toLocaleString());

        // 날짜를 이틀 뺀 후 출력
        calendar.add(Calendar.DATE, -2);
        System.out.println(calendar.getTime().toLocaleString());

    }
}
