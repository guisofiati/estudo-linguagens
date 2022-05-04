print("Dados da primeira pessoa:")
nome1 = input("Nome: ")
idade1 = int(input("Idade: "))
print("Dados da segunda pessoa:")
nome2 = input("Nome: ")
idade2 = int(input("Idade: "))

media = (idade1 + idade2) / 2.0

print()
print(f"A idade media de {nome1} e {nome2} e de {media:.1f} anos")