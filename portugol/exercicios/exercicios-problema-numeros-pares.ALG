Algoritmo "exercicios-problema-numeros-pares"

Var

n, i, contador : inteiro
vet : vetor [0..9] de inteiro

Inicio

escreva("Quantos numeros voce vai digitar? ")
leia(n)

para i de 0 ate n-1 faca
   escreva("Digite um numero: ")
   leia(vet[i])
fimpara

escreval
escreva("NUMEROS PARES:")

contador <- 0
para i de 0 ate n-1 faca
   se vet[i] % 2 = 0 entao
      escreva(vet[i], " ")
      contador <- contador + 1
   fimse
fimpara

escreval
escreval("QUANTIDADE DE PARES:", contador)

Fimalgoritmo