package day09;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Ex02_IO02 클래스
 * - DataOutputStream을 사용하여 바이너리 파일에 데이터를 저장하는 예제
 * - 정수, 문자열, 실수 데이터를 순차적으로 파일에 기록
 */

public class Ex02_IO02 {
    public static void main(String[] args) {
        DataOutputStream dos = null;

        try{
            dos = new DataOutputStream(new FileOutputStream("./day09/test/data.dat"));

            dos.writeInt(2024);
            dos.writeUTF("문자열 형식");
            dos.writeFloat(1.8f);

            System.out.println("출력 완료");
        } catch(IOException e){
            System.out.println("[에러] : " + e.getMessage());
        } finally {
            if(dos != null){try {dos.close();} catch(IOException e){}}
        }
    }
}
