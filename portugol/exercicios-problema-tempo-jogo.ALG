Algoritmo "exercicios-problema-tempo-jogo"

Var

horaInicial, horaFinal, duracao : inteiro

Inicio

escreva("Hora inicial: ")
leia(horaInicial)
escreva("Hora final: ")
leia(horaFinal)

escreval

se horaInicial > horaFinal entao
   duracao <- 24 - horaInicial + horaFinal
   escreval("O JOGO DUROU ", duracao:2, " HORA(S)")
senao
     se horaFinal > horaInicial entao
        duracao <- horaFinal - horaInicial
        escreval("O JOGO DUROU ", duracao:2, " HORA(S)")
     senao
          se horaFinal = horaInicial entao
             escreval("O JOGO DUROU 24 HORA(S)")
          fimse
     fimse
fimse

Fimalgoritmo