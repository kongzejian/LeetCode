# Write your MySQL query statement below
select distinct user_id, max( time_stamp) as last_stamp 
from Logins
where time_stamp regexp '2020'
group by user_id

#也可以使用year()函数
