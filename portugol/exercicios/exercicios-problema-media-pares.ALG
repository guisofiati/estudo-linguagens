Algoritmo "exercicios-problema-media-pares"

Var

n, i, contador : inteiro
media, soma : real
vet : vetor [0..9] de inteiro

Inicio

escreva("Quantos elementos vai ter o vetor? ")
leia(n)

para i de 0 ate n-1 faca
   escreva("Digite um numero: ")
   leia(vet[i])
fimpara

escreval

soma <- 0
contador <- 0

para i de 0 ate n-1 faca
   se vet[i] % 2 = 0 entao
      soma <- soma + vet[i]
      contador <- contador + 1
   fimse
fimpara

se contador = 0 entao
   escreval("NENHUM NUMERO PAR")
senao
   media <- soma / contador
   escreval("MEDIA DOS PARES = ", media:3:1)
fimse

Fimalgoritmo