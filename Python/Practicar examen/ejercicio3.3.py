num = int(input("Introduce un numero: "))
suma_pares = 0
suma_impares = 0


print(f"Los pares hasta {num}:")
for i in range (0, num + 1, 2):
    print(i)
    suma_pares = suma_pares + i
print(f"El total de la suma de todos los pares es {suma_pares}")
print("-----------------------------------------------------")
print(f"Los impares hasta {num}:")
for i in range (1, num + 1, 2):
    print(i)
    suma_impares = suma_impares + i
print(f"El total de la suma de todos los impares es {suma_impares}")