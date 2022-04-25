Algoritmo "exercicios-problema-matriz-geral"

Var

n, i, j, linhaEscolhida, colunaEscolhida : inteiro
mat : vetor [0..9, 0..9] de real
matAlterada : vetor [0..9, 0..9] de real
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
escreva("SOMA DOS POSITIVOS: ", soma:5:1)

escreval
escreval
escreva("Escolha uma linha: ")
leia(linhaEscolhida)
escreva("LINHA ESCOLHIDA: ")

para i de linhaEscolhida ate linhaEscolhida faca
   para j de 0 ate n-1 faca
      escreva(mat[linhaEscolhida, j]:3:1, " ")
   fimpara
fimpara

escreval
escreval
escreva("Escolha uma coluna: ")
leia(colunaEscolhida)
escreva("COLUNA ESCOLHIDA: ")

para i de 0 ate n-1 faca
   para j de colunaEscolhida ate colunaEscolhida faca
      escreva(mat[i, colunaEscolhida]:3:1, " ")
   fimpara
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
      se mat[i,j] > 0 entao
         matAlterada[i,j] <- mat[i,j]
         escreva(matAlterada[i,j]:3:1, " ")
      senao
         matAlterada[i,j] <- Exp(mat[i,j], 2)
         escreva(matAlterada[i,j]:3:1, " ")
      fimse
   fimpara
   escreval
fimpara

Fimalgoritmo