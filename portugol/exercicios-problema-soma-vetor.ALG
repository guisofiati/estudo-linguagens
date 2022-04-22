Algoritmo "exercicios-problema-soma-vetor"

Var

n, i : inteiro
media, soma : real
vet : vetor [0..10] de real

Inicio

escreva("Quantos numeros voce vai digitar? ")
leia(n)

para i de 0 ate n-1 faca
   escreva("Digite um numero: ")
   leia(vet[i])
fimpara

soma <- 0
media <- 0

escreval
escreva("VALORES = ")

para i de 0 ate n-1 faca
   escreva(vet[i]:4:2, " ")
   
   soma <- soma + vet[i]
fimpara

  media <- soma / n

escreval
escreval("SOMA = ", soma:4:2)
escreval("MEDIA = ", media:4:2)

Fimalgoritmo