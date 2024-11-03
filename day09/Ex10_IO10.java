package day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ex10_IO10 클래스
 * - BufferedReader와 InputStreamReader를 사용한 표준 입력 예제
 * - 사용자가 입력한 문자열을 읽고 출력하는 기능 구현
 */

public class Ex10_IO10 {
    public static void main(String[] args) {
        BufferedReader br = null;

        try{
            br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("입력: ");

            String line = br.readLine();
            System.out.println("입력값: " + line);
        } catch (IOException e){
            throw new RuntimeException(e);
        } finally {
            if(br != null){
                try{
                    br.close();
                } catch (IOException e){

                }
            }
        }
    }
}
