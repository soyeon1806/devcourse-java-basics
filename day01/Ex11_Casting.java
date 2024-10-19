public class Ex11_Casting {
    public static void main(String[] args){
        short s = 10;

        // 작은 자료형 -> 큰 자료형 변환은 자동 형변환
        int i = s;
        System.out.println(s);
        System.out.println(i);

        float f = 10.0f;
        double d = f;
        System.out.println(f);
        System.out.println(d);
    }
}
