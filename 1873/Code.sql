# Write your MySQL query statement below
select employee_id,
if(employee_id%2=1 and name not like 'M%',salary,0 ) as bonus
from Employees


# Write your MySQL query statement below
select employee_id,
case when (employee_id%2=1 and name not like 'M%') then salary else 0 end as bonus
from Employees
order by employee_id


#新学会的if语法 if(判断的条件,判断为真的结果，判断为假的结果)
#新学会的函数，left(str,length) left(被截取的字段，截取的长度)
#新学会的case when 语句  case 字段名 when 判断条件 then 条件为真 else 条件为假 end

# where last_name regexp 'field$'   查找姓氏以field结尾的顾客
# where last_name regexp '^brush  ^表示查找的字符串必须以什么开头
# where last_name regexp 'field' 查找名字中包含field的顾客
