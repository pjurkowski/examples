CREATE TABLE employee (ID SERIAL, NAME varchar, age int, salary int, dept_id int);
INSERT INTO employee(ID, NAME, AGE, SALARY, DEPT_ID) VALUES
  (1, 'Virat', 23, 10000, 1),
  (2, 'Rohit', 24, 7000, 2),
  (3, 'Suresh', 25, 8000, 3),
  (4, 'Shikhar', 27, 6000, 1),
  (5, 'Vijay', 28, 5000, 2);

 CREATE TABLE department(ID serial, NAME varchar);
 INSERT INTO department(ID, NAME) VALUES
  (1, 'Accounting'),
  (2, 'Marketing'),
  (3, 'Sales'),
  (4, 'IT');
