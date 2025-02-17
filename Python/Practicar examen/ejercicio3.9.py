num = 1
contador_pares = 0
contador_impares = 0


while num != 0:
    num = int(input("Introduce numeros(0 para parar):"))

    if num != 0:
        if num % 2 == 0:
            contador_pares = contador_pares + 1
        else:
            contador_impares = contador_impares + 1

print(f"El total de pares introducidos es {contador_pares}")
print(f"El total de impares introducidos es {contador_impares}")