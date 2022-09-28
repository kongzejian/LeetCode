CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
 set N=N-1;   #这一步很重要，如果在limit里直接写N-1会报错
  RETURN (
      # Write your MySQL query statement below.
      select distinct salary 
      from Employee
      order by salary desc
      limit N,1
  );
END
