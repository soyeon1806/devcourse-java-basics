package day08;

import java.io.FileWriter;
import java.io.IOException;

public class Ex21_IO07 {
    public static void main(String[] args) {
        FileWriter fw = null;
        
        try{
            fw = new FileWriter("./day08/test/new_test.txt");
            
            fw.write("Hello");
            fw.write("Hello");

            System.out.println("입력 완료");
        } catch (IOException e) {
            System.out.println("[에러] + " + e.getMessage());
        } finally {
            if(fw != null){try{fw.close();}catch(IOException e){}}
        }
    }
}
