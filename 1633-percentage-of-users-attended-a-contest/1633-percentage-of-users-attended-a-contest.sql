# Write your MySQL query statement below
SELECT contest_id ,round(Count( distinct user_id) *100 / (select count(user_id) from Users) ,2) as   percentage
FROM Register 
GROUP BY contest_id 
order by percentage desc , contest_id;