Algoritmo "exercicios-problema-medidas"

Var

a, b, c, areaQuadrado, areaTriangulo, areaTrapezio : real

Inicio

escreva("Digite a medida A: ")
leia(a)
escreva("Digite a medida B: ")
leia(b)
escreva("Digite a medida C: ")
leia(c)

areaQuadrado <- Exp(a, 2)
areaTriangulo <- a * b / 2.0
areaTrapezio <- (a + b) * c / 2.0

escreval
escreval("AREA DO QUADRADO = ", areaQuadrado:8:4)
escreval("AREA DO TRIANGULO = ", areaTriangulo:8:4)
escreval("AREA DO TRAPEZIO = ", areaTrapezio:8:4)

Fimalgoritmo