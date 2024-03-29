# Write your MySQL query statement below
Select d.name AS Department , e.name AS Employee  , e.salary  AS Salary 
From  Employee e  INNER JOIN  Department d on e.departmentId = d.id 
where  3 > (select count(distinct (e2.Salary))
        from  Employee e2
        where e2.Salary > e.Salary
            and e.DepartmentId = e2.DepartmentId)