x = int(input("Digite o primeiro numero: "))

soma = 0

while x != 0:
    soma = soma + x
    x = int(input("Digite outro numero: "))

print(f"SOMA = {soma}")