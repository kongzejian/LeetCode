# Write your MySQL query statement below
select id, 'Root' as type
from tree
where p_id is null
union 
select id,'Leaf' as type
from tree
where id not in (select distinct p_id from tree where p_id is not null ) and p_id is not null
union
select id,'Inner' as type
from tree
where id in (select distinct p_id from tree where p_id is not null) and p_id is not null
order by id


#子查询 'ROOT' as `type`, ''里面是直接填入的字符，type是表头
#where要写在from的后面
