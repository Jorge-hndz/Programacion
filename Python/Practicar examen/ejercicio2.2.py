num1 = float(input("Introduce un primer numero: "))
num2 = float(input("Introduce un segundo numero: "))
num3 = float(input("Introduce un tercero numero: "))

if num1 == num2 == num3:
    print("Los tres numeros son iguales")
elif num1 == num2:
    print("El primero numero y el segundo son iguales ")
elif num1 == num3:
    print("El primero numero y el tercero son iguales ")
elif num3 == num2:
    print("El segundo numero y el tercero son iguales ")
elif num1 > num2 and num1 > num3:
    print(f"El numero {num1} es el mayor")
elif num2 > num1 and num2 > num3:
    print(f"El numero {num2} es el mayor")
elif num3 > num1 and num3 > num2:
    print(f"El numero {num3} es el mayor")
