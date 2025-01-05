--liquibase formatted sql

--changeset chuzzzta:1
create table readings (
    id int primary key,
    readings float,
    type varchar(50)
);
