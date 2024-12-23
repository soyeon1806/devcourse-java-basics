package day08;

import java.io.FileReader;
import java.io.IOException;

public class Ex20_IO06 {
    public static void main(String[] args) {
        FileReader fr = null;

        try{
            fr = new FileReader("./day08/test/test.txt");

            int data = 0;

            while((data = fr.read()) != -1){
                System.out.print((char)data);
            }
        } catch(IOException e){
            System.out.println("[에러] " + e.getMessage());
        } finally {
            if(fr != null){try {fr.close();} catch(IOException e){}}
        }
    }
}
