package day09;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Ex03_IO03 클래스
 * - DataOutputStream을 사용하여 바이너리 파일에 데이터를 쓰는 예제
 * - 정수, 실수, 불리언, 문자열 데이터를 순차적으로 파일에 기록
 */

public class Ex03_IO03 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("./day09/test/data.bin");
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(42);
            dos.writeDouble(3.14159);
            dos.writeBoolean(true);
            dos.writeUTF("안녕하세요!");

            dos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
