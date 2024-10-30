package day09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex08_IO08 {
    public static void main(String[] args) {
        Person p = new Person("홍길동", "010-1111-1111", 20, "서울시");

        ObjectOutputStream oos = null;

        try{
            oos = new ObjectOutputStream(new FileOutputStream("./day09/test/serial.dat"));
            oos.writeObject(p);

            System.out.println("출력 완료");
        } catch(IOException e){
            System.out.println("[에러] " + e.getMessage());
        } finally {
            if(oos != null){try{oos.close();}catch(IOException e){}}
        }
    }
}
