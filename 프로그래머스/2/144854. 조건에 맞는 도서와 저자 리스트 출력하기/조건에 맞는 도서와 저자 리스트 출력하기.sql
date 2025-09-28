-- 코드를 입력하세요
SELECT b.book_id as BOOK_ID, a.author_name AS AUTHOR_NAME, DATE_FORMAT(b.published_date,"%Y-%m-%d") AS PUBLISHED_DATE
from Book b
join Author a on b.author_id = a.author_id
where b.category = "경제"
order by b.published_date;