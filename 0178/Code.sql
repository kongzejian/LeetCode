# Write your MySQL query statement below
select score,Dense_rank() over (order by score desc) as 'rank'
from Scores
order by score desc

# Write your MySQL query statement below
select t1.score, count(distinct t2.score)
from Scores as t1, Scores as t2
where t1.score<=t2.scores
group by t1.id
order by t1.score



#四大排名函数
#Row_number() 在排名是序号 连续 不重复，即使遇到表中的两个一样的数值亦是如此
#Rank() 函数会把要求排序的值相同的归为一组且每组序号一样，排序不会连续执行
#Dense_rank() 排序是连续的，也会把相同的值分为一组且每组排序号一样
