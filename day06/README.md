# Day 06

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

### Object 클래스
- **모든 클래스의 최상위 클래스**
  - 자바의 모든 클래스는 직간접적으로 `Object` 클래스를 상속받음
  - 만약, 특정 클래스를 명시적으로 다른 클래스를 상속하지 않는다면, **자동으로 `Object` 클래스를 상속**받게 됨
- ** 기본 메서드 제공**
  - `object` 클래스는 자바 객체가 가지는 공통된 기능을 제공함
    
     ex) **객체의 문자열 표현, 해시 코드 생성, 객체 비교**와 같은 기능을 제공함

<br>

**1. `toString()` 메서드**
- `toString()` 메서드는 자바에서 **객체를 문자열로 표현**하는 메서드임
- 모든 객체는 `Object` 클래스로부터 `toString()` 메서드를 상속받음

**1) 기본 `toString()` 메서드**
- `Object` 클래스의 기본 `toString()` 메서드는 객체의 런타임 클래스 이름과 해시코드를 기반으로 한 메모리 주소를 반환함
```Java
public String toString(){
    return getClass().getName() + "@" + Integer.toHexString(hashCode());
}
```

**2) `toString()` 메서드 오버라이딩**
- 객체의 내용을 더 가독성 있기 출력하고 싶을 때, `toString()` 메서드를 오버라이딩하여 객체의 속성을 문자열로 출력하도록 변경할 수 있음

**3) `toString()`의 주요 사용 사례**
- **디버깅과 로깅**
  - `toString()` 메서드는 주로 디버깅과 로그 기록에서 유용하게 사용됨
  - 객체의 상태를 쉽게 확인하고, 코드의 흐름을 파악하는 데 도움을 줌
- **객체의 직관적 표현**
  - 사용자 정의 클래스에서 `toString()`을 오버라이딩하면, 객체를 보다 직관적으로 표현할 수 있음
  - 예를 들면 데이터 베이스 레코드나 사용자 정보 등을 출력할 때 객체의 속성을 ㅁ누자열로 변환하여 더 쉽게 읽을 수 있음
- **컬랙션 출력**
  - 자바의 컬렉션 클래스 (`ArrayList`, `HashMap` 등)는 내부에 저장된 객체들의 `toString()` 메서드를 호출하여 출력함
  - 객체의 `toString()` 메서드를 오버라이딩하면, 컬렉션에 포함된 객체들도 가독성 있게 출력됨

<br>

**2. `equals()` 메서드**
- `equals()`는 **객체의 동등성을 확인**하는 메서드임
- 기본적으로, `equals()` 메서드는 두 객체가 **같은 참조 값 (즉, 같은 메모리 주소)을 가리킬 때만 `true`를 반환함
- 이를 오버라이딩하면, 객체의 속성 값을 기준으로 논리적 동등성을 정의할 수 있음

**1) 기본 `equals()` 구현**
```Java
public boolean equals(Oaject obj){
    return (this == obj);
}
```
- **기본 동작** : `Object` 클래스의 `equals()` 메서드는 객체의 참조 값이 같은지를 비교함
- **오버라이딩** : 객체의 논리적 동등성을 비교할 때는 `equals()` 메서드를 오버라이딩하여 객체의 속성 값을 비교할 수 있음

<br>

**3. `hashCode()` 메서드**
- 자바에서 해시코드는 객체를 고유하게 식별할 수 있는 정수 값으로, 같은 객체는 같은 해시코드를 가져야 함

```java
@Override
public int hashCode(){
    return Object.hash(name, age); // 속성을 기반으로 해시코드 생성
}
```

<br>

**cf.`equals()`와 `hashCode()`의 관계**
- `equals()`와 `hashCode()`는 밀접하게 연관되어 있음
- `equals()`를 오버라이딩하면 반드시 `hashCode()`도 오버라이딩 해야 됨<br>
  -> 같은 객체라면 같은 해시코드를 반환해야 하기 때문<br>
  -> 그렇지 않으면 해시 기반 컬렉션 (`HashMap`, `HashSet`)에서 객체가 정상적으로 동작하지 않을 수 있음

