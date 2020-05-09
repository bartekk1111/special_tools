-- utworzenie bazy danych
create database tools_service_db
	character set utf8 
    collate utf8_polish_ci;

set @@global.time_zone = '+2:00';
    
-- utworznie użytkownika z uprawnieniami typu
-- create, drop, alter, insert, update, select, delete
create user 'tools_service_user'@'localhost' identified by 'qwe123';
grant 
	create, drop, alter, insert, update, select, delete, references
on 
	tools_service_db.*
to 
	'tools_service_user'@'localhost';