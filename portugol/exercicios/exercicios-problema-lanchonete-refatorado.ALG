Algoritmo "exercicios-problema-lanchonete-refatorado"

Var

codigo, quantidade : inteiro
valorPagar : real

Inicio

escreva("Codigo do produto comprado: ")
leia(codigo)
escreva("Quantidade comprada: ")
leia(quantidade)

escolha codigo
caso 1
     valorPagar <- 5.00 * quantidade
caso 2
     valorPagar <- 3.50 * quantidade
caso 3
     valorPagar <- 4.80 * quantidade
caso 4
     valorPagar <- 8.90 * quantidade
caso 5
     valorPagar <- 7.32 * quantidade
outrocaso
     escreval("Valor invalido. Digite um codigo de 1 a 5")
fimescolha

escreval("VALOR A PAGAR: R$ ", valorPagar:5:2)

Fimalgoritmo