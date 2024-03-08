-- 코드를 작성해주세요
WITH front_end AS (SELECT SUM(CODE)
                FROM SKILLCODES
                WHERE CATEGORY = 'Front End')

SELECT CASE 
    WHEN SKILL_CODE & (SELECT * FROM front_end) 
        AND SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'python')
        THEN 'A'
    WHEN SKILL_CODE & (SELECT CODE FROM SKILLCODES WHERE NAME = 'C#') 
        THEN 'B'
    WHEN SKILL_CODE & (SELECT * FROM front_end)
        THEN 'C'
    END AS GRADE, ID, EMAIL
FROM DEVELOPERS
GROUP BY GRADE, ID, EMAIL
HAVING GRADE IS NOT NULL
ORDER BY GRADE, ID;
    
    
    /*
    https://wyatti.tistory.com/entry/MYSQL-mysql-case-when-then-%EC%82%AC%EC%9A%A9%EB%B0%A9%EB%B2%95 - WHEN THEN
    
    https://codingdog.tistory.com/entry/mysql-with-%EC%A0%88-%EC%9E%84%EC%8B%9C-%EA%B2%B0%EA%B3%BC%EB%A5%BC-%EC%A0%95%EC%9D%98%ED%95%98%EB%8A%94-with-%EC%A0%88%EC%9D%84-%EC%95%8C%EC%95%84%EB%B4%85%EC%8B%9C%EB%8B%A4 - WHIT절 
    */