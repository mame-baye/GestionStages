create database gestion_stages;

create user 'gstages'@'localhost' identified by 'gstages123';

grant all privileges on gestion_stages.* to 'gstages'@'localhost';