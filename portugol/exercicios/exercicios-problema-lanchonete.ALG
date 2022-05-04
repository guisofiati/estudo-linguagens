Algoritmo "exercicios-problema-lanchonete"

Var

cod1, cod2, cod3, cod4, cod5, codEscolhido, valorPagar : real
quantidadeComprada : inteiro

Inicio

cod1 <- 5.00
cod2 <- 3.50
cod3 <- 4.80
cod4 <- 8.90
cod5 <- 7.32

escreva("Codigo do produto comprado [1, 2, 3, 4 ou 5]: ")
leia(codEscolhido)
escreva("Quantidade comprada: ")
leia(quantidadeComprada)

escreval

se codEscolhido = 1 entao
   valorPagar <- cod1 * quantidadeComprada
   escreval("VALOR A PAGAR: R$ ", valorPagar:4:2)
senao
     se codEscolhido = 2 entao
        valorPagar <- cod2 * quantidadeComprada
        escreval("VALOR A PAGAR: R$ ", valorPagar:4:2)
     senao
          se codEscolhido = 3 entao
             valorPagar <- cod3 * quantidadeComprada
             escreval("VALOR A PAGAR: R$ ", valorPagar:4:2)
          senao
               se codEscolhido = 4 entao
                  valorPagar <- cod4 * quantidadeComprada
                  escreval("VALOR A PAGAR: R$ ", valorPagar:4:2)
               senao
                    se codEscolhido = 5 entao
                       valorPagar <- cod5 * quantidadeComprada
                       escreval("VALOR A PAGAR: R$ ", valorPagar:4:2)
                    senao
                         escreval("Codigo invalido. Digite um codigo de 1 a 5")
                    fimse
               fimse
          fimse
     fimse
fimse

Fimalgoritmo