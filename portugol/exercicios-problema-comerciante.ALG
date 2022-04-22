Algoritmo "exercicios-problema-comerciante"

Var

n, i, contadorMenorDez, contadorEntreDezVinte, contadorAcimaVinte : inteiro
nome : vetor [0..9] de caractere
valorTotalCompra, valorTotalVenda, lucroTotal : real
precoCompra : vetor [0..9] de real
precoVenda : vetor [0..9] de real
percentualLucro : vetor [0..9] de real

Inicio

escreva("Serao digitados dados de quantos produtos? ")
leia(n)

para i de 0 ate n-1 faca
   escreval("PRODUTO", i+1)
   escreva("Nome: ")
   leia(nome[i])
   escreva("Preco de compra: ")
   leia(precoCompra[i])
   escreva("Preco de venda: ")
   leia(precoVenda[i])
fimpara

para i de 0 ate n-1 faca
   percentualLucro[i] <- (precoVenda[i] - precoCompra[i]) * 100 / precoCompra[i]
fimpara

contadorMenorDez <- 0
contadorEntreDezVinte <- 0
contadorAcimaVinte <- 0
para i de 0 ate n-1 faca
   se percentualLucro[i] < 10.0 entao
      contadorMenorDez <- contadorMenorDez + 1
   senao
        se (percentualLucro[i] >= 10.0) e (percentualLucro[i] <= 20.0) entao
           contadorEntreDezVinte <- contadorEntreDezVinte + 1
        senao
            contadorAcimaVinte <- contadorAcimaVinte + 1
        fimse
   fimse
fimpara

valorTotalCompra <- 0
valorTotalVenda <- 0

para i de 0 ate n-1 faca
   valorTotalCompra <- valorTotalCompra + precoCompra[i]
   valorTotalVenda <- valorTotalVenda + precoVenda[i]
fimpara

lucroTotal <- valorTotalVenda - valorTotalCompra

escreval
escreval("RELATORIO")
escreval("LUCRO ABAIXO DE 10% = ", contadorMenorDez)
escreval("LUCRO ENTRE 10% E 20% = ", contadorEntreDezVinte)
escreval("LUCRO ACIMA DE 20% = ", contadorAcimaVinte)
escreval("VALOR TOTAL DE COMPRA = ", valorTotalCompra:5:2)
escreval("VALOR TOTAL DE VENDA = ", valorTotalVenda:5:2)
escreval("LUCRO TOTAL = ", lucroTotal:3:2)

Fimalgoritmo