# Day 06

## 💡 주제
```
📌 Object 클래스 메서드 (`toString()`, `equals()`, `hashCode()`) 오버라이딩
   ➡️ 객체의 정보를 문자열로 표현하고, 객체 비교 및 해시 코드 생성 방법 이해하기
   
📌 String 클래스와 주요 메서드
   ➡️ 문자열 처리, 변환, 조작 메서드와 활용 방법 이해하기

📌 String / StringBuffer / StringBuilder
   ➡️ 문자열 처리의 효율성 비교와 각 클래스의 용도 이해하기

📌 Math 클래스 주요 메서드
   ➡️ 수학적 연산과 난수 생성, 반올림 등 다양한 수학 함수 사용법 이해하기

📌 Wrapper 클래스 (Auto-Boxing, Auto-Unboxing)
   ➡️ 기본 자료형을 객체로 변환하고, 자동으로 형 변환되는 과정 이해하기
```

## 📄 파일 설명
| 파일명                     | 내용                                                         |
|:------------------------|:-----------------------------------------------------------|
| Ex01_toStringOverriding | `toString` 메서드를 오버라이딩하여 객체의 필드 정보를 문자열로 반환하는 예제            |
| Ex02_EqualsOverride     | `equals` 메서드를 오버라이딩하여 두 객체의 필드 값이 같을 때 동일 객체로 판단하는 기능을 구현  |

## ✏️ 정리

### is-a (상속) 관계와 has-a (구성) 관계
- `is-a` 관계와 `has-a` 관계는 자바에서 객체 간의 관계를 설명하는 중요한 개념으로, 상속과 구성을 구분하는 데 사용됨
- 이러한 두 관계는 객체지향 프로그래밍에서 **재사용성, 구조 설계, 계층 구조**를 정의하는 데 매우 중요함

**1) `is-a` 관계 (상속 관계)**
- `is-a` 관계는 상속을 통해 정의되며, **하위 클래스가 상위 클래스의 특성을 상속 받는 관계**를 의미함<br>
  (즉, 하위 클래스는 상위 클래스의 일종임)
- 특징
  - 상속을 이용하여 하위 클래스가 상위 클래스의 속성과 행동을 물려 받음
  - 하위 클래스는 상위 클래스의 모든 동작과 속성을 재사용하거나 오버라이딩할 수 있음
  - 하위 클래스는 상위 클래스의 특수한 유형임
  - 예를 들면, "개는 동물의 일종이다" -> `Dog is a Animal`
    
  ```java
  class Animal {
    void eat(){
        System.out.println("This animal is eating");
    }
  }
  
  class Dog{
    void bark(){
        System.out.println("The dog is barking");
    }
  }
  
  public class Main{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.eat(); // 상위 클래스인 Animal의 메서드 사용
        dog.bark(); // Dog 클래스의 메서드 사용  
    } 
  }
  ```

<br>

**2) `has-a` 관계 (구성 관계)**
- `has-a` 관계는 구성을 통해 정의되며, 한 클래스가 다른 클래스의 객체를 포함하는 관계를 의미함<br>
  (즉, 한 객체가 다른 객체를 소유하거나 구성 요소로 포함하고 있다는 의미임)
- 특징
  - 클래스 A가 클래스 b의 인스턴스를 속성 (필드)으로 가짐
  - 구성된 클래스 (즉, 포함된 클래스)의 동작을 사용하지만, 상속 관계는 아님
  - 이 관계는 상속 보다는 클래스 간의 협력을 나타냄
  - 예를 들면, "자도차는 엔진을 가지고 있다" -> "Car has a Engine"

  ```java
  class Engine{
    void start(){
        System.out.println("Engine started");
    }
  }
  
  class Car{
    private Engine engine; // Car 클래스가 Engine 객체를 가짐 (has-a 관계)
    
    Car(){
        engine = new Engine(); // Car 생성자에서 Engine 인스턴스 생성
    }
  
    void drive(){
        engine.start();
        System.out.println("Car is driving");
    }
  }
  
  public class Main{
    public static void main(String[] args){
        Car car = new Car();
        car.drive();
    }
  }
  ```

<br>

**3) `is-a`와 `has-a` 관계 비교

