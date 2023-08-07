DROP database if exists extra_system_assignment_1;
Create database extra_system_assignment_1;
USE extra_system_assignment_1;
DROP TABLE IF EXISTS trainee;
CREATE TABLE trainee (
    traineeid INT AUTO_INCREMENT PRIMARY KEY,
    fullname NVARCHAR(50) NOT NULL,
    birth_day DATE,
    gender ENUM('male', 'female', 'unknown'),
    ET_IQ INT unsigned CHECK (ET_IQ <= 20),
    ET_Gmath INT unsigned CHECK (ET_Gmath <= 20),
    ET_English INT unsigned CHECK (ET_English <= 50),
    Tranining_class nvarchar(10),
    evaluation_notes TEXT
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
    gender enum('0','1','2'),
    isdeletedflag enum('0','1')
);
INSERT INTO trainee (traineeid, fullname,birth_day,gender,ET_IQ,ET_Gmath,ET_English, Tranining_class,evaluation_notes,VTI_Account)
VALUES ('1','TRAN VAN A','2003-07-03','male','15','12','30','toán','trung bình','tranvana@gmail.com'),
		('2','TRAN VAN B','2002-08-02','male','20','9','10','lí','khá','tranvanb@gmail.com'),
        ('3','TRAN VAN C','2004-09-02','male','11','12','30','hoá','khá','tranvanc@gmail.com'),
        ('4','TRAN VAN D','2006-03-03','male','12','12','20','văn','giỏi','tranvand@gmail.com'),
        ('5','TRAN VAN E','2009-09-03','male','11','5','30','văn','khá','tranvane@gmail.com'),
        ('6','TRAN VAN F','2004-05-02','male','20','11','30','sinh','xuất sắc','tranvanf@gmail.com'),
        ('7','TRAN VAN G','2006-09-12','male','15','12','30','anh','khá','tranvang@gmail.com'),
        ('8','TRAN VAN H','2006-03-21','male','15','12','30','toán','trung bình','tranvanh@gmail.com'),
        ('9','TRAN VAN I','2006-01-15','male','15','12','30','hoá','khá','tranvani@gmail.com');
        
           

