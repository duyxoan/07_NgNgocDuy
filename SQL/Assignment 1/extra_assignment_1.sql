DROP database if exists extra_system_assignment_1;
Create database extra_system_assignment_1;
USE extra_system_assignment_1;
DROP TABLE IF EXISTS trainee;
CREATE TABLE trainee (
    traineeid INT AUTO_INCREMENT PRIMARY KEY,
    fullname NVARCHAR(50),
    birth_day DATE,
    gender ENUM('male', 'female', 'unknow'),
    ET_IQ INTEGER(20),
    ET_Gmath INTEGER(20),
    ET_English INTEGER(50),
    Tranining_class VARCHAR(50),
    evaluation_notes NVARCHAR(100000)
);
ALTER TABLE trainee 
ADD VTI_Account VARCHAR(50) NOT NULL UNIQUE;          
-- exercise2--
DROP TABLE IF EXISTS datatypes ;
CREATE TABLE datatypes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    namee VARCHAR(50),
    datacode CHAR(5),
    modifiedday DATE
);
-- exercise3--
DROP TABLE IF EXISTS datatypes2 ;
CREATE TABLE datatypes2 (
    id INT AUTO_INCREMENT PRIMARY KEY,
    namee VARCHAR(50),
    bỉrthday DATE,
    gender BIT,
    isdeletedflag BOOL
)
            
