package day09;

import java.io.FileWriter;
import java.io.IOException;

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
