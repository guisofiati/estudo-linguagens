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