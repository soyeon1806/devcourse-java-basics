package day07;

import java.time.LocalDate;

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
    }
}
