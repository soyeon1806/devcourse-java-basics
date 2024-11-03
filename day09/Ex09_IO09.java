package day09;

import java.io.IOException;
import java.io.InputStream;

/**
 * Ex09_IO09 클래스
 * - System.in을 사용한 표준 입력 스트림 예제
 * - 사용자가 입력한 값을 읽고 출력하는 기능 구현
 */

public class Ex09_IO09 {
    public static void main(String[] args) {
        InputStream is = null;

        try{
            is = System.in;

            System.out.print("입력: ");
            int data = is.read();
            System.out.println("입력값: " + (char)data);
            data = is.read();
            System.out.println("입력값: " + (char)data);
            data = is.read();
            System.out.println("입력값: " + (char)data);
        } catch (IOException e){
            throw new RuntimeException(e);
        } finally {
            if(is != null){
                try{
                    is.close();
                } catch (IOException e) {

                }
            }
        }
    }

}
