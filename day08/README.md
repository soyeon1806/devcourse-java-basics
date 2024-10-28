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


## 📑 참고
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Exception.html
https://docs.oracle.com/javase/specs/jls/se17/html/jls-11.html#jls-11.2