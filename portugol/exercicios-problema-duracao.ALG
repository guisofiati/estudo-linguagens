Algoritmo "exercicios-problema-duracao"

Var

duracao, resto, horas, minutos, segundos : inteiro

Inicio

// ex: duração: 12506
//
// resto:
// 12506 |_ 3600
// 10800    3
// -----
// 1703 -> resto
//
// minutos:
// 1706 |_ 60
// 120   28 -> minutos
// ----
// 0506
//  480
// ----
// 0026 -> resto

escreva("Digite a duração em SEGUNDOS: ")
leia(duracao)

resto <- duracao % 3600

horas <- duracao \ 3600
minutos <- resto \ 60
segundos <- resto % 60

escreval
escreval(horas, ":", minutos, ":", segundos)

Fimalgoritmo