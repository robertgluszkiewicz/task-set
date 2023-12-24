-- 10 statements for insertion.

INSERT INTO country (name) 
VALUES 
('UK'), 
('Italy'), 
('Spain'), 
('Sweden'), 
('Austria');

INSERT INTO city (country_id, name) 
VALUES 
(8, 'London'), 
(8, 'Leeds'), 
(8, 'St Ives'),
(9, 'Milan'), 
(9, 'Rome'), 
(10, 'Madrit'), 
(10, 'Barcelona'), 
(11, 'Malmo'), 
(12, 'Vienna');

INSERT INTO address (city_id, street, house_number, apartment_number, zip_code)
VALUES
(3, 'Abbey Road', '10', '101', '12345'),
(3, 'Baker Street', '221B', '1', '23456'),
(3, 'Down Road', '18', '45', '34567'),
(4, 'Kings Road', '78C', '143', '45678'),
(4, 'Brick Lane', '32', '28', '56789'),
(5, 'Carnaby', '26', '226', '67890'),
(5, 'Rose Avenue', '6', '2', '666770');

INSERT INTO address (city_id, street, house_number, zip_code)
VALUES
(3, 'Borrow Park', '11', '12123'),
(3, 'Fun Square', '8', '23234');

INSERT INTO customer (address_id, first_name, last_name, phone, email)
VALUES
(2, 'John', 'Smith', '123123123', 'j.smith@google.com'),
(2, 'Sara', 'Smith', '123000000', 's.smith@google.com'),
(3, 'Sherlock', 'Holmes', '111111111', 'sherlock@london.com'),
(4, 'Emily', 'Brown', '222333444', 'emilybrown@icloud.com'),
(4, 'Jack', 'Brown', '222333999', 'jackbrown@icloud.com');

INSERT INTO account (customer_id, name, number, balance, interest_rate)
VALUES
(6, 'personal', '111', '6000.66', '0.00'),
(6, 'company', '222', '80000.88', '2.0'),
(7, 'personal', '333', '100.00', '1.75'),
(8, 'personal', '444', '1.11', '0.00');

INSERT INTO loan (customer_id, name, number, balance, interest_rate)
VALUES
(8, 'for costume', '666', '1000.00', '4.66'),
(8, 'for horse', '777', '2000.00', '9.25');

INSERT INTO department (name)
VALUES
('Sales'),
('Marketing'),
('HR');

INSERT INTO transaction (account_id, amount)
VALUES
(13, '600.00'),
(14, '11500.00'),
(15, '123.50');

INSERT INTO employee (department_id, first_name, last_name, position, email)
VALUES
(4, 'Anna', 'Pinky', 'Director', 'pinky@bank.com'),
(4, 'Adele', 'Brain', 'Specialist', 'brain@bank.com'),
(4, 'Lara', 'Croft', 'Manager', 'croft@bank.com'),
(5, 'Harry', 'Potter', 'Wizard', 'harry@bank.com'),
(5, 'Pola', 'Flain', 'Marketing Director', 'flain@bank.com'),
(6, 'Alice', 'Cooper', 'HR Director', 'cooper@bank.com');

INSERT INTO course (name, start_date, end_date)
VALUES
('Security', '2023-12-1', '2023-12-8'),
('Sales', '2023-12-10', '2023-12-23'),
('Time management', '2023-12-27', '2023-12-29');

INSERT INTO employee_course (employee_id, course_id)
VALUES
(6, 3),
(7, 3),
(8, 3),
(9, 3),
(10, 3),
(11, 3),
(6, 4),
(7, 4),
(6, 5),
(10, 5),
(11, 5);


-- 10 statements for updating.

UPDATE country
SET name='France'
WHERE country_id=12;

UPDATE city
SET name='Paris'
WHERE city_id=11;

UPDATE address
SET apartment_number=116
WHERE address_id=7;

UPDATE account
SET interest_rate='0.50'
WHERE account_id=13;

UPDATE account
SET name='temporary'
WHERE account_id=15;

UPDATE department
SET name='Human Resources'
WHERE department_id=6;

