# Write your MySQL query statement below
Select activity_date As day , count(DISTINCT user_id) as active_users 
FROM Activity 
where datediff('2019-07-27' , activity_date) < 30 
AND activity_date <= '2019-07-27' 
group by activity_date 
