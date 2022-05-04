Algoritmo "exercicios-problema-par-impar"

Var

n, i, num : inteiro

Inicio

escreva("Quantos numeros voce vai digitar? ")
leia(n)

para i de 1 ate n faca
   escreva("Digite um numero: ")
   leia(num)
   
   se num = 0 entao
      escreval("NULO")
   senao
      se num % 2 = 0 entao
         se num > 0 entao
            escreval("PAR POSITIVO")
         senao
            escreval("PAR NEGATIVO")
         fimse
      senao
           se num > 0 entao
              escreval("IMPAR POSITIVO")
           senao
              escreval("IMPAR NEGATIVO")
           fimse
        fimse
      fimse
fimpara

Fimalgoritmo