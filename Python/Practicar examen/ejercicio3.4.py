num = int(input("Introduce un numero y te mostrare su tabla de multiplicar: "))

for i in range(1, 11):
    total = i * num
    print(f"{i} * {num} = {total}")