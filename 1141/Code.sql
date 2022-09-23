# Write your MySQL query statement below
select activity_date as day, count(distinct user_id ) as active_users 
from Activity
where datediff("2019-07-27",activity_date)<30 and datediff("2019-07-27",activity_date)>0
group by activity_date


#方法一：最保险的where t.activity_date between '2019-06-28' and '2019-07-27'
#方法二：where datediff('2019-07-27', t.activity_date) < 30 and t.activity_date < '2019-07-27'，要注意<30可能产生负数

。
