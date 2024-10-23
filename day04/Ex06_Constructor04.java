class Constructor04{
    String number;
    String name;

    // 기본 생성자: number와 name을 기본 값으로 초기화
    Constructor04(){
        this.number = "0000";
        this.name = "아무개";
    }

    // 이름만 받는 생성자: number는 기본 값으로 초기화, name은 전달받은 값으로 설정
    Constructor04(String name){
        this.number = "0000";
        this.name = name;
    }

    // 학번과 이름을 모두 받는 생성자: number와 name을 전달받은 값으로 설정
    Constructor04(String number, String name){
        this.number = number;
        this.name = name;
    }
}

public class Ex06_Constructor04 {
    public static void main(String[] args) {
        Constructor04 c1 = new Constructor04();
        System.out.println(c1.number);
        System.out.println(c1.name);

        System.out.println();

        Constructor04 c2 = new Constructor04("홍길동");
        System.out.println(c2.number);
        System.out.println(c2.name);
        
        System.out.println();

        Constructor04 c3 = new Constructor04("1234", "박문수");
        System.out.println(c3.number);
        System.out.println(c3.name);
    }
}
