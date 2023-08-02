DROP database if exists extra_system_assignment_1;
Create database extra_system_assignment_1;
USE extra_system_assignment_1;
DROP TABLE IF EXISTS trainee;
CREATE TABLE trainee (
    traineeid INT AUTO_INCREMENT PRIMARY KEY,
    fullname NVARCHAR(50) NOT NULL,
    birth_day DATE NOT NULL,
    gender ENUM('male', 'female', 'unknown') NOT NULL,
    ET_IQ INT unsigned CHECK (ET_IQ <= 20) NOT NULL,
    ET_Gmath INT unsigned CHECK (ET_Gmath <= 20) NOT NULL,
    ET_English INT unsigned CHECK (ET_English <= 50) NOT NULL,
    Tranining_class CHAR(6) NOT NULL,
    evaluation_notes TEXT
);
ALTER TABLE trainee 
ADD VTI_Account VARCHAR(50) NOT NULL UNIQUE;          
-- exercise2--
DROP TABLE IF EXISTS datatypes ;
CREATE TABLE datatypes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    namee VARCHAR(50) NOT NULL,
    datacode CHAR(5) NOT NULL,
    modifiedday DATETIME DEFAULT NOW()
);
-- exercise3--
DROP TABLE IF EXISTS datatypes2 ;
CREATE TABLE datatypes2 (
    id INT AUTO_INCREMENT PRIMARY KEY,
    namee VARCHAR(50),
    bỉrthday DATE,
    gender ENUM('0', '1', '2'),
    isdeletedflag ENUM('0', '1')
)
            
