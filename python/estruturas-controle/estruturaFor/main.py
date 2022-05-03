N = int(input("Quantos numeros serao digitados? "))

soma = 0

for i in range(0, N):
    X = int(input("Digite um numero: "))
    soma = soma + X

print("SOMA = ", soma)