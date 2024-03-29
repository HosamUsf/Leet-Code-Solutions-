# Write your MySQL query statement below
Select 
    Max(Salary) AS SecondHighestSalary 
from Employee 
    where Salary < (
                     Select Max(Salary) from Employee
                   );