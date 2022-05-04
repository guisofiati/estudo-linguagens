Algoritmo "exercicios-problema-negativo"

Var

n, i : inteiro
vet : vetor [0..9] de inteiro

Inicio

escreva("Quantos numeros voce vai digitar? ")
leia(n)

para i de 0 ate n-1 faca
   escreva("Digite um numero: ")
   leia(vet[i])
fimpara

escreval
escreval("NUMEROS NEGATIVOS:")

para i de 0 ate n-1 faca
   se vet[i] < 0 entao
      escreval(vet[i])
   fimse
fimpara

Fimalgoritmo