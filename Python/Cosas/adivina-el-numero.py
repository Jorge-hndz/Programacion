resultado = 33
num = int(input("Adivina el numero entre el 1 y el 100: ")) 

while num != resultado:
    if num > resultado:
        print("El numero es mas pequeño")
    elif num < resultado:
        print("El numero es mas grande")

    num = int(input("Escribe otro numero: "))

print("Felicidades adivinaste el numero")