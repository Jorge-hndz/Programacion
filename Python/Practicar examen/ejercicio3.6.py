num = int(input("Introduce un numero y te dare el producto del 1 hasta el introducido: "))
total = 1

for i in range(1, num + 1):
    total = total * i
print("El producto es:", total)