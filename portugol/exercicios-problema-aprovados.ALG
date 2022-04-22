Algoritmo "exercicios-problema-aprovados"

Var

n, i : inteiro
media, soma : real
aluno : vetor [0..9] de caractere
semestre1 : vetor [0..9] de real
semestre2 : vetor [0..9] de real
mediaAluno : vetor [0..9] de real

Inicio

escreva("Quantos alunos serao digitados? ")
leia(n)

para i de 0 ate n-1 faca
   escreval("Digite nome, primeira e segunda nota do(a)", i+1, "o(a) aluno(a):")
   leia(aluno[i])
   leia(semestre1[i])
   leia(semestre2[i])
   soma <- semestre1[i] + semestre2[i]
   media <- soma / 2.0
   mediaAluno[i] <- media
fimpara

escreval
escreval("ALUNOS APROVADOS:")

para i de 0 ate n-1 faca
   se mediaAluno[i] >= 6.0 entao
      escreval(aluno[i])
   fimse
fimpara

Fimalgoritmo