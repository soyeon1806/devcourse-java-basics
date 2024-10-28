package day08;

/**
 * Ex10_Exception09 클래스
 * - Exception을 발생시키는 예제
 * - method1: 내부에서 try-catch로 예외를 처리하는 메서드
 * - method2: throws로 예외를 던져서 호출한 곳에서 예외를 처리하게 하는 메서드
 */

public class Ex10_Exception09 {

    public void method1(int num){
        System.out.println("시작");

        try{
            if(num >= 100){
                System.out.println("정상 입력");
            }
            else{
                throw new Exception("비정상 입력");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("끝");
    }
    
    public void method2(int num) throws Exception{
        System.out.println("시작");
        
        if(num >= 100){
            System.out.println("정상 입력");
        }
        else{
            throw new Exception("비정상 입력");
        }

        System.out.println("끝");
    }

    public static void main(String[] args) {
        Ex10_Exception09 ex = new Ex10_Exception09();

        // method1은 내부에서 예외 처리
        ex.method1(10);

        // method2는 호출한 곳에서 예외 처리
        try {
            ex.method2(10);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
