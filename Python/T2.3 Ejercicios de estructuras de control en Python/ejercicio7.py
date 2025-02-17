num = int(input("Introduce un numero entero positivo y te dire el numero de digitos que tiene: "))

contador = 1

while num > 1:
        num = num // 10
        contador = contador + 1
print("El numero de digitos es:", contador)