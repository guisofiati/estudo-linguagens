Algoritmo "exercicios-problema-bhaskara"

Var

a, b, c, delta, x1, x2 : real

Inicio

escreva("Coeficiente A: ")
leia(a)
escreva("Coeficiente B: ")
leia(b)
escreva("Coeficiente C: ")
leia(c)

delta <- Exp(b, 2) - 4 * a * c

// Foi necessario fazer um else com as expressoes por conta de bug do visualg

se (delta < 0.0) ou (a = 0) entao
   escreval
   escreval("Esta equacao nao possui raizes reais.")
senao

     x1 <- (- b + RaizQ(delta)) / (2.0 * a)

     x2 <- (- b - RaizQ(delta)) / (2.0 * a)
     
     escreval
     escreval("X1 = ", x1:8:4)
     escreval("X2 = ", x2:8:4)
fimse

Fimalgoritmo