package day07;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Date;

public class Ex05_Date01 {
    public static void main(String[] args) {
        // 현재 날짜 가져오기
        LocalDate currenDate = LocalDate.now();

        // 연, 월, 일 분리해서 출력
        int year = currenDate.getYear();
        int month = currenDate.getMonthValue();
        int day = currenDate.getDayOfMonth();

        System.out.println("Year : " + year);
        System.out.println("Month : " + month);
        System.out.println("Day : " + day);

        System.out.println();

        /*
         * 2024 - 1900
         * -> Date 클래스의 생성자는 연도 값을 1900을 기준으로 한 연도 오프셋으로 받기에 이렇게 입력해야 함
         * -> 실제로 이 식은 124로 계산되어 2024년을 나타냄
         *
         * 10 - 1
         * -> 월은 0부터 시작하므로, 10월을 나타내기 위해 10 - 1을 입력함
         *
         * 0
         * -> 일에다가 0을 입력하면 이전 달의 마지막 날이 출력됨
         */
        Date date = new Date(2024-1900, 10-1, 0);
        System.out.println(date.toLocaleString());

        System.out.println();

        long timeInMillis = date.getTime(); // 현재 시간의 밀리초
        System.out.println(timeInMillis);
    }
}