<br><br><br>

### String 클래스와 메서드들
- Java에서 `String` 클래스는 **문자열을 처리하기 위한 클래스**임
- Java의 문자열은 **객체**로 관리되며, Java에서가장 많이 사용되는 클래스 중 하나임

<br>

`length` : 문자열의 길이를 반환함
```java
String str = "Hello";
System.out.println(str.length()); // 출력 : 5
```

`charAt(int index)` : 문자열에서 특정 인덱스의 문자를 반환함
```java
String str = "Hello";
System.out.println(str.charAt(1)); // 출력 : 'e'
```

`indexOf(String str)` : 특정 문자열이 처음 나타나는 인덱스를 반환함 (문자열이 없는 경우 `-1` 반환)
```java
String str = "Hello World";
System.out.println(str.indexOf("Wrold")); // 출력 : 6
```

`lastIndexOf(String str` : 특정 문자열이 마지막으로 나타나는 위치의 인덱스를 반환함 (문자열이 없는 경우 `-1` 반환)
```java
String str = "Hello Wrold, Hello Java";
System.out.println(str.lastIndexOf("Hello")); // 출력 : 13
```

`contains(CharSequence s)` : 특정 문자열이 포함되어 있는지 확인하고, 포함되면 `true`, 포함되지 않으면 `false`를 반환함
```java
String str = "Hello World";
System.out.println(str.contains("Hello")); // 출력 : true
```

<br>

**문자열 변환 관련 메서드**

`toLowerCase()` : 문자열을 소문자로 변환한 새로운 문자열 반환
```java
String str = "HELLO";
System.out.println(str.toLowerCase());// 출력 : "hello"
```

`toUpperCase()` : 문자열을 대문자로 변환한 새로운 문자열 반환
```java
String str = "hello";
System.out.println(str.toUpperCase()); // 출력 : "HELLO"
```

`trim()` : 문자열의 양쪽 공백을 제거한 새로운 문자열을 반환함 (중간의 공백은 제거되지 않음)
```java
String str = "   Hello World   ";
System.out.println(str.trim()); // 출력 : "Hello World"
```

`valueOf(primitive data type)` : 기본 자료형 값을 문자열로 변환함
```java
int num = 10;
String str = String.valueOf(num);
```

<br>

**문자열 조작 관련 메소드**

`concat(String str)` : 두 문자열을 연결하여 새로운 문자열을 반환함
```java
String str1 = "Hello";
String str2 = "World";
String result = str1.concat(str2);
System.out.println(result); // 출력 : "Hello World";
```

`replace(char oldChar, char newChar)` : 문자열에서 특정 문자를 다른 문자로 대체한 새로운 문자열을 반환함
```java
String str = "Hello";
String result = str.replace('e', 'a');
System.out.println(result); // 출력 : "Hallo"
```

`replaceAll(String regex, String replacement)` : 정규 표현식에 맞는 문자열을 찾아 대체함
```java
String str = "abc123xyz";
String result = str.replaceAll("\\d", "*"); // 숫자를 *로 대체함
System.out.println(result); // 출력 : "abc***xyz"
```

`substring(int beginIndex)` : `beginIndex`부터 끝까지의 문자열 반환
```java
String str = "Hello World";
String result = str.substring(6);
System.out.println(result); // 출력 : "World"
```

`substring(int beginIndex, int endIndex)` : `beginIndex` 부터 `endIndex` 전까지의 부분 문자열 반환
```java
String str = "Hello World";
String result = str.substring(0,5);
System.out.println(result); // 출력 : "Hello"
```

<br>

**문자열 분할 메서드**

`split(String regex)` : 문자열을 정규 표현식을 기준으로 분할하여 배열로 반환
```java
String str = "apple,banana,grape";
String[] fruits = str.split(",");
for(String fruit : fruits){
    System.out.println(fruit);
}
/*
 * 출력
 * "apple"
 * "banana"
 * "grape"
 */
```

