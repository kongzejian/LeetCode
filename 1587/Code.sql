# Write your MySQL query statement below
select name NAME, sum(amount) as BALANCE
from Users U
left join Transactions T
on U.account=T.account
group by name
having sum(amount)>10000
