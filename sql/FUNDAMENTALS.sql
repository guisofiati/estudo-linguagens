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