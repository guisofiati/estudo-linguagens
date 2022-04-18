Algoritmo "exercicios-problema-aumento"

Var

salario, novoSalario, aumento, porcentagemAumento: real

Inicio

escreva("Digite o salario da pessoa: ")
leia(salario)

escreval

se salario <= 1000.00 entao
   porcentagemAumento <- 20
senao
     se salario <= 3000.00 entao
        porcentagemAumento <- 15
     senao
          se salario <= 8000.00 entao
             porcentagemAumento <- 10
          senao
               porcentagemAumento <- 5
          fimse
     fimse
fimse

aumento <- salario * porcentagemAumento / 100
novoSalario <- salario + aumento

escreval("NOVO SALARIO: R$ ", novoSalario:5:2)
escreval("AUMENTO: R$ ", aumento:5:2)
escreval("PORCENTAGEM: ", porcentagemAumento, "%")

Fimalgoritmo