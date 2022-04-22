Algoritmo "exercicios-problema-soma-vetores"

Var

n, i : inteiro
vetorA : vetor [0..9] de inteiro
vetorB : vetor [0..9] de inteiro
vetorC : vetor [0..9] de inteiro

Inicio

escreva("Quantos valores vai ter cada vetor? ")
leia(n)

escreval("Digite os valores do vetor A:")
para i de 0 ate n-1 faca
   leia(vetorA[i])
fimpara

escreval("Digite os valores do vetor B:")
para i de 0 ate n-1 faca
   leia(vetorB[i])
fimpara

escreval
escreval("VETOR RESULTANTE:")


para i de 0 ate n-1 faca
   vetorC[i] <- vetorA[i] + vetorB[i]
   escreval(vetorC[i])
fimpara

Fimalgoritmo