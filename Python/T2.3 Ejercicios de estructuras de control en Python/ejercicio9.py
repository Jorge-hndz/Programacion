print("A continuacion vas a introducir una serie de numeros y te dire cuantos pares e impares has introducido(para finalizar introducir el 0, despues de cada introducir un numero pulsa intro):")

num = None
contador1 = 0
contador2 = 0

while num != 0:
    num = int(input("Introduce numeros aqui: "))

    if num == 0:
        None
    elif num % 2 == 0:
        contador1 = contador1 + 1
    elif num % 2 != 0:
        contador2 = contador2 + 1
    

print("El total de numeros pares es:", contador1)
print("El total de numeros impares es:", contador2)