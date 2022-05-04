Algoritmo "matrizes"

Var

L, C, i, j : inteiro
mat : vetor [0..4, 0..4] de inteiro

Inicio

escreva("Quantas linhas vai ter a matriz? ")
leia(L)
escreva("Quantas colunas vai ter a matriz? ")
leia(C)

para i de 0 ate L-1 faca
   para j de 0 ate C-1 faca
      escreva("Elemento [", i, ",", j, "]: ")
      leia(mat[i,j])
   fimpara
fimpara

escreval
escreval("MATRIZ DIGITADA:")

para i de 0 ate L-1 faca
   para j de 0 ate C-1 faca
      escreva(mat[i,j], " ")
   fimpara
   escreval
fimpara

Fimalgoritmo