package day08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex15_IO01 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try{
            fis = new FileInputStream("./day08/test/test.txt");

            int data = 0;

            while((data = fis.read()) != -1){
                System.out.print((char)data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("[에러] 파일을 찾을 수 없습니다: " + e.getMessage());
        } catch(IOException e){
            System.out.println("[에러] 파일을 읽는 도중 문제가 발생했습니다: " + e.getMessage());
        } finally {
            if(fis != null){
                try{
                    fis.close();
                } catch (IOException e) {
                    System.out.println("[에러] 파일 스트림을 닫는 도중 문제가 발생했습니다: " + e.getMessage());
                }
            }
        }
    }
}
