# Write your MySQL query statement below
select `sell_date`,
count(distinct `product`) as `num_sold`,
group_concat(distinct `product` order by `product` separator ',') as `products` 
from Activities 
group by `sell_date` 

#第一步，先根据sell_date分组
# 第二步，count和group by连用，统计各组的个数，统计每个日期的组中，product不同（使用distinct）的数量,select 后面被group by分组的字段会去重
# group_concat(字段名 order by 字段名 ASC/DESC separator '标点符号') 
