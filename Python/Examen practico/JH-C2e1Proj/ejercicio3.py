num1 = int(input("Introduce el primer numero: "))
num2 = int(input("Introduce el segundo numero: "))

for j in range(num1, num2 + 1):
    print(f"La tabla de multiplicar del {j}, desde el 10 hasta el 1, es:")
    print("----------------------------------------------------------")
    for i in range(10, 0, -1):
        total = i * j
        print(f"{j} x {i} = {total}")