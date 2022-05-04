Algoritmo "exercicios-problema-aprovados"

Var

n, i : inteiro
aluno : vetor [0..9] de caractere
nota1 : vetor [0..9] de real
nota2 : vetor [0..9] de real
mediaAluno : vetor [0..9] de real

Inicio

escreva("Quantos alunos serao digitados? ")
leia(n)

para i de 0 ate n-1 faca
   escreval("Digite nome, primeira e segunda nota do(a)", i+1, "o(a) aluno(a):")
   leia(aluno[i])
   leia(nota1[i])
   leia(nota2[i])
   mediaAluno[i] <- (nota1[i] + nota2[i]) / 2.0
fimpara

escreval
escreval("ALUNOS APROVADOS:")

para i de 0 ate n-1 faca
   se mediaAluno[i] >= 6.0 entao
      escreval(aluno[i])
   fimse
fimpara

Fimalgoritmo