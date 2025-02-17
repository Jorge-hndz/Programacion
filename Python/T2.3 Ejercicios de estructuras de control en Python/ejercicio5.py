print("Introduce dos numeros y te mostrare todas las tablas de multiplicar entre esos dos numeros: ")
num1 = int(input())
num2 = int(input())

for x in range(num1, num2 + 1):
    print("------------")
    for i in range(1,11):
        total = i * x
        print(f"{x} * {i} = {total}")