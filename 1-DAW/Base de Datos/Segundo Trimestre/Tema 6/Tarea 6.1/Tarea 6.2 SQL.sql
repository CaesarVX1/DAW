-- Usar base de datos
USE classicmodels;

-- Tarea 1
SELECT *
FROM employees
INNER JOIN offices USING (officeCode)
WHERE city = 'Boston';

-- Tarea 2
SELECT employeeNumber,
		firstName,
		extension
FROM employees
LEFT JOIN customers ON employeeNumber = salesRepEmployeeNumber
WHERE customerNumber IS NULL;

-- Tarea 3
SELECT COUNT(employeeNumber) AS total_empleados,
	city,
	officeCode
FROM employees
INNER JOIN offices USING (officeCode)
GROUP BY officeCode
ORDER BY officeCode;

-- Tarea 4
SELECT customerNumber,
	customerName,
	customers.state,
	employeeNumber
FROM customers
INNER JOIN employees ON salesRepEmployeeNumber = employeeNumber
INNER JOIN offices USING(officeCode)
WHERE customers.state = offices.state;

-- Tarea 5
SELECT productCode,
		orderNumber,
		productName,
		MAX(quantityOrdered)
FROM orderdetails
INNER JOIN products USING(productCode)
ORDER BY quantityOrdered;

-- Tarea 6
SELECT customerName,
		orderDate,
		quantityOrdered,
        productLine
        productName
FROM customers
INNER JOIN orders USING(customerNumber)
INNER JOIN orderdetails USING(orderNumber)
INNER JOIN products USING(productCode)
WHERE YEAR (orderDate) = 2005 AND YEAR (shippedDate) = 2005;

-- Tarea 7
SELECT productCode,
	orderNumber
FROM orders
INNER JOIN orderdetails USING(orderNumber)
WHERE orderNumber IN (10270, 10272, 10279);

-- Tarea 8
SELECT productName,
		AVG(priceEach * quantityOrdered) AS gastosPromedios
FROM products
INNER JOIN orderdetails USING(productCode)
INNER JOIN orders USING(orderNumber)
INNER JOIN customers USING(customerNumber)
WHERE country = 'Japan'
GROUP BY productName
ORDER BY gastosPromedios DESC;

-- Tarea 9
SELECT DISTINCT customerName
FROM customers
INNER JOIN orders USING (customerNumber)
INNER JOIN orderdetails USING(orderNumber)
INNER JOIN products USING (productCode)
WHERE productLine = 'Trains' OR productLine = 'Trucks and buses';

-- Tarea 10
SELECT productName,
		productCode,
		orderNumber
FROM products
LEFT JOIN orderdetails USING (productCode)
WHERE quantityOrdered IS NULL;