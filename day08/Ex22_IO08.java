package day08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex22_IO08 {
    public static void main(String[] args) {
        BufferedReader br = null;

        try{
            br = new BufferedReader(new FileReader("./day08/test/test.txt"));

            String line = null;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch(IOException e){
            System.out.println("[에러] " + e.getMessage());
        } finally {
            if(br != null){try{br.close();} catch(IOException e){}}
        }
    }
}
