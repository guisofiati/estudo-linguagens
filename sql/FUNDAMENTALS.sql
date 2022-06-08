/*
                    Tabela: Filme
    |========================================== |
    |id  |      nome      | avaliacao |  genero |
    |===========================================|
    | 1  |   Annabelle    |   2.0     | Terror  |
    | 2  |   Shrek 1      |   4.0     | Animacao|
    | 3  |   Vikings      |   4.9     | Acao    |
    | 4  |   Terroristas  |   3.0     | Acao    |
    | 5  |   Era do Gelo  |   4.9     | Animacao|
    | 6  |   Era do Gelo 2|   4.5     | Animacao|
    |===========================================|

*/

-- SELECT FROM

SELECT * FROM filme; -- Seleciona todas as colunas da tabela filme
SELECT nome FROM filme; -- Seleciona a coluna nome da tabela filme

-- SELECT DISTINCT 

SELECT DISTINCT genero FROM filme; -- Remove as duplicacoes da coluna genero

-- COUNT()

SELECT COUNT(*) FROM filme; -- Conta as linhas / total de elementos da tabela filme
SELECT COUNT(nome) FROM filme; -- Conta quantas linhas existem na coluna nome
SELECT COUNT(DISTINCT (genero)) FROM filme; -- Filtra os generos repetidos e conta quantos generos existem

-- SELECT WHERE

SELECT nome FROM filme
WHERE avaliacao > 3 AND genero = 'Acao'; -- Filtra o filme que a avaliacao e maior que tres e o genero e de acao

SELECT COUNT(*) FROM filme
WHERE avaliacao = 2 OR avaliacao > 3; -- Filtra o filme que a avaliacao e 2 ou maior que 3

-- ORDER BY

SELECT nome FROM filme
ORDER BY nome ASC, avaliacao DESC; -- Filtra os filmes ordenado ASC e a avaliacao DESC 

-- LIMIT

SELECT nome FROM filme
ORDER BY avaliacao DESC
LIMIT 1; -- Filtra um filme com avaliacao DESC

SELECT nome FROM filme
WHERE avaliacao = 4.9 AND genero != 'Acao'
LIMIT 2; -- Filtra 2 filmes com avaliacao 4.9 e o genero diferente de acao

-- BETWEEN

SELECT * FROM filme
WHERE avaliacao BETWEEN 2 AND 4 -- Filtra os filmes com avaliacao entre 2 e 4;

-- IN()

SELECT * FROM filme
WHERE avaliacao IN(2, 3) -- Mostra os filmes com avaliacao 2 e 3;

-- LIKE (Case-Sensitive) | ILIKE (Case-Insensitive)

-- % = sequencia caracteres 
-- _ = um caractere

SELECT * FROM filme
WHERE nome LIKE 'Era do Gelo _' -- Filtra um filme com um caractere depois da string

SELECT * FROM filme
WHERE nome LIKE '%l%'; -- Filtra um filme que tenha a letra 'L' no meio da palavra

SELECT * FROM filme
WHERE nome ILIKE '_her%' AND avaliacao NOT LIKE '3';

-- FUNCOES DE AGREGACAO

-- AVG() - Media

SELECT AVG(avaliacao) FROM filme; -- Media de avaliacao 

SELECT ROUND(AVG(avaliacao), 2) FROM filme; -- Media de avaliacao arredondado com 2 casas decimais

-- COUNT() - Total resultados

SELECT COUNT(nome) FROM filme; -- Total de linhas/resultados

-- MIN() - Menor valor

SELECT MIN(avaliacao) FROM filme;

-- MAX() - Maior valor

SELECT MAX(avaliacao) FROM filme;

SELECT MAX(avaliacao), MIN(avaliacao) FROM filme;

-- SUM() - Soma de uma coluna

SELECT SUM(avaliacao) FROM filme;

-- GROUP BY

SELECT category, SUM(total_value) FROM enterprise
GROUP BY category
ORDER BY SUM(total_value); -- Soma o total de ganhos de cada categoria 

SELECT company, divison, SUM(sales)
FROM finance_table
WHERE division IN('marketing', 'transport')
GROUP BY company, division; -- Soma as vendas da compania onde a divisao e marketing e transporte 

SELECT company, SUM(sales)
FROM finance_table
GROUP BY company
ORDER BY SUM(sales) -- Soma as vendas da compania, ordenados pelas vendas

SELECT customer_id, COUNT(amount) FROM payment
GROUP BY customer_id
ORDER BY COUNT(amount) DESC; -- Conta quantas transacoes cada customer fez e ordena o maior

SELECT customer_id, staff_id, SUM(amount) FROM payment
GROUP BY staff_id, customer_id
ORDER BY staff_id, customer_id; -- Soma o valor que cada customer realizou com o staff 1 ou 2

SELECT DATE(payment_date), SUM(amount) FROM payment
GROUP BY DATE(payment_date)
ORDER BY SUM(amount) DESC; -- Soma o valor por dia e mostra o dia com a maior venda

-- HAVING

SELECT company, SUM(sales) FROM finance_table
WHERE company != 'Google'
GROUP BY company
HAVING SUM(sales) > 1000; -- Filtra empresas com vendas maior que 1000, sem o google.

SELECT customer_id, SUM(amount) FROM payment
WHERE customer_id NOT IN(87, 44, 22)
GROUP BY customer_id
HAVING SUM(amount) > 100; -- Soma o valor que cada customer realizou, maior que 100 e sem os ids: 87, 44 e 22

