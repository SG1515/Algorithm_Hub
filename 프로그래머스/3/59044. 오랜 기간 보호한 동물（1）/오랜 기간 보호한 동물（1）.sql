-- 코드를 입력하세요
SELECT
    I.NAME,
    I.DATETIME
FROM ANIMAL_INS I
LEFT JOIN ANIMAL_OUTS O
USING (ANIMAL_ID)
WHERE O.ANIMAL_ID IS NULL
ORDER BY I.DATETIME LIMIT 3;


-- 아직 입양을 못갔다는 게 포인트 OUTS에 없는 애들이어야한다.