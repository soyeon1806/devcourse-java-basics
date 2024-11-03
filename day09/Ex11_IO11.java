package day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ex11_IO11 클래스
 * - BufferedReader를 사용하여 표준 입력으로부터 연속적인 사용자 입력을 처리하는 예제
 * - "exit" 명령어 입력 시 프로그램이 종료됨
 */

public class Ex11_IO11 {
    public static void main(String[] args) {
        BufferedReader br = null;

        br = new BufferedReader(new InputStreamReader(System.in));

        try{
            while(true){
                System.out.print("입력: ");
                String data = br.readLine();
                if(data.equals("exit")){
                    break;
                }
                System.out.println("입력 데이터: " + data);
            }
            System.out.println("프로그램 종료");
        } catch (IOException e){
            System.out.println("[에러] " + e.getMessage());
        } finally{
            if(br != null){try {br.close();} catch (IOException e) {}       }
        }
    }
}
