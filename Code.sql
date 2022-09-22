# Write your MySQL query statement below
select customer_id, count(customer_id) as count_no_trans #6. 计算分组后的id（去重），计算id出现的次数
from Visits as V                        # 1.访问Visits表
left join Transactions as R             # 3. 联表
on V.visit_id=R.visit_id                #2. 联表的条件 
where amount is null                    # 4. 筛选使得左表剩下没有交易的数据 剩下4 6 7 8行
group by customer_id                   # 5. 将4 6 7 8 行根据customer_id分组
