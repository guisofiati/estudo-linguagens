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