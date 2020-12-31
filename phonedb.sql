/*cmd창에서 계정 생성*/
create user phonedb identified by phonedb;
grant resource, connect to phonedb;

--테이블  생성
create table person(
person_id number(5),
name VARCHAR2(30) not null,
hp VARCHAR(20),
company VARCHAR(20),
primary key(person_id)
);
--person_id 시퀀스 생성
create sequence seq_person_id
increment by 1
start with 1;

--select all
select * from person;

--table 안에 내용 삭제
delete from person;

--table 자체 삭제
drop table person;

--person_id 시퀀스 삭제
drop sequence seq_person_id;

--insert data
insert into person
values(seq_person_id.nextval,'이효리','010-1111-1111','02-1111-1111');
insert into person
values(seq_person_id.nextval,'정우성','010-2222-2222','02-1111-1111');
insert into person
values(seq_person_id.nextval,'유재석','010-3333-3333','02-1111-1111');
insert into person
values(seq_person_id.nextval,'이정재','010-4444-4444','02-1111-1111');
insert into person
values(seq_person_id.nextval,'서장훈','010-5555-5555','02-5555-5555');

--select data
select person_id,
       name,
       hp,
       company
from person;

update person
set name = '이정재',
    hp = '010-9999-9999',
    company = '02-9999-9999'
where person_id = 4;

delete from person
where person_id = 5;

--select data
select person_id,
       name,
       hp,
       company
from person;

select person_id,
       name,
       hp,
       company
from person
where name like '%유%';