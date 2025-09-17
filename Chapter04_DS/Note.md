### 아스키코드
같은 문자와 숫자의 코드 값 차이는 48이다.    
문자에서 숫자를 구하려면  
'1' - 48 또는 '1' - '0' 이렇게 하면 됨. 

### 자바에서의 형 변환
String형 -> 숫자형
- Integer.parseInt()
- Integer.valueOf()  
숫자형 -> String형
- String.valueOf()
- Integer.toString()  
문자열 → 문자 배열
- toCharArray()

### 2차원 배열 구간 합 구하기
D[i][j] = D[i - 1][j] + D[i][j - 1] - D[i - 1][j - 1] + A[i][j];  
(x1,y1)부터 (x2,y2)까지의 합 구하는 공식  
D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1] + D[x1 - 1][y1 - 1];  

### 나머지 연산(%)
자바에서 %는 음수가 나올 수 있으므로 수학적 모듈러(mod)을 해주어야 함.  