# Write your MySQL query statement below
select `Name` as 'Customers' #返回的表头取别名
from `Customers` as C #返回的数据来自的表
where C.Id not in (select CustomerId from Orders)
