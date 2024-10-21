package day04;

class Variable02{
    String instanceVariable;

    void doFunc(){
        String instanceVariable = "20";
        System.out.println("doFunc() 호출 " + instanceVariable);
        System.out.println("doFunc() 호출 " + this.instanceVariable);
    }

    void doFunc2(String instanceVariable){
        System.out.println("doFunc2()) 호출 " + instanceVariable);
        System.out.println("doFunc2() 호출 " + this.instanceVariable);
    }
}

public class Ex02_Variable02 {
    public static void main(String[] args) {
        Variable02 v = new Variable02();

        v.instanceVariable = "10";

        v.doFunc();
        v.doFunc2("30");
    }
}
