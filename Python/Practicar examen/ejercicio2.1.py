num1 = float(input("Introduce un primer numero: "))
num2 = float(input("Introduce un segundo numero: "))

if num1 > num2:
    print(f"El numero {num1} es el mayor")
elif num2 > num1:
    print(f"El numero {num2} es el mayor")
else:
    print("Ambos numeros son iguales tontito")