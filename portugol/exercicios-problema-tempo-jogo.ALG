Algoritmo "exercicios-problema-tempo-jogo"

Var

horaInicial, horaFinal, duracao : inteiro

Inicio

escreva("Hora inicial: ")
leia(horaInicial)
escreva("Hora final: ")
leia(horaFinal)

escreval

se horaInicial < horaFinal entao
   duracao <- horaFinal - horaInicial
senao
    duracao <- 24 - horaInicial + horaFinal
fimse

escreval("O JOGO DUROU: ", duracao, " HORA(S)")

Fimalgoritmo