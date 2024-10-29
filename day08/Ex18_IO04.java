package day08;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex18_IO04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        BufferedInputStream bis = null;

        try{
            bis = new BufferedInputStream(new FileInputStream("./day08/test/test.txt"));

            int data = 0;

            while((data = bis.read()) != -1){
                System.out.print((char)data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bis != null){
                try{
                    bis.close();
                } catch (IOException e) {

                }
            }

            if (fis != null){
                try{
                    fis.close();
                } catch (IOException e) {

                }
            }
        }
    }
}
