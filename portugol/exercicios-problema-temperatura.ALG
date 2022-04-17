Algoritmo "exercicios-problema-temperatura"

Var

escalaTemperatura : caractere
celsius, fahrenheit : real

Inicio

escreva("Voce vai digitar a temperatura em qual escala (C/F)? ")
leia(escalaTemperatura)

se escalaTemperatura = "F" entao
   escreva("Digite a temperatura em Fahrenheit: ")
   leia(fahrenheit)
   
   celsius <- (fahrenheit - 32) * 5 / 9
   
   escreval("Temperatura equivalente em Celsius: ", celsius:3:2)
senao
     se escalaTemperatura = "C" entao
        escreva("Digite a temperatura em Celsius: ")
        leia(celsius)
        
        fahrenheit <- celsius * (9 / 5) + 32
        
        escreval("Temperatura equivalente em Fahrenheit: ", fahrenheit:3:2)
     senao
          se (escalaTemperatura <> "F") ou (escalaTemperatura <> "C") entao
             escreval("Temperatura invalida. Utilize: [C OU F]")
          fimse
     fimse
fimse

Fimalgoritmo