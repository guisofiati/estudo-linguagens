Algoritmo "exercicios-problema-menor-de-tres"

Var

n1, n2, n3 : inteiro

Inicio

escreva("Primeiro valor: ")
leia(n1)
escreva("Segundo valor: ")
leia(n2)
escreva("Terceiro valor: ")
leia(n3)

escreval

se (n1 <= n2) e (n1 <= n3) entao
   escreval("MENOR = ", n1)
senao
     se (n2 <= n1) e (n2 <= n3) entao
        escreval("MENOR = ", n2)
     senao
          se (n3 <= n1) e (n3 <= n2) entao
             escreval("MENOR = ", n3)
          fimse
     fimse
fimse

Fimalgoritmo