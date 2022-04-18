Algoritmo "estrutura-condicional-escolha"

Var

numero : inteiro
dia : caractere

Inicio

escreva("Digite um numero de 1 a 7: ")
leia(numero)

escolha numero
caso 1
     dia <- "Segunda-Feira"
caso 2
     dia <- "Terca-Feira"
caso 3
     dia <- "Quarta-Feira"
caso 4
     dia <- "Quinta-Feira"
caso 5
     dia <- "Sexta-Feira"
caso 6
     dia <- "Sabado"
caso 7
     dia <- "Domingo"
outrocaso
     escreval("Valor invalido. Digite um numero de 1 a 7")
fimescolha

escreval("DIA DA SEMANA = ", dia)

Fimalgoritmo