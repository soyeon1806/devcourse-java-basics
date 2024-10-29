package day08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex17_IO03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("./day08/test/test.txt");
            fos = new FileOutputStream("./day08/test/test_copy.txt");

            int data = 0;

            while((data = fis.read()) != -1){
                fos.write(data);
            }

            System.out.println("복사 완료");
        } catch (IOException e) {
            System.out.println("[에러] " + e.getMessage());
        } finally {
            if(fis != null){
                try{
                    fis.close();
                } catch (IOException e) {

                }
            }
            if(fos != null){
                try{
                    fos.close();
                } catch (IOException e) {

                }
            }
        }
    }
}
