# Write your MySQL query statement below
select t1.id as Id
from Weather as t1
cross join Weather as t2   #交叉连接
where dateDiff(t1.recordDate,t2.recordDate)=1 #计算日期差的函数 and t1.Temperature> t2.Temperature
