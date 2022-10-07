# Write your MySQL query statement below
select distinct l1.num as ConsecutiveNums //dinstinct必不可少
from Logs l1, Logs l2, Logs l3                     
where l1.id=l2.id-1 and l2.id=l3.id-1 and l1.num=l2.num and l2.num=l3.num //id连续且num相同
