lista1 = ""
lista2 = ""

for i in range (1, 7):
    i = str(i)
    lista1 = lista1 + i + " "
    print(lista1)

for i in range(6,1,-1):
    for j in range(1,i):
        print(i-1,end=' ')
    print("")