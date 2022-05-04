n1 = int(input("Primeiro numero: "))
n2 = int(input("Segundo numero: "))
n3 = int(input("Terceiro numero: "))

if n1 <= n2 and n1 <= n3:
    menor = n1
elif n2 <= n3:
    menor = n2
else:
    menor = n3

print("MENOR = ", menor)