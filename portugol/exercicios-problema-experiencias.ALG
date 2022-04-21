Algoritmo "exercicios-problema-experiencias"

Var

n, i, cobaiasUtilizadas, totalCobaias, totalRatos, totalCoelhos, totalSapos : inteiro
tipoCobaia : caractere
percentualCoelho, percentualRato, percentualSapo : real

Inicio

escreva("Quantos casos de teste serao digitados? ")
leia(n)

totalCobaias <- 0
totalRatos <- 0
totalCoelhos <- 0
totalSapos <- 0

para i de 1 ate n faca
   escreva("Quantidade de cobaias: ")
   leia(cobaiasUtilizadas)
   escreva("Tipo de cobaia: ")
   leia(tipoCobaia)
   
   escolha tipoCobaia
   caso "r"
        totalRatos <- totalRatos + cobaiasUtilizadas
   caso "c"
        totalCoelhos <- totalCoelhos + cobaiasUtilizadas
   caso "s"
        totalSapos <- totalSapos + cobaiasUtilizadas
   outrocaso
        escreval("Tipo invalido. Utilize [R, C ou S]")
   fimescolha
   
   totalCobaias <- totalCobaias + cobaiasUtilizadas
   
   percentualCoelho <- 100 * totalCoelhos / totalCobaias
   percentualRato <- 100 * totalRatos / totalCobaias
   percentualSapo <- 100 * totalSapos / totalCobaias
   
fimpara

escreval
escreval("RELATORIO FINAL:")
escreval("TOTAL = ", totalCobaias, " cobaias")
escreval("TOTAL DE COELHOS: ", totalCoelhos)
escreval("TOTAL DE RATOS: ", totalRatos)
escreval("TOTAL DE SAPOS: ", totalSapos)
escreval("PERCENTUAL DE COELHOS: ", percentualCoelho:3:2)
escreval("PERCENTUAL DE RATOS: ", percentualRato:3:2)
escreval("PERCENTUAL DE SAPOS: ", percentualSapo:3:2)

Fimalgoritmo