DROP database if exists extra_system_assignment_1;
Create database extra_system_assignment_1;
USE extra_system_assignment_1;
DROP TABLE IF EXISTS Fresher_management;
CREATE TABLE Fresher_management (
    traineeid INT ,
    fullname NVARCHAR(100) NOT NULL,
    birth_day DATE,
    gender ENUM('male', 'female', 'unknown'),
    ET_IQ INT unsigned CHECK (ET_IQ <= 20),
    ET_Gmath INT unsigned CHECK (ET_Gmath <= 20),
    ET_English INT unsigned CHECK (ET_English <= 50),
    Tranining_class nvarchar(10),
    evaluation_notes TEXT
);
ALTER TABLE Fresher_management
ADD VTI_Account nVARCHAR(50) NOT NULL UNIQUE;          
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
INSERT INTO Fresher_management (traineeid, fullname,birth_day,gender,ET_IQ,ET_Gmath,ET_English, Tranining_class,evaluation_notes,VTI_Account)
VALUES ('1','Ngô Xuân Đông','2003-07-03','male','15','12','30','toán','trung bình','tranvana@gmail.com'),
		('2','Trần Hữu Hưng','2002-08-02','male','20','9','10','lí','khá','tranvanb@gmail.com'),
        ('3','Trịnh Kim Chi','2004-09-02','female','11','12','30','hoá','khá','tranthic@gmail.com'),
        ('4','Lưu Thị Kim Dung','2006-03-03','female','12','12','20','văn','giỏi','tranthid@gmail.com'),
        ('5','Nguyễn Hạ Quỳnh Thy','2009-09-03','female','11','5','30','văn','khá','tranthie@gmail.com'),
        ('6','Nguyễn Ngọc Duy','2004-05-02','male','20','11','30','sinh','xuất sắc','tranvanf@gmail.com'),
        ('7','Nguyễn Thị Giang','2006-09-12','female','15','12','30','anh','khá','tranvang@gmail.com'),
        ('8','TRAN VAN H','2006-03-21','male','15','12','30','toán','trung bình','tranvanh@gmail.com'),
        ('9','TRAN VAN I','2006-01-15','male','15','12','30','hoá','khá','tranvani@gmail.com');
       
		
    select * from Fresher_management;
    delete from Fresher_management;
    SET SQL_SAFE_UPDATES = 0;
    -- ques2--
   SELECT COUNT(traineeid ) as 'số học sinh đã qua bài thi đầu vào',month(birth_day) as 'tháng sinh' 
   FROM Fresher_management
   GROUP BY  month(birth_day);
   -- ques3
	select * from Fresher_management
    where char_length(fullname) = (select max(char_length(fullname))
    from Fresher_management);
-- ques4-- 
select * from Fresher_management
where ET_IQ + ET_Gmath >=20 and
	 ET_IQ >=8 and
    ET_Gmath >=8 and 
    ET_English >= 18 ;
-- ques5
delete  from Fresher_management
where traineeid = 3;    
-- ques6
update Fresher_management
set Tranining_class = 'lí'
where traineeid= 5;
    
    
    