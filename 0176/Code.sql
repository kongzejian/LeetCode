#自己的思路：
# Write your MySQL query statement below
select max(salary) as SecondHighestSalary 
from(
select salary
from Employee 
where salary not in (select max(salary)
from Employee)) as t    
#先找出最大值，生成一个没有最大值的临时表，再在临时表里找最大值，查了三遍





# Write your MySQL query statement below 别人的思路：
select max(salary) as SecondHighestSalary
from Employee 
where salary <(select max(salary)
from Employee)
