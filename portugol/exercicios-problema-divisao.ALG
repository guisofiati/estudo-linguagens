Algoritmo "exercicios-problema-divisao"

Var

num, i, numerador, denominador : inteiro
divisao : real

Inicio

escreva("Quantos casos voce vai digitar? ")
leia(num)

para i de 1 ate num faca
   escreva("Entre com o numerador: ")
   leia(numerador)
   escreva("Entre com o denominador: ")
   leia(denominador)
   
   se denominador = 0 entao
      escreval("DIVISAO IMPOSSIVEL")
   senao
      divisao <- numerador / denominador
      escreval("DIVISAO = ", divisao:4:2)
   fimse
fimpara

Fimalgoritmo