package day09;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

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
