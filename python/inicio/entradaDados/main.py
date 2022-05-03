nome1 = input("Nome da primeira pessoa: ")
salario1 = float(input("Salario da primeira pessoa: "))

nome2 = input("Nome da segunda pessoa: ")
salario2 = float(input("Salario da segunda pessoa: "))

idade = int(input("Digite uma idade: "))
sexo = input("Digite um sexo [M/F]: ")

print()
print(f"Nome 1: {nome1}")
print(f"Salario 1: {salario1:.2f}")
print("Nome 2: {:s}".format(nome2))
print("Salario 2: {:.2f}".format(salario2))
print("Idade: %d" % idade)
print("Sexo: %s" % sexo)