`join(CharSequence delimiter, CharSequence... elements` : 문자열 배열이나 컬렉션을 구분자로 이어 붙여서 하나의 문자열로 반환함
```java
String[] words = {"apple", "banana", "grape"};
String result = String.join(", ", words);
System.out.println(result); // 출력 : "apple, banana, grape"
```

<br>

**형식화된 출력을 도와주는 메서드**

`format(String format, Object... args)` : 형식화된 문자열을 생성할 수 있음 (`%s` : 문자열 / `%d` : 정수 / `%f` : 실수 등)
```java
String formatted = String.format("Hello, %s. You are %d years old.", "John", 25);
System.out.println(formatted); // 출력 : "Hello, John. You are 25 years old."
```

<br><br><br>

### String / StringBuffer / StringBuilder

**특징비교**

| 특징              | String                               | StringBuffer                                    | StringBuilder                                    |
|-------------------|--------------------------------------|-------------------------------------------------|--------------------------------------------------|
| **선언 방식**     | `String str = "Hello";`              | `StringBuffer sb = new StringBuffer("Hello");`  | `StringBuilder sb = new StringBuilder("Hello");` |
| **문자열 변경 방법** | 불변 (변경 불가, 새로운 객체 생성)                | 가변 (원본 문자열 수정 가능)                               | 가변 (원본 문자열 수정 가능)                                |
| **동기화**         | 동기화 없음                               | 동기화 지원 (멀티스레드 환경에서 안전)                          | 동기화 없음 (멀티스레드 환경에서 안전하지 않음)                      |
| **성능**           | 성능이 상대적으로 느림 (새 객체 생성)               | 성능이 상대적으로 느림 (동기화로 인한 오버헤드)                     | 성능이 빠름 (동기화 없음)                                  |
| **사용 목적**      | 문자열이 자주 변경되지 않을 때 적합                 | 멀티스레드 환경에서 문자열이 자주 변경될 때 적합                     | 단일 스레드 환경에서 문자열이 자주 변경될 때 적합                     |
| **불변성 여부**    | 불변 객체 (수정 시 새로운 객체 생성)               | 가변 객체 (원본 수정 가능)                                | 가변 객체 (원본 수정 가능)                                 |
| **멀티스레드 지원**| 아님                                   | 지원                                              | 아님                                               |
| **메모리 사용**    | 변경 시마다 새로운 객체 생성되므로 비효율적             | 메모리 효율적 사용                                      | 메모리 효율적 사용                                       |
| **대부분의 사용 목적**| 간단한 문자열 처리나 상수 문자열                   | 스레드 안전한 환경에서 문자열 조작                             | 단일 스레드 환경에서 문자열 조작                               |
| **주요 메서드**    | `concat()`, `substring()`, `charAt()` | `append()`, `insert()`, `delete()`, `reverse()` | `append()`, `insert()`, `delete()`, `reverse()`  |
| **예시**          | `str = str + " World";`               | `sb.append(" World");`                           | `sb.append(" World");`                           |


<br><br><br>

### Math 클래스 주요 메서드

| 메서드         | 설명                           | 예시                            |
|----------------|-------------------------------|---------------------------------|
| **abs(x)**     | 절대값 반환                     | `Math.abs(-5)` → 5              |
| **min(a, b)**  | 두 값 중 작은 값 반환            | `Math.min(10, 20)` → 10         |
| **max(a, b)**  | 두 값 중 큰 값 반환              | `Math.max(10, 20)` → 20         |
| **pow(a, b)**  | a의 b 제곱                      | `Math.pow(2, 3)` → 8.0          |
| **sqrt(a)**    | 제곱근 반환                     | `Math.sqrt(16)` → 4.0           |
| **round(a)**   | 반올림                         | `Math.round(3.7)` → 4           |
| **ceil(a)**    | 올림                           | `Math.ceil(3.1)` → 4.0          |
| **floor(a)**   | 내림                           | `Math.floor(3.9)` → 3.0         |
| **random()**   | 0.0 ~ 1.0 미만의 난수 반환      | `Math.random()` → 0.0 ~ 1.0     |
| **log(a)**     | 자연 로그 (ln) 반환              | `Math.log(Math.E)` → 1.0        |
| **log10(a)**   | 밑이 10인 로그 반환              | `Math.log10(100)` → 2.0         |
| **sin(a)**     | 사인 값 반환 (라디안 단위)       | `Math.sin(Math.PI / 2)` → 1.0   |
| **cos(a)**     | 코사인 값 반환 (라디안 단위)     | `Math.cos(0)` → 1.0             |
| **tan(a)**     | 탄젠트 값 반환 (라디안 단위)     | `Math.tan(Math.PI / 4)` → 1.0   |


