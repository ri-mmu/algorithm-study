### 자바 배열 초기화 규칙
배열 만들면, 타입별 기본값으로 다 채워짐.
숫자 타입 → 0, 0.0
boolean → false
객체/문자열 → null

### 나머지 연산
나눗셈을 제외하고, 분배 법칙 성립
ex. (A+B) % C == (A%C + B%C) % C

### import문 지식
import java.util.*;만 있으면 거의 커버 가능

### Comparable 인터페이스
public interface Comparable<T> {
    int compareTo(T t);
}
반드시 compareTo()를 오버라이딩 해야하고, 그 클래스의 객체끼리 크기 비교가 가능

### compareTo 메서드의 규칙
compareTo(T t)는 정수(int)를 반환하는데, 의미는 다음과 같다:
음수 → this 객체가 t보다 "작다" (앞에 온다)
0 → 두 객체가 "같다"
양수 → this 객체가 t보다 "크다" (뒤에 온다)

https://velog.io/@minyeongg/Comparable과-Comparator-인터페이스