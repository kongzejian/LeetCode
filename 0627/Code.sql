# Write your MySQL query statement below
update Salary set sex=if(sex='f','m','f') 

update Salary set sex= case sex when 'm' then 'f' else 'm' end

# Write your MySQL query statement below
update Salary set sex= case sex when 'm' then 'f' else 'm' end 
