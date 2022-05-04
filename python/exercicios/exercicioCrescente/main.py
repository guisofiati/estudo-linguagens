print("Digite dois numeros: ")
x = int(input())
y = int(input())

while x != y:

    if x > y:
        print("DECRESCENTE!")
    else:
        print("CRESCENTE!")

    print("Digite outros dois numeros:")
    x = int(input())
    y = int(input())