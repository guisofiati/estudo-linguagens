hora = int(input("Digite uma hora: "))

if hora >= 0 and hora < 6:
    print("Boa madrugada!")
elif hora < 13:
    print("Bom dia!")
elif hora < 19:
    print("Boa tarde!")
elif hora < 24:
    print("Boa noite!")
else:
    print("Hora invalida. Digite uma hora de 0 a 23.")