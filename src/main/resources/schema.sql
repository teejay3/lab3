create database testdb;

create sequence testt_id_seq start with 1;

create table systemuser
(
id primary key default nextval('testt_id_seq'),
user_login varchar(100) not null,
user_password varchar(100) not null,
age int
);