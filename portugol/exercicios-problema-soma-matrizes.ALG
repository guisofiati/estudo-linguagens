Algoritmo "exercicios-problema-soma-matrizes"

Var

m, n, i, j : inteiro
matrizA : vetor [0..9, 0..9] de inteiro
matrizB : vetor [0..9, 0..9] de inteiro
matrizC : vetor [0..9, 0..9] de inteiro

Inicio

escreva("Quantas linhas vai ter cada matriz? ")
leia(m)
escreva("Quantas colunas vai ter cada matriz? ")
leia(n)

escreval("Digite os elementos da matriz A:")
para i de 0 ate m-1 faca
   para j de 0 ate n-1 faca
      escreva("Elemento [", i, ",", j, "]: ")
      leia(matrizA[i,j])
   fimpara
fimpara

escreval("Digite os elementos da matriz B:")
para i de 0 ate m-1 faca
   para j de 0 ate n-1 faca
      escreva("Elemento [", i, ",", j, "]: ")
      leia(matrizB[i,j])
   fimpara
fimpara

para i de 0 ate m-1 faca
   para j de 0 ate n-1 faca
      matrizC[i,j] <- matrizA[i,j] + matrizB[i,j]
   fimpara
fimpara

escreval
escreval("MATRIZ SOMA:")
para i de 0 ate m-1 faca
   para j de 0 ate n-1 faca
      escreva(matrizC[i,j], " ")
   fimpara
   escreval
fimpara

Fimalgoritmo