| 특징                | is-a 관계 (상속)                                  | has-a 관계 (구성)                                |
|---------------------|--------------------------------------------------|--------------------------------------------------|
| **관계의 의미**     | 하위 클래스는 상위 클래스의 일종                  | 한 클래스가 다른 클래스의 구성 요소를 포함       |
| **구현 방법**       | 상속 (`extends` 키워드 사용)                      | 구성 (클래스 필드로 다른 클래스의 객체 선언)      |
| **목적**            | 상위 클래스의 동작을 상속받아 재사용 및 확장       | 기능 분리 및 객체 협력을 통해 동작 구현           |
| **클래스 간 결합도**| 결합도가 상대적으로 높음                         | 결합도가 상대적으로 낮음                         |
| **의존성**          | 하위 클래스는 상위 클래스에 강하게 의존           | 구성된 클래스의 동작을 사용하지만 덜 의존적       |
| **사용 예**         | `Dog` is a `Animal`, `Car` is a `Vehicle`        | `Car` has a `Engine`, `Computer` has a `Processor` |
| **주로 사용되는 상황** | 클래스 계층에서 공통 동작을 상속받아 확장할 때 | 특정 클래스가 다른 클래스의 기능을 사용할 때      |

<br>

**4) 사용 시기**
- `is-a` 관계 (상속)
  - **클래스 간에 강한 연관성**이 있을 때 사용함
  - 하위 클래스가 상위 클래스의 속성과 행동을 공유하고 확장해야 할 때 적합함
  - 예를 들면, 동물(Animal)을 상속 받는 개(Dog)는 동물의 특성(eat 등..)을 공유하며 추가적인 특성(bark 등..)을 추가할 수 있음
- `has-a` 관계 (구성)
  - **클래스 간에 약한 결합이 필요**한 경우 사용함
  - 한 클래스가 다른 클래스의 동작을 사용하지만, 상속 보다는 구성으로써 협력할 때 적합함
  - 예를 들어, 자동차(Car)는 엔진(Engine)을 포함하여 구성하지만, 자동차와 엔진 간의 관계는 상속이 아닌 구성임<br>
    (자동차는 여러 엔진을 가질 수 있지만, 각각의 엔진은 자동차의 일부분으로 사용됨)

<br><br><br>

### java.lang.System 클래스

**1) 입출력**
- `System.out`
  - 표준 출력 스트림으로, 주로 콘솔에 출력할 때 사용함
- `System.in`
  - 표준 입력 스트림으로, 주로 키보드 입력을 처리할 때 사용함
- `System.err`
  - 표준 에러 스트림으로, 콘솔에 에러 메시지를 출력할 때 사용함

<br>

**2) 시스템 정보 및 종료**
- `System.currentTimeMillis()`
  - 1970년 1월 1일 자정 이후 경과한 밀리초를 반환함
  - 주로 성능 측정이나 시간 관련 작업을 할 때 사용됨 
  ```java
  public class Main{
    public static void main(String[] args){
        long startTime = System.currentTimeMillis(); // 현재 시작 측정
        // ... 작업 실행 ...
        long endTime = System.currentTimeMillis();
        System.out.println("Execute time: " + (endTime - startTime)+ "ms");
    }
  }
  ```
- `System.exit(int status)`
  - 프로그램을 종료함
  - `status` 값에 따라 종료 상태를 설정할 수 있음
    - `0` : 정상 종료
    - `0`이 아닌 값 : 비정상 종료
  - 프로그램이 종료될 때 JVM이 모든 리소스를 해제하고 종료됨
  ```java
  public class Main{
    public static void main(String[] args){
        System.out.println("Program will exit now.");
        System.exit(0); //정상 종료
        System.out.println("This line will never be printed."); // 출력되지 않음
    }
  }
  ```

<br>

**3) 환경 변수 및 시스템 속성**
- `System.getenv(String name)`
  - 운영체제의 환경 변수를 반환함
  - 예를 들면, `PATH`, `JAVA_HOME` 등의 환경 변수 값을 얻을 수 있음
- `System.getProperty(String key)`
  - 시스템의 속성을 반환함
  - 예를 들면, 자바 버전, 운영체제의 종류, 파일 경로 구분자 등과 같은 시스템 정보를 얻을 수 있음
<br>

**ProcessBuilder**
- 외부 프로세스를 실행시키거나 컨트롤할 수 있음

<br><br><br>

