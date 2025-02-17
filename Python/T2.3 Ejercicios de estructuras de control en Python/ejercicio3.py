num = int(input("Dime un numero entero positivo mayor que 1: "))
total1 = 0
total2 = 0

if num < 1:
    print("El numero introducido no cumple los requisitos")
else: 
    print(f"Los numeros pares desde el 0 hasta {num} son: ")
    for i in range(0,num+1):
        if i % 2 == 0:
            print(i)
            total1 = total1 + i
print(f"La suma de todos los pares es: {total1}")
   

print(f"Los numeros impares desde el 0 hasta {num} son: ")
for i in range(1,num+1):
    if i % 2 != 0:
        print(i)
        total2 = total2 + i
print(f"La suma de todos los impares es: {total2}")