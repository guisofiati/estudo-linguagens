Algoritmo "exercicios-problema-troco"

Var

precoUnitario, dinheiroRecebido, troco : real
quantidadeComprada : inteiro

Inicio

escreva("Preço unitário do produto: ")
leia(precoUnitario)
escreva("Quantidade comprada: ")
leia(quantidadeComprada)
escreva("Dinheiro recebido: ")
leia(dinheiroRecebido)

troco <- (precoUnitario * quantidadeComprada) - dinheiroRecebido

escreval
escreval("TROCO = ", Abs(troco):8:2)

Fimalgoritmo