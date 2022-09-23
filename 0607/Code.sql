# Write your MySQL query statement below
select S.name from SalesPerson as S #从SalesPerson中获得名字
where S.sales_id not in #销售员的id与RED公司无关
(
select O.sales_id from Orders as O #选取orders表中与RED公司有关的销售员id
where O.com_id =(select C.com_id from Company as C where C.name="RED")
)
