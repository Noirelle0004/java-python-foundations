--Week07 SQL practice
--Learn database, table, insert, select
CREATE DATABASE school;
CREATE TABLE students (
   id INT,
   name VARCHAR(50)
);
INSERT INTO students (id,name) VALUES (1,'Tom');
INSERT INTO students (id,name) VALUES (2,'Alice');
INSERT INTO students (id,name) VALUES (3,'Bob');
SELECT * FROM students;
SELECT name FROM students;
SELECT * FROM students WHERE i=1;
UPDATE students SET name = 'Jerry' WHERE id = 1;
DELETE FROM students WHERE id=3;
