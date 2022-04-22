Algoritmo "exercicios-problema-maior-posicao"

Var

n, i : inteiro
vet : vetor [0..9] de real
maior : real

Inicio

escreva("Quantos numeros voce vai digitar? ")
leia(n)

para i de 0 ate n-1 faca
   escreva("Digite um numero: ")
   leia(vet[i])
fimpara

maior <- 0
para i de 0 ate n-1 faca
   se vet[i] > maior entao
      maior <- vet[i]
   senao
      maior <- maior
   fimse
fimpara

escreval
escreval("MAIOR VALOR = ", maior:5:1)

para i de 0 ate n-1 faca
   se vet[i] = maior entao
      escreval("POSICAO DO MAIOR VALOR = ", i)
   fimse
fimpara

Fimalgoritmo