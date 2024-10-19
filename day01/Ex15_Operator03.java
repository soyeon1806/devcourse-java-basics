public class Ex15_Operator03 {
    public static void main(String[] args) {
        int i1 = 10;
        int i2 = 10;
        int sum1 = i1 + i2;
        System.out.println(sum1);
        
        short s1 = 10;
        short s2 = 20;
        // short sum2 = s1 + s2; // 에러 발생 (산술 연산을 위한 기본 자료형은 int 이상이어야 함)
        int sum2 = s1 + s2;
        System.out.println(sum2);

        // 강제 형변환 해주는 방법도 있음
        short sum3 = (short)(s1 + s2);
        System.out.println(sum3);
    }
}
