DROP database if exists testing_system_assignment_1;
Create database testing_system_assignment_1;

USE testing_system_assignment_1;
DROP TABLE IF EXISTS department;
CREATE TABLE department (
    department INT,
    department_name VARCHAR(50)
);
DROP TABLE IF EXISTS position;
CREATE TABLE position (
    position_id INT,
    position_name VARCHAR(10)
);
DROP TABLE IF EXISTS account;
CREATE TABLE account (
    account_id INT,
    email VARCHAR(50),
    user_name VARCHAR(50),
    full_name VARCHAR(50),
    department_id VARCHAR(20),
    Position_id INT,
    Create_date DATE
);


            