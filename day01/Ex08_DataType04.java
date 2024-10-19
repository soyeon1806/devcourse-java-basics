public class Ex08_DataType04 {
    public static void main(String[] args){
        // 문자열 <- 기본 데이터 타입이 아님
        char c1 = 'A';
        // char c2 = 'AA' // 이렇게 하면 에러 발생 (두 자 이상일 때는 문자열로 선언해야 함)

        // 데이터에서 가장 많은 형태
        String s1 = "AA";
        String s2 = "AA\nBB";

        System.out.println(c1);
        System.out.println(s1);
        System.out.println(s2);
    }
}
