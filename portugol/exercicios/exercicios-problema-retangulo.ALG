Algoritmo "exercicios-problema-retangulo"

Var

baseRetangulo, alturaRetangulo, area, perimetro, diagonal : real

Inicio

escreva("Base do retangulo: ")
leia(baseRetangulo)
escreva("Altura do retangulo: ")
leia(alturaRetangulo)

area <- baseRetangulo * alturaRetangulo
perimetro <- 2 * (baseRetangulo + alturaRetangulo)
diagonal <- RaizQ(Exp(baseRetangulo, 2) + Exp(alturaRetangulo, 2))

escreval
escreval("AREA = ", area:8:4)
escreval("PERIMETRO = ", perimetro:8:4)
escreval("DIAGONAL = ", diagonal:8:4)

Fimalgoritmo