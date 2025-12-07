CREATE DATABASE trainingdb;
USE trainingdb;

CREATE TABLE student (
    studid INT PRIMARY KEY,
    name VARCHAR(100),
    course VARCHAR(50),
    doj DATE
);

INSERT INTO student VALUES
(1,'Ramesh','Java','2023-01-10'),
(2,'Suresh','Python','2023-02-12'),
(3,'Mahesh','C++','2023-03-01'),
(4,'Anita','Java','2023-04-22'),
(5,'Pooja','React','2023-05-15'),
(6,'Rahul','Node','2023-06-20'),
(7,'Kiran','Java','2023-07-10'),
(8,'Sneha','Angular','2023-08-30'),
(9,'Vijay','C#','2023-09-12'),
(10,'Geeta','DevOps','2023-10-05');
