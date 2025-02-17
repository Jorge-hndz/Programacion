num = float(input("Introduce un numero y te dire el numero de digitos que tiene: "))
contador = 1

while num > 1:
    num = num / 10
    contador = contador + 1

print(f"El numero de digitos es {contador}")