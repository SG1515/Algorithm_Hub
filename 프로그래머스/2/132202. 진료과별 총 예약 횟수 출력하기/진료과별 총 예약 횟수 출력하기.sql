-- 코드를 입력하세요
SELECT
    MCDP_CD AS '진료과코드',
    COUNT(PT_NO) AS '5월예약건수'
FROM APPOINTMENT
where  YEAR(APNT_YMD)='2022' AND MONTH(APNT_YMD)='05'
GROUP BY MCDP_CD
ORDER BY 5월예약건수, 진료과코드;


/*
여기서는 집계함수를 사용하고 GROUP BY로 묶었는데 왜 HAVING을 사용하지 않았는가?

일단 WHERE은 우선적으로 모든 필드를 조건에 둘 수 있다.
WHERE 문에서 APNT_YMD의 날짜정보를 이용하여서 22년 5월을 필터링하지 않고
GROUP BY를 실행한 후 HAVING절을 사용하면
테이블이 이미 그룹화 되어 APNT_YMD를 찾을 수 없어 UnKnown Column이라는 오류를 뱉는다.

그래서 그룹화된 컬럼에 조건을 줄 것이면 그룹화 후 HAVING절을 사용하는 것이 맞고
그룹화 이전에 컬럼을 사용하여서 조건을 줄 것이면 WHERE절로 필터링 후 그룹화를 하는 것이 맞다.

- 참고
WHERE은 항상 FROM 뒤에 위치한다는 것을 잊지말자.
*/