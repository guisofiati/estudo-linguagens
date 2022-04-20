Algoritmo "exercicios-problema-dentro-fora"

Var

n, i, num, dentro, fora : inteiro

Inicio

escreva("Quantos numeros voce vai digitar? ")
leia(n)

dentro <- 0
fora <- 0

para i de 1 ate n faca
   escreva("Digite um numero: ")
   leia(num)
   
   se (num >= 10) e (num <= 20) entao
      dentro <- dentro + 1
   senao
      fora <- fora + 1
   fimse
fimpara

escreval(dentro, " DENTRO")
escreval(fora, " FORA")

Fimalgoritmo