Algoritmo "exercicios-problema-operadora"

Var

minutosConsumidos, minutosAdicionais : inteiro
valorPagar : real

Inicio

escreva("Digite a quantidade de minutos consumidos: ")
leia(minutosConsumidos)

escreval

valorPagar <- 50.00

se minutosConsumidos > 100 entao
   minutosAdicionais <- minutosConsumidos - 100
   valorPagar <- valorPagar + minutosAdicionais * 2.0
   escreval("VALOR A PAGAR: R$ ", valorPagar:5:2)
senao
     escreval("VALOR A PAGAR: R$ ", valorPagar:5:2)
fimse

Fimalgoritmo