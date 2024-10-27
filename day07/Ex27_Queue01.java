package day07;

import java.util.LinkedList;
import java.util.Queue;

public class Ex27_Queue01 {
    public static void main(String[] args) {
        // Queue 객체 생성 (LinkedList 사용)
        Queue<String> queue = new LinkedList<>();

        // 1. 요소 추가 (offer 메서드 사용)
        // 큐의 맨 뒤에 요소를 추가
        queue.offer("홍길동");
        queue.offer("박문수");
        queue.offer("임꺽정");

        // 2. 큐의 현재 상태 출력
        System.out.println(queue);  // 출력: [홍길동, 박문수, 임꺽정]

        System.out.println();

        // 3. 특정 요소 추가 (offer 메서드 사용)
        // 큐의 맨 뒤에 새로운 요소를 추가
        queue.offer("이몽룡");
        System.out.println(queue);  // 출력: [홍길동, 박문수, 임꺽정, 이몽룡]

        System.out.println();

        // 4. 큐의 맨 앞 요소 가져오기 (peek 메서드 사용)
        // 큐의 맨 앞에 있는 요소를 제거하지 않고 가져옴
        String data = queue.peek();
        System.out.println(data);  // 출력: 홍길동
        System.out.println(queue);  // 큐는 변하지 않음: [홍길동, 박문수, 임꺽정, 이몽룡]

        System.out.println();

        // 5. 큐에서 맨 앞 요소 제거 (poll 메서드 사용)
        // 큐의 맨 앞 요소를 제거하고 반환
        String polledData = queue.poll();
        System.out.println(polledData);  // 출력: 홍길동
        System.out.println(queue);  // 출력: [박문수, 임꺽정, 이몽룡]
    }
}
