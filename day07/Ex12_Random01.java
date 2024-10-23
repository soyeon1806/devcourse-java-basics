package day07;

import java.util.Random;

public class Ex12_Random01 {
    public static void main(String[] args) {
        Random rand1 = new Random(System.currentTimeMillis());

        // Random 객체 생성 (시드 없이 생성 -> 현재 시간을 기반으로 랜덤한 시드가 설정됨)
        Random random = new Random();

        // 1. nextInt() : 모든 범위에서 랜덤 정수 생성
        int randomInt = random.nextInt(); // -2^31 ~ 2^31-1 사이의 정수
        System.out.println("랜덤 정수 (모든 범위): " + randomInt);

        // 2. nextInt(bound) : 0부터 bound-1 사이의 랜덤 정수 생성
        int randomBoundedInt = random.nextInt(100); // 0부터 99까지의 정수
        System.out.println("랜덤 정수 (0 ~ 99): " + randomBoundedInt);

        // 3. nextDouble() : 0.0 이상 1.0 미만의 랜덤 실수 생성
        double randomDouble = random.nextDouble(); // 0.0 <= x < 1.0
        System.out.println("랜덤 실수 (0.0 ~ 1.0 미만): " + randomDouble);

        // 4. nextFloat() : 0.0 이상 1.0 미만의 랜덤 float 생성
        float randomFloat = random.nextFloat(); // 0.0 <= x < 1.0
        System.out.println("랜덤 float (0.0 ~ 1.0 미만): " + randomFloat);

        // 5. nextBoolean() : 랜덤한 true 또는 false 값 생성
        boolean randomBoolean = random.nextBoolean(); // true 또는 false
        System.out.println("랜덤 불리언: " + randomBoolean);

        // 6. nextLong() : 랜덤 long 값 생성
        long randomLong = random.nextLong(); // -2^63 ~ 2^63-1 사이의 long 타입 값
        System.out.println("랜덤 long: " + randomLong);

        // 7. nextGaussian() : 정규분포(평균 0, 표준편차 1)에서 난수 생성
        double randomGaussian = random.nextGaussian(); // 평균 0, 표준편차 1의 정규분포
        System.out.println("랜덤 Gaussian 값: " + randomGaussian);

        // 8. 시드 값을 이용한 난수 생성
        Random seededRandom = new Random(12345); // 시드 12345를 사용하여 난수 생성기 초기화
        int seededRandomInt = seededRandom.nextInt(100); // 시드가 같으면 항상 같은 결과
        System.out.println("시드 기반 랜덤 정수 (0 ~ 99): " + seededRandomInt);

        // 9. 배열에서 무작위 인덱스를 선택해 요소 출력
        String[] fruits = {"사과", "배", "수박", "참외", "딸기"};
        int randomIndex = random.nextInt(fruits.length); // 0부터 배열 길이-1까지 인덱스 생성
        System.out.println("랜덤 과일 선택: " + fruits[randomIndex]);

        // 10. ThreadLocalRandom 예시 (멀티스레드 환경에서 사용 권장)
        // ThreadLocalRandom.current().nextInt(0, 100): 0부터 99까지의 랜덤 정수 생성
        int threadLocalRandomInt = java.util.concurrent.ThreadLocalRandom.current().nextInt(0, 100);
        System.out.println("ThreadLocalRandom을 사용한 랜덤 정수 (0 ~ 99): " + threadLocalRandomInt);
        
    }
}
