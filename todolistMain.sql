
create database todolist;
use todolist;

create table task(
	id varchar(255) not null,
    task_name varchar(255) not null,
    task_description varchar(255) not null,
    create_at date not null,
    checked boolean default 0,
    project_id varchar(255)
);
create table project(
	id varchar(255) not null,
    project_name varchar(255) not null
);
insert into task (id,task_name,task_description,create_at,checked,project_id) values
(1,'task1','25 push up','2022/01/13','1',1),
(2,'task2','50 squats','2022/01/13','1',1),
(3,'task3','15 leg lifts','2022/01/13','1',1),
(4,'task4','jaming G major scale','2022/03/24','0',2);
insert into project (id,project_name) values
(1,'daily'),
(2,'guitar practice');
alter table task
add primary key (id);
alter table project
add primary key (id);
alter table task add constraint foreign key (project_id) references project(id);
