--liquibase formatted sql
--changeset pouya:1
alter TABLE product
    add column description VARCHAR(50)