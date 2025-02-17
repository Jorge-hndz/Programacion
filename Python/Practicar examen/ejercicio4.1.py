def funcion(num):
    total = 1
    for i in range(1, num + 1):
        total = total * i
    print(f"El factorial de {num} es {total}")

num = int(input("Introduce un numero y te mostrare su factorial: "))
funcion(num)