Algoritmo "exercicios-problema-matriz-geral"

Var

n, i, j, linhaEscolhida, colunaEscolhida : inteiro
mat : vetor [0..9, 0..9] de real
soma : real

Inicio

escreva("Qual a ordem da matriz? ")
leia(n)

para i de 0 ate n-1 faca
   para j de 0 ate n-1 faca
      escreva("Elemento [", i, ",", j, "]: ")
      leia(mat[i,j])
   fimpara
fimpara

soma <- 0.0
para i de 0 ate n-1 faca
   para j de 0 ate n-1 faca
      se mat[i,j] > 0 entao
         soma <- soma + mat[i,j]
      fimse
   fimpara
fimpara

escreval
escreval("SOMA DOS POSITIVOS: ", soma:5:1)

escreval
escreva("Escolha uma linha: ")
leia(linhaEscolhida)
escreva("LINHA ESCOLHIDA: ")

para i de 0 ate n-1 faca
   escreva(mat[linhaEscolhida, i]:3:1, " ")
fimpara

escreval
escreval
escreva("Escolha uma coluna: ")
leia(colunaEscolhida)
escreva("COLUNA ESCOLHIDA: ")

para j de 0 ate n-1 faca
   escreva(mat[j, colunaEscolhida]:3:1, " ")
fimpara

escreval
escreval
escreva("DIAGONAL PRINCIPAL: ")

para i de 0 ate n-1 faca
   escreva(mat[i,i]:3:1, " ")
fimpara

escreval
escreval
escreval("MATRIZ ALTERADA:")

para i de 0 ate n-1 faca
   para j de 0 ate n-1 faca
      se mat[i,j] < 0 entao
         mat[i,j] <- Exp(mat[i,j], 2)
      fimse
   fimpara
fimpara

para i de 0 ate n-1 faca
   para j de 0 ate n-1 faca
      escreva(mat[i,j]:3:1, " ")
   fimpara
   escreval
fimpara

Fimalgoritmo