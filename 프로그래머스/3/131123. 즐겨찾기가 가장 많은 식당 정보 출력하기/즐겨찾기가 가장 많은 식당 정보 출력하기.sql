-- 코드를 입력하세요
SELECT
    FOOD_TYPE,
    REST_ID,
    REST_NAME,
    FAVORITES
FROM
    REST_INFO
WHERE (FOOD_TYPE, FAVORITES)
IN (SELECT FOOD_TYPE, MAX(FAVORITES) FROM REST_INFO GROUP BY FOOD_TYPE)
ORDER BY
    FOOD_TYPE DESC;
    
    /* GROUP BY
    처음에 푼 것과 같이 그룹바이로 묶어버리면 
    각 그룹의 상단의 데이터를 가져오게 된다. 운좋게 다른 데이터들은 일치하는 값을 불러왔지만 
    일식은 다른 값이 나오는 것을 알 수 있다.
    MAX 집계함수로 FAVORITES에 조건을 주어도 그룹바이는 SUM과 COUNT는 먹히나 MAX는 먹히지 않는다고 한다.
    
    하여 서브 쿼리를 이용하여 문제를 풀어보자.
    집가서 sql 첫걸음에 서브쿼리 부분 보기
    */