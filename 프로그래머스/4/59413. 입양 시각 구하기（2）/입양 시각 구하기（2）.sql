-- 코드를 입력하세요
SET @HOUR = -1;

SELECT 
    (@HOUR := @HOUR +1) AS HOUR,
    (SELECT COUNT(ANIMAL_ID) FROM ANIMAL_OUTS WHERE HOUR(DATETIME) = @HOUR) AS COUNT
FROM ANIMAL_OUTS
WHERE @HOUR < 23
ORDER BY @HOUR

/* 
쿼리문에서 로컬변수를 활용하는 문제
이유 : 해당 데이터 베이스에 존재하지 않은 값(0시간에 COUNT = 0)까지 만들어줘야함.

<SET함수를 사용하여 풀기>
SET 옆에 변수명과 초기값을 설정할 수 있다.
@HOUR 변수에 -1 초기화
WHERE 절에서 명시한 23미만까지 :=로 값을 ++하기
그럼 시간은 0~23미만까지 1시간씩 출력됨

COUNT는 WHERE절의 시간을 1시간씩 받아와서 해당하는 


*/