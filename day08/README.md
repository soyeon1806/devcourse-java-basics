# Day 01

## 💡 주제
```
📌 자바 기초 구조
   ➡️ 자바 프로그램의 기본 구조와 시작 방법 이해하기
📌 입출력
   ➡️ 콘솔에 출력하는 기본적인 방법 이해하기
📌 변수와 자료형
   ➡️ 다양한 변수 선언과 자료형의 사용법 이해하기
📌 형 변환
   ➡️ 자료형 간의 자동 및 강제 형 변환 이해하기
📌 변수와 자료형
   ➡️ 산술, 비교, 논리, 대입, 증감 연산자의 기본 동작 이해하기
```

## 📄 파일 설명
| 파일명 | 내용 |
|:--   |:--      |
| Ex01_Start | 자바 프로그램 시작 구조 |
| Ex02_Print | 출력 함수 예제 |
| Ex03_Variable01 ~ Ex04_Variable02 | 변수 선언 및 사용 예제 |
| Ex05_DataType01 ~ Ex10_DataType06 | 기본 자료형과 진법 예제 |
| Ex11_Casting01 ~ Ex12_Casting02 | 자료형 변환 예제 |
| Ex13_Operator01 ~ Ex19_Operator07 | 산술, 비교, 논리, 대입, 증감 연산자 예제 |

## ✏️ 정리

### Exception

**1) 예외란**
- 예외는 프로그램 실행 중 발생하는 비정상적인 상황을 의미함
- 예를 들면, 배열 인덱스 초과, 파일을 찾을 수 없음, null 값을 참조하려고 할 때 발생하는 오류 등이 예외임
- 예외가 발생하면 프로그램의 정상적인 흐름이 깨질 수 있으므로, 예외를 처리해야 프로그램이 정상적으로 종료되거나 안정적으로 실행됨

![exception&error](images/exception&error.png)
![exception](images/exception.png)

<br>

**cf) `if`문을 사용한 예외 방지**
- `if`문을 사용하여 예외 상황을 처리하는 방법은 프로그램이 예외를 발생시키지 않고, 조건을 확인하여 예외가 발생할 가능성이 있는 상황을 미리 처리하는 방식임
- 예를 들면, 숫자를 0으로 나누는 오류는 미리 조건을 확인하여 방지할 수 있음

<br>

**2) 예외의 종류**
- Checked Exception (검사된 예외)
  - **컴파일러가 예외 처리를 강제하는 예외**임
  - 예외가 발생할 가능성이 있는 코드는 반드시 `try-catch`로 처리하거나, `throws` 키워드를 사용하여 호출하는 메서드에 예외 처리를 위임해야 함
  - ex) `IOException`, `SQLException`, `FileNotFoundException`
- Unchecked Exception (검사되지 않은 예외)
  - 런타임에 발생하는 예외로, **컴파일러가 예외 처리를 강제하지 않음**
  - 주로 프로그래머의 실수로 발생하며, 논리적인 로유나 잘못된 입력이 원인이 됨
  - ex) `NullPointerException`, `ArrayIndexOutOfBoundsException`, `AritmeticException`

<br>

**3) 예외 처리 구문 (`try-catch-finally`)**
- `try` 블록
  - 예외가 발생할 가능성이 있는 코드를 작성함
- `catch` 블록
  - 예외가 발생하면 처리하는 코드를 작성함
- `finally` 블록
  - 예외 발생 여부와 상관 없이 항상 실행되는 블록임
  - 주로 자원 해제 (ex. 파일 닫기, 데이터베이스 연결 해제)에 사용됨

<br><br><br>

### thorw
**`thorw`란**
- 자바에서 예외를 명시적으로 발생시키는 데 사용하는 키워드
- 특정 조건에서 개발자가 직접 예외를 발생시키고, 그 예외를 처리할 수 있도록 하는 기능을 제공함
- 주로 사용자 정의 예외를 던지거나, 특정 로직에서 의도적으로 예외를 발생시킬 때 사용됨

```java
public class Example{
  public static void main(String[] args) {
    throw new NullPointerException("강제 예외 발생");
  }
}
```

<br>

**`thorw`를 사용하는 상황**
- 검증 조건에 맞지 않을 때
  - 입력값이 유효하지 않거나 특정 조건을 충족하지 못할 경우, 명시적으로 에외를 던져 오류를 처리하도록 할 수 있음
- 사용자 정의 예외
  - 사용자가 정의한 예외를 직접 발생시켜, 특정 상황에 맞는 오류 처리를 유도할 수 있음
- 프로그램 로직에서 특정 상태를 명확히 알릴 때
  - 프로그램에서 비정상적인 흐름이나 중단을 요구하는 경우 직접 예외를 던질 수 있음

<br><br><br>

### throws
**`throws`란**
- 자바에서 메서드 선언부에 사용되어 해당 메서드가 예외를 던질 가능성이 있음을 호출하는 쪽에 알리는 키워드
- 즉, 메서드 내부에서 발생할 수 있는 예외를 처리하지 않고, 호출한 곳으로 던질 때 사용함
- 이를 통해 호출한 메서드에서 예외를 직접 처리하거나, 또 다른 곳으로 예외 처리를 위임할 수 있음

**`throws`의 사용 목적**
- 메서드에서 발생할 수 있는 예외를 호출한 메서드로 전달하여 처리할 수 있도록 함
- Checked Exception (검사된 예외)에 대해 예외 처리를 강제함<br>
  -> `throws`를 사용하지 않으면 컴파일러에서 오류가 발생함
- Unchecked Exception (검사되지 않은 예외)는 `throws`로 명시할 필요가 없지만, 코드 가독성을 위해 사용하기도 함

**`throws`를 사용하는 이유**
- Checked Exception 처리 강제
  - 자바에서는 Checked Exception이 발생할 수 있는 메서드는 반드시 예외 처리를 강제함<br>
    -> 이를 처리하는 방식으로는 두 가지가 있음
      - `try-catch`로 직접 처리
      - `throws`로 호출한 곳으로 예외를 던져서 처리
- 예외 처리 위임
  - 메서드 내부에서 발생한 예외를 직접 처리하지 않고, 호출한 메서드가 그 예외를 처리하도록 할 수 있음<br>
    -> 이를 통해 예외 처리가 필요 없는 단순 로직과 예외 처리 로직을 분리할 수 있음

<br>

**`throw`와 `throws`의 차이**
- `throw`
  - 실제로 예외를 발생시키는 데 사용됨
  - ex) `throw new Exception("강제 예외 발생);`
  - 예외를 명시적으로 발생시키는 키워드임
- `throws`
  - 메서드 선언부에서 예외가 발생할 가능성이 있음을 선언하는 키워드임
  - ex) `void method() throws IOException`
  - 해당 메서드가 특정 예외를 던질 수 있음을 명시하며, 호출하는 쪽에서 예외를 처리해야 함

<br><br><br>

## 📑 참고
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Exception.html
https://docs.oracle.com/javase/specs/jls/se17/html/jls-11.html#jls-11.2