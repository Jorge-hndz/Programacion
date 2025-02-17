print("Introduce 3 numeros y te dire el mayor y el menor: ")
num1 = input()
num2 = input()
num3 = input()

if num1 > num2 and num1 > num3:
    print("El numero mayor es:", num1)
elif num2 > num1 and num2 > num3:
    print("El numero mayor es:", num2)
elif num3 > num1 and num3 > num2:
    print("El numero mayor es:", num3)

if num1 < num2 and num1 < num3:
    print("El numero menor es:", num1)
elif num2 < num1 and num2 < num3:
    print("El numero menor es:", num2)
elif num3 < num1 and num3 < num2:
    print("El numero mayor es:", num3)