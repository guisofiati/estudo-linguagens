Algoritmo "estrutura-repetitiva-repita-ate"

Var

f, c : real
resposta : caractere

Inicio

repita
   escreva("Digite a temperatura em Celsius: ")
   leia(c)

   f <- 9.0 * c / 5.0 + 32.0

   escreval("Equivalente em Fahrenheit: ", f:3:1)
   escreva("Deseja repetir? [S] ou [N]: ")
   leia(resposta)
ate resposta <> "s"

// com a estrutura de controle enquanto ficaria repetindo 2 vezes o mesmo fonte
//
// resposta <- "s"
//
//enquanto resposta = "s" faca
   //escreva("Digite a temperatura em Celsius: ")
   //leia(c)

   //f <- 9.0 * c / 5.0 + 32.0

   //escreval("Equivalente em Fahrenheit: ", f:3:1)
   //escreva("Deseja repetir? [S] ou [N]: ")
   //leia(resposta)
//fimenquanto

Fimalgoritmo