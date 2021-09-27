--liquibase formatted sql
--changeset pouya:1
CREATE TABLE product
(
    id   bigint primary key,
    name VARCHAR(255) not null
);