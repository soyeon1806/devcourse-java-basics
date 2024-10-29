package day08;

public class Ex06_Exception05 {
    public static void main(String[] args) {
        System.out.println("시작");

        String name = null;
        int num1 = 0;
        int num2 = 0;

        try{
            System.out.println("문자열의 길이 : " + name.length());
            System.out.println("결과 : " + (num2 / num1));
        } catch(NullPointerException e){
            System.out.println(e.getMessage());
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("끝");
    }
}
