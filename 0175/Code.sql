# Write your MySQL query statement below
select firstName,lastName,city, state 
from Person as P
left join Address as A
on A.personId =P.personId
#联表查询
