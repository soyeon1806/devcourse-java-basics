package day09;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

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