SELECT store_id, COUNT(customer_id) FROM customer
GROUP BY store_id
HAVING COUNT(customer_id) > 300; -- Conta quantas lojas tem mais de 300 customers

-- AS

SELECT avaliacao AS avaliacao_filme FROM filme; -- Renomeia a coluna avaliacao para avaliacao_filme (so no resultado)

-- JOINS 

-- INNER OUTER JOIN // INNER JOIN (semelhancas de duas tabelas)

SELECT * FROM registration
INNER JOIN logins
ON reg_id = log_id; -- Pega a coluna reg_id e log_id valores semelhantes

SELECT payment_id, payment.customer_id, first_name FROM payment
INNER JOIN customer
ON payment.customer_id = customer.customer_id -- Pega id comum entre o customer id das 2 tabelas

-- FULL OUTER JOIN // FULL JOIN (juntar tudo das duas tabelas)

SELECT * FROM registration
FULL OUTER JOIN logins
ON registration.reg_id = logins.log_id
WHERE reg_id IS null OR log_id is NULL -- Pega tudo que nao tem em ambas tabelas e junta 

-- LEFT OUTER JOIN // LEFT JOIN (tudo o que tem na esquerda que a direita nao tem)

SELECT COUNT(*) FROM film
LEFT JOIN inventory
ON film.film_id = inventory.film_id
WHERE inventory.film_id IS null -- Conta quantos filmes nao ha no inventario

-- RIGHT OUTER JOIN // RIGHT JOIN (tudo o que tem na direita que a esquerda nao tem)

SELECT COUNT(*) FROM film
RIGHT JOIN inventory
ON film.film_id = inventory.film_id
WHERE inventory.film_id IS null -- Conta quantos inventarios nao ha filmes

-- UNION (unir duas tabelas)

SELECT * FROM tabela1
UNION
SELECT * FROM tabela2;
ORDER BY name; -- Junta os dados das 2 tabelas e ordena pelo nome

-- COMANDOS AVANCADOS SQL

SHOW ALL -- Ver todos os params
SHOW TIMEZONE -- Ver o timezone 
SELECT NOW() -- Ver hora e data atual
SELECT TIMEOFDAY() -- Ver dia da semana, mes, dia e hora atual
SELECT CURRENT_TIME -- Ver a hora atual
SELECT CURRENT_DATE -- Ver a data atual

SELECT EXTRACT(YEAR FROM payment_date) as payment_year
FROM payment; -- Mostra apenas o ano dos pagamentos

SELECT EXTRACT(MONTH FROM payment_date) as payment_month
FROM payment; -- Mostra apenas o mes dos pagamentos

SELECT AGE(payment_date) FROM payment; -- Mostra a idade dos pagamentos

-- Formata para a string informado
SELECT TO_CHAR(payment_date, 'dd/mm/yyyy');
SELECT TO_CHAR(payment_date, 'MONTH-yyyy'); 
SELECT TO_CHAR(payment_date, 'mon/dd/YYYY'); 

-- Operadores e funcoes matematicas (ver mais nas docs)

SELECT ROUND(rental_rate / replacement_cost, 2) * 100 AS percentage FROM film;

-- Operadores e funcoes para String (ver mais nas docs)

SELECT LENGTH(first_name) AS length_name FROM customer;
SELECT first_name || ' ' || last_name AS full_name FROM customer; --concatenar o nome e sobrenome
SELECT UPPER(first_name || ' ' || last_name) AS full_name FROM customer;
SELECT LOWER(first_name || ' ' || last_name) AS full_name FROM customer;

-- Pega primeira letra do nome, concatena com o segundo nome e com o '@gmail.com' em minusculo.
SELECT LOWER(LEFT(first_name, 1) || last_name) || '@gmail.com' AS customer_email FROM customer;

-- SubQuery -> usar o resultado de uma query para formar outra query

SELECT title, rental_rate FROM film
WHERE rental_rate > (SELECT AVG(rental_rate) FROM film); -- Mostra quais filmes tem a avaliacao maior que a media

SELECT student, grade FROM test_scores 
WHERE student IN 
(SELECT student FROM honor_roll_table) -- Outra tabela. mostra os alunos que tambem estao na tabela da subquery
-- *Obs: Se a sub-query retorna varios valores, usar o operador IN

SELECT title, film_id FROM film
WHERE film_id IN 
(SELECT inventory.film_id FROM rental
INNER JOIN inventory ON inventory.film_id = rental.inventory_id
WHERE return_date BETWEEN '2005-05-29' AND '2005-05-30')
ORDER BY film_id 
-- Subquery: Filtrar os filmes que estao entre as datas mencionadas. main query: selecionar o titulo e id dos filmes
-- que esta no resultado da subquery

SELECT first_name, last_name FROM customer AS c
WHERE EXISTS
(SELECT * FROM payment as p
WHERE p.customer_id = c.customer_id
AND amount > 11) -- Filtra nome e sobrenome do cliente que teve um pagamento maior que 11

-- SELF JOIN
-- Para fazer um self join precisa usar o alias AS para nao ficar ambiguo

SELECT emp.name, report.name AS rep
FROM employees AS emp
JOIN employees AS report ON
emp.emp_id = report.report_id -- Mostrar os nomes das pessoas que se reportam aos clientes

SELECT f1.title, f2.title, f1.length
FROM film as f1
INNER JOIN film AS f2 ON 
f1.film_id != f2.film_id
AND f1.length = f2.length -- Titulos diferentes que compartilha a mesma duracao de filme