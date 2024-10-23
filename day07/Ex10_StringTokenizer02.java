package day07;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex10_StringTokenizer02 {
    public static void main(String[] args) {
        String str = "사과&참외&&수박&&&딸기";

        // StringTokenizer를 사용하여 빈 데이터 제거
        // 구분자 "&"를 기준으로 데이터를 분리하며, 빈 항목은 자동으로 제거됨
        StringTokenizer st = new StringTokenizer(str, "&");
        System.out.print(st.nextToken());

        // 남은 토큰들을 출력
        while(st.hasMoreTokens()){
            System.out.print(st.nextToken());
        }
        System.out.println("/");

        // String.split()을 사용하여 문자열을 분리
        // 이 메서드는 빈 문자열도 포함하여 배열로 반환됨
        String[] data = str.split("&");
        System.out.println(data.length);
        System.out.println(Arrays.toString(data));
    }
}
