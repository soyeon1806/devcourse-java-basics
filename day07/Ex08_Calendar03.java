package day07;

import java.util.Calendar;

public class Ex08_Calendar03 {

    public static void main(String[] args) {

        // 연도와 월 설정 
        int year = 2024;
        int month = 10;

        // 시작일과 종료일을 설정하는 Calendar 인스턴스 생성
        Calendar startCalendar = Calendar.getInstance();
        Calendar endCalendar = Calendar.getInstance();

        // 해당 달의 첫날과 마지막 날 설정
        startCalendar.set(year, month - 1, 1);
        endCalendar.set(year, month, 1-1);

        // 첫날의 요일 가져오기 (일요일: 1, 토요일: 7)
        int startDayOfWeek = startCalendar.get(Calendar.DAY_OF_WEEK);

        // 해당 달의 마지막 날짜 가져오기
        int endDate = endCalendar.get(Calendar.DATE);

        System.out.println(startDayOfWeek);
        System.out.println(endDate);

        // 달력 형식으로 출력
        System.out.println(" SU MO TU WE TH FR SA");

        // 첫날의 요일에 맞춰 공백 출력
        for(int i = 1; i < startDayOfWeek; i++){
            System.out.print("   ");
        }

        // 날짜 출력
        for(int i = 1, n = startDayOfWeek; i <= endDate; i++, n++){
            System.out.print((i < 10) ? "  " + i : " " + i); // 한 자릿수는 공백 2칸, 두 자릿수는 공백 1칸

            // 7일마다 줄바꿈 처리
            if(n % 7 == 0){
                System.out.println();
            }


        }
    }
}
