-- 1) How many payments transactions were greater then $5.00?
-- A: 3618 

SELECT COUNT(*) FROM payment
WHERE amount > 5; 

-- 2) How many actors have a first name that starts with the letter P?
-- A: 5

SELECT COUNT(*) FROM actor
WHERE first_name LIKE 'P%';

-- 3) How many unique districts are our customers from?
-- A: 378

SELECT COUNT(DISTINCT (district)) FROM address;

-- 4) Retrieve the list of names for those distinct districts from the previous question

SELECT DISTINCT district FROM address; 

-- 5) How many films have a rating of R and a replacement cost between $5 and $15?
-- A: 52

SELECT COUNT(*) FROM film
WHERE rating IN('R') AND replacement_cost BETWEEN 5 AND 15;

-- 6) How many films have the word Truman somewhere in the title?
-- A: 5 

SELECT COUNT(*) FROM film
WHERE title ILIKE '%Truman%';

/*
  7) We have two staff members, with Staff IDs 1 and 2. We want to give a bonus
  to the staff member that handled the most payments. (Most in terms of numbers of
  payments processed, not total dollar amount). How many payments did each staff member 
  handle and who gets the bonus?
*/

SELECT staff_id, COUNT(amount) FROM payment
GROUP BY staff_id
ORDER BY staff_id DESC;

/*
   8) Corporate HQ is conducting a study on the relationship between replacement cost
   and a movie MPAA rating (e.g. G, PG, R, etc...). What is the average replacement cost
   per MPAA rating?
   Note: You many need to expand the AVG column to view correct results.
*/

SELECT rating, ROUND(AVG(replacement_cost), 2) FROM film
GROUP BY rating;

/*
   9) We are running a promotion to reward our top 5 customers with coupons. What are the customer
   ids of the top 5 customers by total spend? Note: In dollars
*/

SELECT customer_id, SUM(amount) FROM payment
GROUP BY customer_id
ORDER BY SUM(amount) DESC
LIMIT 5;

/*
   10) We are lauching a platinum service for our most loyal customers. We will assign platinum 
   status to customers that have had 40 or more transaction payments. What customer IDs are
   eligible for platinum status?
   A: 144, 526, 148
*/

SELECT customer_id, COUNT(amount) FROM payment
GROUP BY customer_id 
HAVING COUNT(amount) >= 40;

/*
   11) What are the customer ids of customers who have spent more than $100 in payment transactions
   with our staff id member 2?
   A: 522, 187, 211, 526, 148
*/

SELECT customer_id, staff_id, SUM(amount) FROM payment
GROUP BY customer_id, staff_id 
HAVING SUM(amount) > 100 AND staff_id = 2;

SELECT customer_id, SUM(amount) FROM payment
WHERE staff_id = 2
GROUP BY customer_id
HAVING SUM(amount) > 100;

/*

ASSESSMENT TEST 1

1) Return the customer IDs of customers who have spent at least $110
with the staff member who has an ID of 2.
A: 187 and 148

2) How many films begin with the letter J? 
A: 20

3) What customer has the highest customer ID number whose name starts with an 'E'
and has an address ID lower than 500?
A: Eddie Tomlin

*/

SELECT customer_id, SUM(amount) FROM payment
WHERE staff_id = 2
GROUP BY customer_id
HAVING SUM(amount) >= 110;

SELECT COUNT(*) FROM film
WHERE title LIKE 'J%';

SELECT first_name, last_name FROM customer
WHERE first_name LIKE 'E%' AND address_id < 500
ORDER BY customer_id DESC
LIMIT 1;

/*
   12) California sales tax laws have changed and we need to alert our customers to this through email.
   What are the emails of the customers who live in California?
*/

SELECT address.district, email AS california_people_email FROM customer -- Nao ha necessidade de distinguir tabelas
INNER JOIN address
ON customer.address_id = address.address_id
WHERE address.district = 'California';

SELECT district, email FROM address
INNER JOIN customer
ON address.address_id = customer.address_id
WHERE district = 'California';

/*
   13) A customer walks in and is a huge fan of the actor 'Nick Wahlberg' and wants to know which movies he is in.
   Get a list of all the movies 'Nick Wahlberg' has been in.
*/

SELECT title, first_name AS actor_first_name, last_name AS actor_last_name
FROM film
INNER JOIN film_actor 
ON film.film_id = film_actor.film_id
INNER JOIN actor
ON actor.actor_id = film_actor.actor_id
WHERE first_name = 'Nick' AND last_name = 'Wahlberg';

/*
   14) During which months did payments occur? Format your answer to return back the full month name
*/

SELECT DISTINCT(TO_CHAR(payment_date, 'Month')) FROM payment;

/*
   15) How many payments occured on a monday?
   *Obs: depois do dia ha 3 espaços em branco
*/

SELECT COUNT(*) FROM payment
WHERE EXTRACT(DOW FROM payment_date) = 1;

SELECT COUNT(*) FROM payment
WHERE TRIM(TO_CHAR(payment_date, 'Day')) = 'Monday';