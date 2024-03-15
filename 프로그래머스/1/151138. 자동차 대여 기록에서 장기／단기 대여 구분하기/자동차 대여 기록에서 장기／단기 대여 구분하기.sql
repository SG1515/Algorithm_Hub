-- 코드를 입력하세요


SELECT
    HISTORY_ID,
    CAR_ID,
    DATE_FORMAT(START_DATE, '%Y-%m-%d') AS START_DATE,
    DATE_FORMAT(END_DATE, '%Y-%m-%d') AS END_DATE,
    CASE WHEN (DATEDIFF(END_DATE ,START_DATE)+1) >= 30 THEN '장기 대여'
    ELSE '단기 대여'
    END AS RENT_TYPE
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE START_DATE LIKE '2022-09%'
ORDER BY HISTORY_ID DESC



/*
날짜의 경우,
2022-09-01 ~ 2022-09-01 동안 대여했을 시 0일을 대여한 게 아니라 하루 대여한 것이기에
29일 이상으로 체크하는 것이 맞습니다.

2022-09-01 ~ 2022-09-02 를 예로 들어보면, 실제로 날짜 차이는 1일이지만, 실제로는 2일 빌렸습니다.*/