UPDATE employee
SET position='Branch Director'
WHERE employee_id=6;

UPDATE employee
SET last_name='Gluro'
WHERE employee_id=10;

UPDATE course
SET name='Data security'
WHERE course_id=3;

UPDATE course
SET end_date='2023-12-28'
WHERE course_id=5;


-- 10 statements for deletions.

DELETE FROM city
WHERE city_id=10;

DELETE FROM city
WHERE city_id=8;

DELETE FROM city
WHERE city_id=9;

DELETE FROM country
WHERE country_id=10;

DELETE FROM country
WHERE country_id=11;

DELETE FROM address
WHERE address_id=6;

DELETE FROM address
WHERE address_id=10;

DELETE FROM customer
WHERE customer_id=10;

DELETE FROM loan
WHERE loan_id=2;

DELETE FROM employee_course
WHERE employee_course_id=25;


-- 5 alter table.

ALTER TABLE city
ADD is_capital BOOLEAN;

ALTER TABLE city
DROP COLUMN is_capital;

ALTER TABLE customer
ADD age INT;

ALTER TABLE customer
DROP COLUMN age;

ALTER TABLE card
RENAME COLUMN cvc_code TO cvc;


-- 1 big statement to join all tables in the database.

SELECT *
FROM customer
JOIN account ON customer.customer_id=account.customer_id 
JOIN loan ON customer.customer_id=loan.customer_id
JOIN address ON customer.address_id=address.address_id;


/*
5 statements with left, right, inner, outer joins.
MySQL doesn't support OUTER JOIN as separate JOIN, so I emulated it (by using LEFT/RIGHT JOIN and UNION) in the last statement.
*/

SELECT customer.first_name, customer.last_name, account.balance
FROM customer
LEFT JOIN account ON customer.customer_id=account.customer_id;

SELECT transaction.amount, account.name AS account_name, account.number AS account_number
FROM transaction
RIGHT JOIN account ON transaction.account_id=account.account_id;

SELECT country.name, city.name
FROM country
INNER JOIN city ON country.country_id=city.country_id;

SELECT customer.first_name, customer.last_name, loan.balance, loan.interest_rate
FROM customer
INNER JOIN loan ON customer.customer_id=loan.customer_id;

SELECT *
FROM customer
LEFT JOIN loan
ON customer.customer_id=loan.customer_id
UNION
SELECT *
FROM customer
RIGHT JOIN loan
ON customer.customer_id=loan.customer_id;


-- 7 statements with aggregate functions and group by and without having.

SELECT COUNT(address_id), last_name
FROM customer
GROUP BY last_name;

SELECT COUNT(phone), last_name
FROM customer
GROUP BY last_name;

SELECT COUNT(address_id), apartment_number
FROM address
GROUP BY apartment_number;

SELECT COUNT(course_id), employee_id
FROM employee_course
GROUP BY employee_id;

SELECT COUNT(employee_id), course_id
FROM employee_course
GROUP BY course_id;

SELECT SUM(balance), customer_id
FROM account
GROUP BY customer_id;

SELECT AVG(balance), customer_id
FROM loan
GROUP BY customer_id;


-- 7 statements with aggregate functions and group by and with having.

SELECT COUNT(address_id), last_name
FROM customer
GROUP BY last_name
HAVING COUNT(address_id)>1;

SELECT COUNT(phone), last_name
FROM customer
GROUP BY last_name
HAVING COUNT(phone)>3;

SELECT COUNT(address_id), apartment_number
FROM address
GROUP BY apartment_number
HAVING COUNT(address_id)=2;

SELECT COUNT(course_id), employee_id
FROM employee_course
GROUP BY employee_id
HAVING COUNT(course_id)=1;

SELECT COUNT(employee_id), course_id
FROM employee_course
GROUP BY course_id
HAVING COUNT(employee_id)<=3;

SELECT COUNT(employee_id), course_id
FROM employee_course
GROUP BY course_id
HAVING COUNT(employee_id) BETWEEN 5 AND 10;

SELECT AVG(balance), customer_id
FROM loan
GROUP BY customer_id
HAVING AVG(balance)>500;
