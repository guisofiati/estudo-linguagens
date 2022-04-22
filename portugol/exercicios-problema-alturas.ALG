Algoritmo "exercicios-problema-alturas"

Var

n, i, contador : inteiro
alturaMedia, porcentagemMenores : real
nome : vetor [0..10] de caractere
idade : vetor [0..10] de inteiro
altura : vetor [0..10] de real

Inicio

escreva("Quantas pessoas serao digitadas? ")
leia(n)

para i de 0 ate n-1 faca
   escreval("Dados da", i+1, "a pessoa:")
   escreva("Nome: ")
   leia(nome[i])
   escreva("Idade: ")
   leia(idade[i])
   escreva("Altura: ")
   leia(altura[i])
fimpara

alturaMedia <- 0
porcentagemMenores <- 0
contador <- 0

escreval

para i de 0 ate n-1 faca
   alturaMedia <- alturaMedia + altura[i]
   
   se idade[i] < 16 entao
      contador <- contador + 1
   fimse
fimpara

alturaMedia <- alturaMedia / n

escreval("ALTURA MEDIA: ", alturaMedia:1:2)

porcentagemMenores <- 100 * contador / n

escreval("PESSOAS COM MENOS DE 16 ANOS: ", porcentagemMenores:3:1, "%")
   
para i de 0 ate n-1 faca
   se idade[i] < 16 entao
      escreval(nome[i])
   fimse
fimpara

Fimalgoritmo