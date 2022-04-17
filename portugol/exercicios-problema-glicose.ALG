Algoritmo "exercicios-problema-glicose"

Var

medidaGlicose : real

Inicio

escreva("Digite a medida da glicose: ")
leia(medidaGlicose)

se medidaGlicose <= 100 entao
   escreval("Classificacao: NORMAL")
senao
     se medidaGlicose <= 140 entao
        escreval("Classificacao: ELEVADO")
     senao
          escreval("Classificacao: DIABETES")
     fimse
fimse

Fimalgoritmo