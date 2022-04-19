Algoritmo "exercicios-problema-pares-consecutivos"

Var

x, soma, par, n1, n2, n3, n4, n5 : inteiro

Inicio

soma <- 0
n1 <- 0
n2 <- 0
n3 <- 0
n4 <- 0
n5 <- 0


escreva("Digite um numero inteiro: ")
leia(x)

// x = 2

enquanto x <> 0 faca
   par <- x % 2 //2
   se par = 0 entao
      n1 <- x + 2 //4
      n2 <- n1 + 2 //6
      n3 <- n2 + 2 //8
      n4 <- n3 + 2 //10
      soma <- x + n1 + n2 + n3 + n4
      escreval("SOMA = ", soma)
   senao    //11
      n1 <- x + 1 //12
      n2 <- n1 + 2 //14
      n3 <- n2 + 2 //16
      n4 <- n3 + 2 //18
      n5 <- n4 + 2 //20
      soma <- n1 + n2 + n3 + n4 + n5
      escreval("SOMA = ", soma)
   fimse
   
   escreva("Digite um numero inteiro: ")
   leia(x)

fimenquanto
   
Fimalgoritmo