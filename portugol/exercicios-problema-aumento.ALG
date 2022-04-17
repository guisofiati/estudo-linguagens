Algoritmo "exercicios-problema-aumento"

Var

salario, novoSalario, aumento, porcentagemAumento: real

Inicio

escreva("Digite o salario da pessoa: ")
leia(salario)

se salario <= 1000.00 entao
   porcentagemAumento <- 0.20
   aumento <- salario * porcentagemAumento
   novoSalario <- salario + aumento
   escreval("NOVO SALARIO: R$ ", novoSalario:5:2)
   escreval("AUMENTO: R$ ", aumento:5:2)
   escreval("PORCENTAGEM: 20%")
senao
     se salario <= 3000.00 entao
        porcentagemAumento <- 0.15
        aumento <- salario * porcentagemAumento
        novoSalario <- salario + aumento
        escreval("NOVO SALARIO: R$ ", novoSalario:5:2)
        escreval("AUMENTO: R$ ", aumento:5:2)
        escreval("PORCENTAGEM: 15%")
     senao
          se salario <= 8000.00 entao
             porcentagemAumento <- 0.10
             aumento <- salario * porcentagemAumento
             novoSalario <- salario + aumento
             escreval("NOVO SALARIO: R$ ", novoSalario:5:2)
             escreval("AUMENTO: R$ ", aumento:5:2)
             escreval("PORCENTAGEM: 10%")
          senao
               porcentagemAumento <- 0.5
               aumento <- salario * porcentagemAumento
               novoSalario <- salario + aumento
               escreval("NOVO SALARIO: R$ ", novoSalario:5:2)
               escreval("AUMENTO: R$ ", aumento:5:2)
               escreval("PORCENTAGEM: 5%")
          fimse
     fimse
fimse

Fimalgoritmo