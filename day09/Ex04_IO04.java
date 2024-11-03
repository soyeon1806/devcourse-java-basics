package day09;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Ex04_IO04 클래스
 * - DataInputStream을 사용하여 바이너리 파일에서 데이터를 읽어오는 예제
 * - 정수, 실수, 불리언, 문자열 데이터를 순차적으로 읽어와서 콘솔에 출력
 */

public class Ex04_IO04 {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("./day09/test/data.bin");
            DataInputStream dis = new DataInputStream(fis);

            int number = dis.readInt();
            double pi = dis.readDouble();
            boolean isTrue = dis.readBoolean();
            String message = dis.readUTF();

            System.out.println(number);
            System.out.println(pi);
            System.out.println(isTrue);
            System.out.println(message);

            dis.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
