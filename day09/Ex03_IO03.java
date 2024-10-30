package day09;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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
