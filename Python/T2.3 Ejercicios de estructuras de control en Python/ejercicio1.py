num = int(input("Dime un numero entero positivo mayor que 1: "))

if num < 1:
    print("El numero introducido no cumple los requisitos")
else:
    print(f"Los numeros desde el 1 hasta {num} son: ")
    for i in range(1,num+1):
        print(i)
