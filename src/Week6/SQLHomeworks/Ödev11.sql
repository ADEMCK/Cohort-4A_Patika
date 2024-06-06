--1.SORU
(SELECT first_name FROM actor)
UNION (SELECT first_name FROM customer);

--2.SORU
(SELECT first_name FROM actor)
INTERSECT (SELECT first_name FROM customer);

--3.SORU
(SELECT first_name FROM actor)
EXCEPT (SELECT first_name FROM customer);

--4.SORU
--4.A
(SELECT first_name FROM actor ORDER BY first_name)
UNION ALL (SELECT first_name FROM customer ORDER BY first_name);

--4.B
(SELECT first_name FROM actor ORDER BY first_name)
INTERSECT ALL (SELECT first_name FROM customer ORDER BY first_name);

--4.C
(SELECT first_name FROM actor ORDER BY first_name)
EXCEPT ALL (SELECT first_name FROM customer ORDER BY first_name);