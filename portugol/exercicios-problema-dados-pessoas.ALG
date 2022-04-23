Algoritmo "exercicios-problema-dados-pessoas"

Var

n, i, contadorMasculino, contadorFeminino : inteiro
mediaAlturaMulheres, menorAltura, maiorAltura, somaAlturasFemininas : real
altura : vetor [0..9] de real
genero : vetor [0..9] de caractere

Inicio

escreva("Quantas pessoas serao digitadas? ")
leia(n)

para i de 0 ate n-1 faca
   escreva("Altura da", i+1, "a pessoa: ")
   leia(altura[i])
   escreva("Genero da", i+1, "a pessoa: ")
   leia(genero[i])
fimpara

menorAltura <- altura[0]
maiorAltura <- altura[0]
somaAlturasFemininas <- altura[0]

para i de 1 ate n-1 faca
   se altura[i] < menorAltura entao
       menorAltura <- altura[i]
   fimse
   
   se altura[i] > maiorAltura entao
      maiorAltura <- altura[i]
   fimse
fimpara

somaAlturasFemininas <- 0
contadorFeminino <- 0
para i de 0 ate n-1 faca
   se genero[i] = "F" entao
      somaAlturasFemininas <- somaAlturasFemininas + altura[i]
      contadorFeminino <- contadorFeminino + 1
   fimse
fimpara

contadorMasculino <- n - contadorFeminino

se contadorFeminino = 0 entao
   escreval("Impossivel calcular a altura media das mulheres")
senao
   mediaAlturaMulheres <- somaAlturasFemininas / contadorFeminino
fimse

escreval
escreval("MENOR ALTURA = ", menorAltura:1:2)
escreval("MAIOR ALTURA = ", maiorAltura:1:2)
escreval("MEDIA DAS ALTURAS DAS MULHRES = ", mediaAlturaMulheres:1:2)
escreval("NUMERO DE HOMENS = ", contadorMasculino)

Fimalgoritmo