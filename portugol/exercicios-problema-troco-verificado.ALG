Algoritmo "exercicios-problema-troco-verificado"

Var

quantidadeComprada : inteiro
precoUnitario, dinheiroRecebido, dinheiroFaltante, valorTotal, troco : real

Inicio

escreva("Preco unitario do produto: ")
leia(precoUnitario)
escreva("Quantidade comprada: ")
leia(quantidadeComprada)
escreva("Dinheiro recebido: ")
leia(dinheiroRecebido)

escreval

valorTotal <- precoUnitario * quantidadeComprada

se dinheiroRecebido < valorTotal entao
   dinheiroFaltante <- valorTotal - dinheiroRecebido
   escreval("DINHEIRO INSUFICIENTE. FALTAM R$ ", dinheiroFaltante:3:2)
senao
   troco <- dinheiroRecebido - valorTotal
   escreval("TROCO R$ ", troco:3:2)
fimse

Fimalgoritmo