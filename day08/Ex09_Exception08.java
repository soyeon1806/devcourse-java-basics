package day08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex09_Exception08 {
    public static void main(String[] args) {
        try{
            readFile("nonexistentfile.txt");
        } catch(FileNotFoundException e){
            System.out.println("파일을 찾을 수 없습니다: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException{
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
