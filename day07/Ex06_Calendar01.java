package day07;

import java.util.Calendar;

public class Ex06_Calendar01 {
    public static void main(String[] args) {
        // Calendar 클래스의 인스턴스를 생성하여 현재 날짜 및 시간 정보를 가져옴
        Calendar calendar = Calendar.getInstance();

        // 현재 연, 월, 일, 시간 출력
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1); // 0부터 시작하기에 1을 더해줌
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));

        // 현재 요일 출력 (숫자로 반환, 일요일은 1, 토요일은 7)
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

        // 요일 이름을 배열로 정의하여 숫자를 요일 이름으로 변환하여 출력
        String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};
        System.out.println(weekNames [ calendar.get(Calendar.DAY_OF_WEEK) - 1]);

        // 현재 시간을 밀리초로 반환
        System.out.println(calendar.getTimeInMillis());

        // 현재 달의 최대 일자(말일) 출력
        System.out.println(calendar.getActualMaximum(calendar.DATE));

        // 현재 달의 최소 일자(첫째 날) 출력
        System.out.println(calendar.getActualMinimum(calendar.DATE));
    }
}