### Java.util.Date와 Calendar

**1) java.util.Date 클래스**
- 자바에서 날짜와 시간을 다루기 위한 클래스임
- 생성 방법
  - `Date` 객체를 생성하면 현재 시스템의 날짜와 시간을 반환함
  - 밀리초 단위로 1970년 1월 1일 00:00:00 GMT를 기준으로 한 시간 값을 인자로 받아 특정 날짜를 생성할 수도 있음

- 주의점 (`Date` 클래스는 설계의 문제점과 API의 혼란으로 인한 몇 가지의 단점이 있음)
  - **월 값의 혼란** : `getMonth()` 메서드는 0부터 11까지의 값을 반환하여, 0월은 1월, 11월은 12월을 의미함
  - **연도 값의 혼란** : `getYeaer()` 메서드는 1900년을 기준으로 한 연도를 반환하여, 예를들어 121을 반환했다면 이는 2021년을 의미함
  - **`Date` 클래스는 불변하지 않음** : `Date` 객체는 변경 가능하므로, 동일한 객체를 여러 곳에서 참조할 경우 문제가 발생할 수 있음
  - **부족한 시간대 지원** : `Date` 클래스는 시간대를 다루는 기능이 부족함
  - **오래된 설계로 인해 많은 메서드가 Deprecated 됨**

<br>

**2) java.util.Calendar 클래스**
- 특징
  - **추상 클래스**이기 때문에 직접 객체를 생성할 수 없으며, `getInstance()` 메서드를 사용하여 하위 클래스의 인스턴스를 얻음
  - **날짜와 시간을 필드 단위로 조작**할 수 있으며, **연도, 월, 일, 시, 분, 초** 등을 개별적으로 설정하거나 가져올 수 있음
  - **달력 시스템을 지원**하며, GregorianCalendar (그레고리력)가 기본 구현체임
- `Calendar`의 상수 필드
  - `Calendar.YEAR` : 연도
  - `Calendar.MONTH` : 월
  - `Calendar.DOY_OF_MONTH` : 일
  - `Calendar.HOUR` : 12시간 형식의 시간
  - `Calendar.HOUR_OF_DAY` : 24시간 형식의 시간
  - `Calendar.MINUTE` : 분
  - `Calendar.SECOND` : 초
  - `Calendar.MILLISECOND` : 밀리초
- `Calendar`의 메서드
  - `set(int field, int amount)` : 연도, 월, 일 등을 직접 설정할 수 있음
  - `add(int field, int amount)` : 날짜나 시간을 더하거나 뺄 수 있음
  - `before(Calendar when)` : 해당 날짜가 인자로 전달된 날짜보다 이전인지 확인함
  - `after(Calendar when)` : 해당 날짜가 인자로 전달된 날짜보다 이후인지 확인함

<br><br><br>

### StringTokenizer와 String.split()
- `StringTokenizer`는 경량화된 문자열 분리 도구로 간단한 문자열 분리 작업에 적합함
- 그러나 자바 1.4 이후로는 `split()` 메서드나 정규 표현식을 활용하는 방법이 더 권장됨
- 여전히 구분자를 기준으로 문자열을 간단히 분리하거나 성능이 중요할 때엔느 경량화된 `StringTokenizer`가 유리할 수 있음

- **`StringTokenizer`와 `split()` 비교**

  | 특징               | `StringTokenizer`               | `String.split()`                        |
  |--------------------|---------------------------------|-----------------------------------------|
  | **도입 시기**      | 자바 1.0                        | 자바 1.4                                |
  | **구분자 처리**    | 개별 문자로 처리                | 정규 표현식 사용 가능                   |
  | **빈 토큰 처리**   | 무시됨                          | 빈 토큰을 포함                          |
  | **성능**           | 더 빠름                          | 더 유연하지만 약간 느릴 수 있음          |
  | **기능**           | 경량화된 기본 문자열 분리        | 정규식을 지원하여 더 많은 기능 제공      |
  | **대체 여부**      | 최신 자바에서 권장되지 않음     | 권장됨                                  |


<br><br><br>

## 📑 참고
- 온라인 자바 튜토리얼: https://www.w3schools.com/java/
- Java SE 17 & JDK 17 String 관련: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#method-summary
- Java SE 17 & JDK 17 Math 관련: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html#method-summary
- 