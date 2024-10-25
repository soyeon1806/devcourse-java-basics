package day08.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 파일을 읽어 데이터를 가져오는 클래스
class ZipCodeFileReader {
    private final String filePath;

    public ZipCodeFileReader(String filePath) {
        this.filePath = filePath;
    }

    // 파일에서 데이터를 읽어 List로 반환하는 메서드
    public List<String> readZipCodeData() {
        List<String> zipCodeData = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                zipCodeData.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return zipCodeData;
    }
}

// 검색 로직을 담당하는 클래스
class ZipCodeSearcher {
    private final List<String> zipCodeData;

    public ZipCodeSearcher(List<String> zipCodeData) {
        this.zipCodeData = zipCodeData;
    }

    // 동 이름으로 검색하는 메서드
    public List<String> searchByAddress(String address) {
        List<String> result = new ArrayList<>();
        for (String data : zipCodeData) {
            String[] datas = data.split(",");
            if (datas[3].startsWith(address)) {
                result.add(data);
            }
        }
        return result;
    }
}

// 사용자 인터페이스와 프로그램 흐름을 관리하는 클래스
class ZipCodeSearchApp {
    private final ZipCodeFileReader fileReader;
    private final ZipCodeSearcher searcher;

    public ZipCodeSearchApp(String filePath) {
        // 파일 리더와 검색기를 초기화
        fileReader = new ZipCodeFileReader(filePath);
        List<String> zipCodeData = fileReader.readZipCodeData();
        searcher = new ZipCodeSearcher(zipCodeData);
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("동이름 입력 > ");
            String address = sc.nextLine();

            if (address.equals("exit")) {
                break;
            }

            if (address.length() < 2) {
                System.out.println("한글자 입력 오류 처리");
                System.out.println();
                continue;
            }

            List<String> results = searcher.searchByAddress(address);

            if (results.isEmpty()) {
                System.out.println("검색 결과가 없습니다.");
            } else {
                for (String result : results) {
                    System.out.println(result);
                }
            }
            System.out.println();
        }

        System.out.println("프로그램 끝");
    }
}

// 메인 클래스
public class ZipCodeSearch2 {
    public static void main(String[] args) {
        // 파일 경로를 전달하여 ZipCodeSearchApp 실행
        ZipCodeSearchApp app = new ZipCodeSearchApp("day08/practice/zipcode_seoul_utf8_type2.csv");
        app.run();  // 프로그램 실행
    }
}
