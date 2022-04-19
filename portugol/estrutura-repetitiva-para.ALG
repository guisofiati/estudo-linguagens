Algoritmo "estrutura-repetitiva-para"

Var

i, qnt, num, soma : inteiro

Inicio

escreva("Quanto numeros serao digitados? ")
leia(qnt)

soma <- 0

para i de 1 ate qnt faca
   escreva("Digite um numero: ")
   leia(num)
   soma <- soma + num
fimpara

escreval("SOMA = ", soma)

Fimalgoritmo