Algoritmo "estruturas-condicionais"

Var

hora : inteiro

Inicio

escreva("Digite a hora atual: ")
leia(hora)

se hora < 6 entao
   escreval("Boa madrugada!")
senao
     se hora < 12 entao
        escreval("Bom dia!")
     senao
          se hora < 18 entao
             escreval("Boa tarde!")
          senao
               se hora < 24 entao
                  escreval("Boa noite!")
               senao
                    escreval("Hora inexistente. Use numeros de 0 a 23.")
               fimse
          fimse
     fimse
fimse

Fimalgoritmo