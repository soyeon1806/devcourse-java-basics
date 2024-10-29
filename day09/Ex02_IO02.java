package day09;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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
