lista1 = ""
lista2 = ""

for i in range (1, 7):
    i = str(i)
    lista1 = lista1 + i + " "
    print(lista1)

for x in range(5, 0, -1):
    for j in range(5, 0, -1):
        x = str(x)
        lista2 = lista2 + x + " "
    print(lista2)
    lista2 = ""