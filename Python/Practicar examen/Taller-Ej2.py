num = int(input("Introduce el numero de secuencias Fibonacci que quieres que te muestre: "))
x = 1
j = 0
total = 1
for i in range(num):
    total = x + j
    x = j
    j = total
    print(total)
    