**`Math.random()`와 범위 조정**

- `Math.random()` 메서드는 0.0 이상 1.0 미만의 `double` 타입 난수를 반환함
```java
double randomValue = Math.random();
System.out.println(randomValue); // 출력 : 0.0 <= 값 < 1.0 범위의 난수
```
<br>

- 간단한 수학 연산을 통해 난수 생성의 범위를 지정할 수 있음
```java
int randomValue = (int)(Math.random() * 10);
System.out.println(randomValue); // 출력 : 0 <= 값 < 10 범위의 난수
```

<br><br><br>

### Wrapper 클래스
- 자바에는 8개의 기본 자료형이 있으며, 각각의 기본 자료형에 대응하는 Wrapper 클래스가 존재함

| 기본 자료형  | Wrapper 클래스 |
|--------------|----------------|
| **byte**     | Byte           |
| **short**    | Short          |
| **int**      | Integer        |
| **long**     | Long           |
| **float**    | Float          |
| **double**   | Double         |
| **char**     | Character      |
| **boolean**  | Boolean        |

<br>

**Wrapper 클래스의 필요성**

**1) 객체로 다루기**
- 기본 자료형은 객체가 아니기 때문에 컬렉션 클래스 (`ArrayList`, `HashMap` 등) 같은 곳에서는 사용할 수 없음
- 이때, Wrapper 클래스를 통해 기본 자료형을 객체로 변환하면 객체로 다룰 수 있는 기능을 제공할 수 있음

**2) 유틸리티 메서드 제공**
- 각 Wrapper 클래스는 기본 자료형에 없는 유용한 메서드들을 제공함
- 예를 들어 `Integer` 클래스는 문자열을 정수로 변환하는 `parseInt()` 메서드를 제공함

**3) 형 변환 지원**
- Wrapper 클래스는 기본 자료형 간의 형 변환이나 타입 변환을 더 쉽게 수행할 수 있는 기능도 제공함

<br>

**`Integer` 클래스의 기능들**

1) `parseInt(String s)` : 문자열을 정수로 변환함
```java
String str = "123";
int num = Integer.parseInt(str);
```

2) `valueOf(String s)` : 문자열을 `Integer` 객체로 변환함
```java
Integer obj = Integer.valueOf("123");
```

3) `intValue()` : `Integer` 객체의 정수 값을 반환함
```java
Integer obj = Integer.valueOf("100");
int num = obj.intValue();
```

4) `MAX_VALUE`, `MIN_VALUE` : `Integer`가 표현할 수 있는 최댓값과 최솟값
```java
int max = Integer.MAX_VALUE;
int min = Integer.MIN_VALUE;
```

<br>

**Auto-Boxing과 Auto-Unboxing**
- Java 5 이후 부터는 자바 컴파일러가 자동으로 박싱과 언방식을 처리해줌
- 이를 오토박싱과 언박싱이라고 함
- 즉, 개발자가 명시적으로 변환하지 않아도, 기본 자료형과 Wrapper 클래스 간의 변환이 자동으로 이루어짐

```java
int a = 10;

// 오토박싱 : 기본 자료형 int를 Integer 객체로 자동 변환
Integer wrapperdA = a;

// 오토언박싱 : Integer 객체를 int 값으로 자동 변환
int b = wrappedA;
```

<br><br><br>

## 📑 참고
- 온라인 자바 튜토리얼: https://www.w3schools.com/java/
- Java SE 17 & JDK 17 String 관련: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html#method-summary
- Java SE 17 & JDK 17 Math 관련: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html#method-summary
- 