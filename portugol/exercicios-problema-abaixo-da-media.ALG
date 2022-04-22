Algoritmo "exercicios-problema-abaixo-da-media"

Var

n, i : inteiro
media : real
vet : vetor [0..9] de real

Inicio

escreva("Quantos elementos vai ter o vetor? ")
leia(n)

para i de 0 ate n-1 faca
   escreva("Digite um numero: ")
   leia(vet[i])
fimpara

escreval
escreva("MEDIA DO VETOR: ")

media <- 0
para i de 0 ate n-1 faca
   media <- media + vet[i]
fimpara

media <- media / n
escreva(media:3:3)

escreval
escreval("ELEMENTOS ABAIXO DA MEDIA:")

para i de 0 ate n-1 faca
   se vet[i] < media entao
      escreval(vet[i]:3:1)
   fimse
fimpara

Fimalgoritmo