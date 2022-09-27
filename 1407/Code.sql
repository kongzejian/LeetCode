# Write your MySQL query statement below
select name, ifnull(sum(distance),0) as travelled_distance 
from Users as U
left join Rides as R
on R.user_id=U.id
group by user_id
order by travelled_distance desc, name asc

#ifnull函数  ifnull(a，b)如果不为null，返回a,如果是null，返回b
