num = int(input("Introduce un numero y te dare el resultado del producto hasta el numero introducido: "))

producto = 1
for i in range(1,num + 1):
    producto = producto * i
print(producto)