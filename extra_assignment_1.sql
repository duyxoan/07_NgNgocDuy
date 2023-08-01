DROP database if exists extra_system_assignment_1;
Create database extra_system_assignment_1;
USE extra_system_assignment_1;
DROP TABLE IF EXISTS trainee;
create table trainee(
			traineeid int auto_increment primary key ,
            fullname varchar(50),
            birth_day date,
            gender enum('male', 'female', 'unknow'),
			ET_IQ integer(20),
			ET_Gmath integer(20),
			ET_English integer(50),
            Tranining_class varchar(50),
            evaluation_notes varchar(1000)
            );
ALTER TABLE trainee 
ADD VTI_Account VARCHAR(50) NOT NULL UNIQUE;          
-- exercise2--
DROP TABLE IF EXISTS datatypes ;
create table datatypes(
			id int auto_increment primary key,
            namee varchar(50),
            datacode char(5),
            modifiedday date
            );
-- exercise3--
DROP TABLE IF EXISTS datatypes2 ;
create table datatypes2(
			id int auto_increment primary key,
            namee varchar(50),
            bỉrthday date,
            gender bit,
            isdeletedflag bool
            );
            
            