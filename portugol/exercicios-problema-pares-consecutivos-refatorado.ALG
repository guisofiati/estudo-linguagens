Algoritmo "exercicios-problema-pares-consecutivos-refatorado"

Var

x, soma : inteiro

Inicio

escreva("Digite um numero inteiro: ")
leia(x)

enquanto x <> 0 faca

   se x % 2 <> 0 entao
      x <- x + 1
   fimse

// soma <- x + x + 2 + x + 4 + x + 6 + x + 8  (somando x 5 vezes e soma dos numeros = 20
   soma <- 5 * x + 20

   escreval("SOMA = ", soma)
   
   escreva("Digite um numero inteiro: ")
   leia(x)

fimenquanto

Fimalgoritmo