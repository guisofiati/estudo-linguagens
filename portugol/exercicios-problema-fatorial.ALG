Algoritmo "exercicios-problema-fatorial"

Var

n, i, fatorial : inteiro

Inicio

escreva("Digite o valor de N: ")
leia(n)

fatorial <- 1

enquanto n > 15 faca
   escreva("Valor invalido. Digite um numero de 1 a 15: ")
   leia(n)
fimenquanto

para i de n ate 1 passo -1 faca
   fatorial <- fatorial * i
fimpara

escreval("FATORIAL = ", fatorial)

Fimalgoritmo