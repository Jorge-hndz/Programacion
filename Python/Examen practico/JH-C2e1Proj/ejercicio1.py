lista=[]
i = 0

num = int(input("Introduce cuantos elementos va a tener tu lista: "))
for i in range(1, num + 1):
    elemento = input("Introduce los elementos: ")
    lista.append(elemento)
print(lista[::-1])
