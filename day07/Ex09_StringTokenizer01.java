package day07;

import java.util.StringTokenizer;

public class Ex09_StringTokenizer01 {
    public static void main(String[] args) {
        String strData1 = "사과 참외 수박 딸기";
        StringTokenizer st1 = new StringTokenizer(strData1, " "); // 공백(" ")을 기준으로 문자열 분리

        // hasMoreTokens()는 더 이상 토큰이 없을 때까지 반복
        while(st1.hasMoreTokens()){
            System.out.println(st1.nextToken()); // 각 토큰 출력
        }

        System.out.println();

        String strData2 = "사과&참외&수박&딸기";
        StringTokenizer st2 = new StringTokenizer(strData2, "&"); // "&"를 기준으로 문자열 분리

        while(st2.hasMoreTokens()){
            System.out.println(st2.nextToken());
        }
    }
}
