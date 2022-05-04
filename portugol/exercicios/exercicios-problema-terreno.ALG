Algoritmo "exercicios-problema-terreno"

Var

larguraTerreno, comprimentoTerreno, valorMetroQuadrado, areaTerreno, precoTerreno : real

Inicio

escreva("Digite a largura do terreno: ")
leia(larguraTerreno)
escreva("Digite o comprimento do terreno: ")
leia(comprimentoTerreno)
escreva("Digite o valor do metro quadrado do terreno: ")
leia(valorMetroQuadrado)

areaTerreno <- larguraTerreno * comprimentoTerreno

precoTerreno <- areaTerreno * valorMetroQuadrado

escreval
escreval("AREA DO TERRENO = ", areaTerreno:8:2)
escreval("PREÇO DO TERRENO = ", precoTerreno:8:2)

Fimalgoritmo