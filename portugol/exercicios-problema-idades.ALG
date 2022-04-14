Algoritmo "exercicios-problema-idades"

Var

nome1, nome2 : caractere
idade1, idade2 : inteiro
idadeMedia : real

Inicio

escreval("DADOS DA PRIMEIRA PESSOA:")
escreva("Nome: ")
leia(nome1)
escreva("Idade: ")
leia(idade1)
escreval
escreval("DADOS DA SEGUNDA PESSOA:")
escreva("Nome: ")
leia(nome2)
escreva("Idade: ")
leia(idade2)

idadeMedia <- (idade1 + idade2) / 2.0

escreval
escreval("A idade média de ", nome1, " e ", nome2, " é de ", idadeMedia:2:1, " anos")

Fimalgoritmo