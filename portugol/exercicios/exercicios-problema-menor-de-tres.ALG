Algoritmo "exercicios-problema-menor-de-tres"

Var

n1, n2, n3, menor : inteiro

Inicio

escreva("Primeiro valor: ")
leia(n1)
escreva("Segundo valor: ")
leia(n2)
escreva("Terceiro valor: ")
leia(n3)

escreval

se (n1 <= n2) e (n1 <= n3) entao
   menor <- n1
   escreval("MENOR = ", menor)
senao
     se n2 <= n3 entao
        menor <- n2
        escreval("MENOR = ", menor)
     senao
          menor <- n3
          escreval("MENOR = ", menor)
     fimse
fimse

Fimalgoritmo