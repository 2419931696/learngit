INSERT INTO `t_item_category` VALUES 
(163,162,'�ʼǱ�',1,1,0,'2017-10-25 15:00:55','2017-10-25 15:00:55','admin','admin'),
(236,229,'�ļ�����',1,7,0,'2017-10-25 15:00:55','2017-10-25 15:00:55','admin','admin'),
(238,229,'����/��ǩ',1,9,0,'2017-10-25 15:00:55','2017-10-25 15:00:55','admin','admin'),
(241,229,'����',1,12,0,'2017-10-25 15:00:55','2017-10-25 15:00:55','admin','admin'),
(917,913,'˫���',1,4,0,'2017-10-25 15:00:55','2017-10-25 15:00:55','admin','admin');



show tables;
select empno,ename,sal from emp where mgr is null;
select*from emp;
select* from emp where comm is not null;

select ename,sal from emp where sal<=1600;
select ename,job,sal from emp where deptno=20;
select ename,job,deptno from emp where job="manager";
select ename,deptno from emp where deptno<>10;
select*from t_item where price=23;
select*from t_item where price!=8443;
select ename ����,sal ���� from emp;
select job ���� from emp;
select distinct job from emp;
select distinct deptno from emp;
select *from emp where deptno=10 and sal>3000;
select ename,job,mgr,deptno from emp where deptno=30 or mgr=7698;
select*from emp where sal=5000 or sal=1500 or sal=3000;
select*from emp where sal in(5000,1500,3000);
select*from emp where sal between 2000 and 4000;
select*from emp where sal not between 2100 and 2800;
select*from emp where deptno=10 and sal between 2000 and 3000;
select*from emp where ename like '_a%b';



