# Write your MySQL query statement below
select D.name as  Department, E.name as Employee, E.Salary
from Employee as E
left join Department as D
on E.departmentId=D.id  
where (E.departmentId,E.Salary) in (select departmentId,max(Salary)   # in 居然可以有两个字段，另外，先group by 再order by 并不是在组内group by，而是所有的结果进行排序，oder by 都是组的信息
from Employee 
group by departmentId)
