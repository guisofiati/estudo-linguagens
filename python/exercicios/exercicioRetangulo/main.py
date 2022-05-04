import math

base = float(input("Base do retangulo: "))
altura = float(input("Altura do retangulo: "))

area = base * altura
perimetro = 2 * (base + altura)
diagonal = math.sqrt(base**2 + altura**2)

print()
print(f"AREA = {area:.4f}")
print(f"PERIMETRO = {perimetro:.4f}")
print(f"DIAGONAL = {diagonal:.4f}")