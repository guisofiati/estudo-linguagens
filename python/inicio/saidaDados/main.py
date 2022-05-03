name = "Maria Silva"
age = 32

print("%s tem %d anos" % (name, age))
print(f"{name} tem {age} anos")
print("{:s} tem {:d} anos".format(name, age))

print('**********')

print("Bom dia", end='')
print('Boa noite', end="")

print()
print('**********')

print("Bom dia")
print("Boa noite")

print('**********')

x = 10
y = 20

print(x)
print(y)

print('**********')

z = 2.3456

# print(z)
print("{:.2f}".format(z))

print('**********')

idade: int
salario: float
nome: str
sexo: str

idade = 32
salario = 4550.0
nome = "Pedro Melo"
sexo = 'M'

print("O funcionario %s, sexo %s, ganha %.2f e tem %d anos" % (nome, sexo, salario, idade))
print("O funcionario {:s}, sexo {:s}, ganha {:.2f} e tem {:d} anos".format(nome, sexo, salario, idade))
print(f"O funcionario {nome}, sexo {sexo}, ganha {salario:.2f} e tem {idade} anos")