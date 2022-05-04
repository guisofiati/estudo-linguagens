print("Digite dois numeros:")
x = int(input())
y = int(input())

if x > y:
    temp = x
    x = y
    y = temp

soma = 0

for i in range(x+1, y):
    if i % 2 != 0:
        soma = soma + i

print("SOMA DOS IMPARES =", soma)