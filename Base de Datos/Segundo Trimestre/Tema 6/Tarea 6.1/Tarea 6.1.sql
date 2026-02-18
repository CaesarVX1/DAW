-- Consulta 1
-- SELECT *
-- 	FROM products
-- 	WHERE buyPrice > 50;

-- Consulta 2

-- SELECT DISTINCT *
-- FROM products;
    
-- Consulta 3
-- SELECT productName, 
-- 	productLine
-- FROM products
-- WHERE productLine = 'Classic Cars' AND quantityInStock <1000;

-- Consulta 4
-- SELECT *
-- FROM products
-- ORDER BY MSRP ASC LIMIT 10;

-- Consulta 5
-- SELECT *
-- FROM employees
-- WHERE lastName LIKE 'P%';

-- Consulta 6
-- SELECT firstName,
-- 		lastName
-- FROM employees
-- WHERE officeCode = 1;

-- Consulta 7
-- SELECT customerNAME,
-- 		creditLimit
-- FROM customers
-- WHERE country = 'SPAIN' AND creditLimit > 100000
-- ORDER BY customerName;

-- Consulta 8
-- SELECT orderNumber
-- FROM orders
-- WHERE YEAR (orderDate) = 2003 LIMIT 5;

-- Consulta 9
-- SELECT productCode
-- FROM orderdetails
-- WHERE quantityOrdered = 100;

-- Consulta 10
-- SELECT productLine
-- FROM productlines
-- WHERE htmlDescription IS NULL;

-- Consulta 11
-- SELECT customerName,
-- 		city
-- FROM customers
-- WHERE city LIKE 'B%N';

-- Consulta 12
-- SELECT orderNumber,
-- 		shippedDate
-- FROM orders
-- WHERE DATE (shippedDate) BETWEEN ('2003/01/15') AND ('2003/02/15');

-- Consulta 13
-- SELECT *
-- FROM productlines
-- WHERE image IS NULL;

-- Consulta 14
-- SELECT firstName,
-- 		lastName,
-- 		jobTitle
-- FROM employees
-- WHERE jobTitle like 'Sales Rep' OR jobTitle like 'Sales Manager%';

-- Consulta 15
-- SELECT customerNumber
-- FROM payments
-- WHERE amount BETWEEN 50000 AND 100000;

-- Consulta 16
-- SELECT productName,
-- 		buyPrice
-- FROM products
-- WHERE productLine = 'Motorcycles' AND buyPrice < 70 OR MSRP > 150;

-- Consulta 17
-- SELECT  city,
-- 		country
-- FROM customers
-- WHERE country = 'France' OR country = 'Spain';

-- Consulta 18
-- SELECT *
-- FROM products
-- ORDER BY buyPrice DESC LIMIT 20;

-- Consulta 19
-- SELECT customerName,
-- 		contactLastName
-- FROM customers
-- WHERE contactLastName = 'King' OR contactLastName = 'Smith';

-- Consulta 20
SELECT productName,
		productLine,
        productVendor
FROM products
WHERE productName LIKE '19%'
	AND productVendor != 'Min Lin Diecast';