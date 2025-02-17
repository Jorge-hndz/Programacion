print("Introduce a continuacion dos numeros y te dire todos los multiplos de 3 que hay entre esos dos numeros: ")
num1 = int(input("Introduce el primer numero: "))
num2 = int(input("Introduce el segundo numero: "))

if num1 < num2:
    for i in range(num1, num2 + 1):
        if i %3 == 0 and i != 0:
            print(i)
else:
    print("El primer numero debe ser menor que el segundo")