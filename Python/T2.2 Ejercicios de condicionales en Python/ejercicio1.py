print("Introduce 2 numeros y te dire cual de los dos es el mayor: ")
num1 = input()
num2 = input()

if num1 == num2:
    print("Los numeros son iguales")
else:
    if num1 > num2:
        print("El numero mayor es:", num1)
    else:
        print("El numero mayor es:", num2)
