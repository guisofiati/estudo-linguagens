Algoritmo "exercicios-problema-pagamento"

Var

nome : caractere
valorPorHora, pagamento : real
horasTrabalhadas : inteiro

Inicio

escreva("Nome: ")
leia(nome)
escreva("Valor por hora: ")
leia(valorPorHora)
escreva("Horas trabalhadas: ")
leia(horasTrabalhadas)

pagamento <- valorPorHora * horasTrabalhadas

escreval
escreval("O pagamento para ", nome, " deve ser ", pagamento:8:2)

Fimalgoritmo