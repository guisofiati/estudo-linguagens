Algoritmo "exercicios-problema-experiencias"

Var

n, i, cobaiasUtilizadas, totalCobaias, ratos, coelhos, sapos : inteiro
tipoCobaia : caractere
percentualCoelho, percentualRato, percentualSapo : real

Inicio

escreva("Quantos casos de teste serao digitados? ")
leia(n)

totalCobaias <- 0
ratos <- 0
coelhos <- 0
sapos <- 0

para i de 1 ate n faca
   escreva("Quantidade de cobaias: ")
   leia(cobaiasUtilizadas)
   escreva("Tipo de cobaia: ")
   leia(tipoCobaia)
   
   escolha tipoCobaia
   
   caso "r"
        ratos <- ratos + cobaiasUtilizadas
   caso "c"
        coelhos <- coelhos + cobaiasUtilizadas
   caso "s"
        sapos <- sapos + cobaiasUtilizadas
   outrocaso
        escreval("Tipo invalido. Utilize [R, C ou S]")
   fimescolha
   
   totalCobaias <- totalCobaias + cobaiasUtilizadas
   
   percentualCoelho <- 100 * coelhos / totalCobaias
   percentualRato <- 100 * ratos / totalCobaias
   percentualSapo <- 100 * sapos / totalCobaias
fimpara

escreval
escreval("RELATORIO FINAL:")
escreval("TOTAL = ", totalCobaias, " cobaias")
escreval("TOTAL DE COELHOS: ", coelhos)
escreval("TOTAL DE RATOS: ", ratos)
escreval("TOTAL DE SAPOS: ", sapos)
escreval("PERCENTUAL DE COELHOS: ", percentualCoelho:3:2)
escreval("PERCENTUAL DE RATOS: ", percentualRato:3:2)
escreval("PERCENTUAL DE SAPOS: ", percentualSapo:3:2)

Fimalgoritmo