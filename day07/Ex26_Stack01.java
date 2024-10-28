package day07;

import java.util.Stack;

public class Ex26_Stack01 {
    public static void main(String[] args) {
        // Stack 객체 생성 (String 타입)
        Stack<String> stack = new Stack<>();

        // 1. 요소 추가 (push 메서드 사용)
        // 스택의 맨 위에 요소를 추가
        stack.push("홍길동");
        stack.push("박문수");
        stack.push("임꺽정");

        // 2. 스택의 현재 상태 출력
        System.out.println(stack);  // 출력: [홍길동, 박문수, 임꺽정]

        // 3. add() 메서드로 요소 추가
        // add() 메서드는 스택에서 제공되지만 일반 리스트의 추가처럼 사용됨
        stack.add("이몽룡");  // 스택의 맨 마지막(리스트의 끝)에 추가
        System.out.println(stack);  // 출력: [홍길동, 박문수, 임꺽정, 이몽룡]

        // 4. 특정 인덱스의 요소 가져오기 (get 메서드 사용)
        // 스택의 3번째 인덱스(즉, 네 번째 요소)를 가져옴
        String data = stack.get(3);
        System.out.println(data);  // 출력: 이몽룡
        System.out.println(stack);  // 출력: [홍길동, 박문수, 임꺽정, 이몽룡]

        // 5. 스택에서 맨 위 요소 제거 (pop 메서드 사용)
        // 스택의 맨 위 요소를 제거하고 반환
        String popData = stack.pop();
        System.out.println(popData);  // 출력: 이몽룡
        System.out.println(stack);  // 출력: [홍길동, 박문수, 임꺽정]
    }
}
