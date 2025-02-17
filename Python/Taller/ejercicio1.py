print("A continuación vas a introducir 2 numeros y te dire los multiplos de 3 de esos dos numeros")
num1 = int(input("Introduce el primer numero: "))
num2 = int(input("Introduce el segundo numero: "))


i = num1 - 1
if num1 < num2:
    for i in range(i+1,num2):
        if i % 3 == 0:
            print(i)
else:
    print("El primer numero es mayor que el segundo")