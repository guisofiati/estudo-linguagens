Algoritmo "exercicios-problema-dardo"

Var

distancia1, distancia2, distancia3 : real

Inicio

escreval("Digite as tres distancias:")
leia(distancia1)
leia(distancia2)
leia(distancia3)

escreval

se (distancia1 > distancia2) e (distancia1 > distancia3) entao
   escreval("MAIOR DISTANCIA = ", distancia1:3:2)
senao
     se (distancia2 > distancia1) e (distancia2 > distancia3) entao
        escreval("MAIOR DISTANCIA = ", distancia2:3:2)
     senao
          escreval("MAIOR DISTANCIA = ", distancia3:3:2)
     fimse
fimse

Fimalgoritmo