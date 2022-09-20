# Write your MySQL query statement below
#全外连接
select E.employee_id from Employees as E
left join Salaries as S
on E.employee_id=S.employee_id
where salary is null
union 
select S.employee_id from Employees as E
right join Salaries as S
on E.employee_id=S.employee_id
where name is null
order by employee_id
