package day08.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ZipCodeSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("동이름 입력 > ");
            String address = sc.nextLine();

            if (address.length() < 2) {
                System.out.println("한글자 입력 오류 처리");
                System.out.println();
                continue;
            }

            if(address.equals("exit")){
                break;
            }

            System.out.println();

            BufferedReader br = null;

            try {
                br = new BufferedReader(new FileReader("day08/practice/zipcode_seoul_utf8_type2.csv"));

                String data = null;

                while ((data = br.readLine()) != null) {
                    String[] datas = data.split(",");

                    if (datas[3].startsWith(address)) {
                        System.out.println(data);
                    }

                }

                System.out.println();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {if (br != null) try { br.close(); } catch (IOException e) { }}
        };

        System.out.println("프로그램 끝");

    }
}
