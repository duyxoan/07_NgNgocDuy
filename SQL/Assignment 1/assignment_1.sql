DROP database if exists testing_system_assignment_1;
Create database testing_system_assignment_1;

USE testing_system_assignment_1;
DROP TABLE IF EXISTS department;
create table department(
			 department int ,
             department_name varchar(50)
             );
DROP TABLE IF EXISTS position;
create table position (
			 position_id int ,
             position_name varchar(10)
             );
DROP TABLE IF EXISTS account;
create table account (
			account_id int ,
            email varchar(50),
            user_name varchar(50),
            full_name varchar(50),
            department_id varchar(20),
            Position_id int,
            Create_date date
            );


            