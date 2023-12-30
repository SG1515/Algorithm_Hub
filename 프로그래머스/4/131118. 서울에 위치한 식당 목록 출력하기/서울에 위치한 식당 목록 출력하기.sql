-- 코드를 입력하세요
SELECT
    A.REST_ID,
    A.REST_NAME,
    A.FOOD_TYPE,
    A.FAVORITES,
    A.ADDRESS,
    round(avg(B.REVIEW_SCORE), 2) as SCORE
FROM REST_INFO AS A
INNER JOIN REST_REVIEW AS B ON A.REST_ID = B.REST_ID
WHERE A.ADDRESS Like '서울%'
GROUP BY A.REST_ID, A.REST_NAME, A.FOOD_TYPE, A.FAVORITES, A.ADDRESS
ORDER BY avg(B.REVIEW_SCORE) DESC, A.FAVORITES DESC;


-- substr(A.ADDRESS, 1,2) = '서울'에서 주소가 '서울'로 시작하는지 확인하는 것은 = 대신에 LIKE를 사용해야 할 것으로 보입니다.

-- GROUP BY 구문이 없는데, 집계 함수를 사용하면 일반적으로 집계 함수를 사용하는 컬럼 외에는 GROUP BY 절에 명시해주어야 합니다.