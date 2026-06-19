SELECT
    ROUND(AVG(SAL))
FROM
    SCOTT.EMP;

select deptno, round(avg(sal)) from scott.emp group by deptno; 

select * from scott.emp where sal >= (select round(avg(sal)) from scott.emp);

select * from scott.emp o where sal >= (select round(avg(sal)) from scott.emp i where i.deptno = o.deptno);

select deptno,count(*) from scott.emp group by deptno order by deptno desc;


select deptno, count(*) from scott.emp group by deptno order by count(*) desc ;

select deptno,sum(sal) from scott.emp group by deptno order by sum(sal) desc fetch first 1 row only;

select deptno, max(sal) as max_salary, min(sal) as min_salary from scott.emp group by deptno order by deptno asc;




-- joins

select * from scott.emp;

select e.ename as ENAME, e.empno as ENO, m.ename as MGR_NAME , m.empno as MGR_NO , mm.ename as MGR_MGR_NAME, mm.empno as MGR_MGR_NO from scott.emp e, scott.emp m , scott.emp mm where e.mgr = m.empno and m.mgr = mm.empno;


select e.ename as ENAME, e.empno as ENO, m.ename as MGR_NAME , m.empno as MGR_NO , mm.ename as MGR_MGR_NAME, mm.empno as MGR_MGR_NO from scott.emp e left join scott.emp m on e.mgr = m.empno left join scott.emp mm on m.mgr = mm.empno;
