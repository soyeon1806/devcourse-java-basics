package day08;

import java.util.Date;

public class Ex07_Exception06 {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = null;

        System.out.println(date1.toString());

        try{
            System.out.println(date2.toLocaleString());
        } catch (NullPointerException e) {
            System.out.println("객체를 생성하지 않음");
            System.out.println(e.toString()); // 예외 객체의 정보를 문자열로 출력
            System.out.println(e.getMessage()); // 예외의 메시지 출력
            e.printStackTrace(); // 예외의 발생 경로를 콘솔에 출력
        }
    }
}
