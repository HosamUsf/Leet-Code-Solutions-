# Write your MySQL query statement below
SELECT customer_id from Customer
Group By Customer_id 
Having Count(distinct product_key) = (SELECT COUNT(product_key) from Product) 
order by customer_id asc
