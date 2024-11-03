package day09;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Ex01_IO01 클래스
 * - FileWriter를 사용하여 텍스트 파일에 문자열을 기록하는 예제
 * - 파일을 열어 문자열을 쓰고 줄바꿈을 추가하여 파일에 내용을 기록
 */

public class Ex01_IO01 {
    public static void main(String[] args) {
        FileWriter fw = null;

        try{
            fw = new FileWriter("./day09/test/test.txt", true);
            fw.write("Hello1");
            fw.write(System.lineSeparator());
            fw.write("Hello2");

            System.out.println("출력 완료");
        } catch (IOException e){
            System.out.println("[에러] " + e.getMessage());
        } finally {
            if(fw != null){try {fw.close();} catch (IOException e){}}
        }
    }
}
