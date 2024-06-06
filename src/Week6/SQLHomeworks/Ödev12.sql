--1.SORU
SELECT COUNT (*) FROM film
WHERE length > (SELECT AVG(length) FROM film);

--2.SORU
SELECT COUNT (*) FROM film
WHERE renta_rate = (SELECT MAX(renta_rate) FROM film);

--3.SORU
SELECT title,replacement_cost,renta_rate FROM film
WHERE (renta_rate,replacement_cost) = ANY
(SELECT MIN(renta_rate), MIN(replacement_cost) FROM film);

--4.SORU
SELECT customer_id COUNT(*) AS payment_count FROM payment
GROUP BY customer_id ORDER BY payment_count DESC;