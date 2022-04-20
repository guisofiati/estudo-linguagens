Algoritmo "exercicios-problema-media-ponderada"

Var

num, i : inteiro
n1, n2, n3, peso1, peso2, peso3, mediaPonderada : real

Inicio

peso1 <- 2.0
peso2 <- 3.0
peso3 <- 5.0

escreva("Quantos casos voce vai digitar? ")
leia(num)

para i de 1 ate num faca
   escreval("Digite tres numeros:")
   leia(n1)
   leia(n2)
   leia(n3)
   
   mediaPonderada <- ((n1 * peso1) + (n2 * peso2) + (n3 * peso3)) / (peso1 + peso2 + peso3)
   
   escreval("MEDIA = ", mediaPonderada:3:1)

fimpara

Fimalgoritmo