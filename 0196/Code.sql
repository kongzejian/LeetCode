DELETE from Person # 删除不在t中的id
Where Id not in (
    Select Id  #将step 1的查询结果作为临时表t（ 不能先select一个表的记录再按此条件更新或删除同一张表，必须有一个临时表）
    From(
    Select MIN(Id) as id From Person  Group by Email #将Email分组后，找到最小的id step1
   ) t
)

delete u from Person as u, Person as v
where u.email=v.email and u.id>v.id
