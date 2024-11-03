package day09;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Ex05_IO05 클래스
 * - DataInputStream을 사용하여 바이너리 형식으로 저장된 데이터를 읽어오는 예제
 * - data.dat 파일로부터 정수, 문자열, 실수를 순서대로 읽어옴
 */

public class Ex05_IO05 {
    public static void main(String[] args) {
        DataInputStream dis = null;

        try{
            dis = new DataInputStream(new FileInputStream("./day09/test/data.dat"));

            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readFloat());
        } catch (IOException e){
            System.out.println("[에러] " + e.getMessage());
        } finally {
            if(dis != null) {try {dis.close();} catch(IOException e){}}
        }
    }
}
