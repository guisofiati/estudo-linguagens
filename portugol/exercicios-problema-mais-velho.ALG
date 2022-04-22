Algoritmo "exercicios-problema-mais-velho"

Var

n, i, maiorIdade, posicao : inteiro
nome : vetor [0..9] de caractere
idade : vetor [0..9] de inteiro

Inicio

escreva("Quantas pessoas voce vai digitar? ")
leia(n)

para i de 0 ate n-1 faca
   escreval("Dados da", i+1, "a pessoa:")
   escreva("Nome: ")
   leia(nome[i])
   escreva("Idade: ")
   leia(idade[i])
fimpara

maiorIdade <- idade[0]
para i de 1 ate n-1 faca
   se idade[i] > maiorIdade entao
      maiorIdade <- idade[i]
      posicao <- i
   fimse
fimpara

escreval
escreval("PESSOA MAIS VELHA = ", nome[posicao])

Fimalgoritmo