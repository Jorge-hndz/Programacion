num = int(input("Introduce un numero mayor que 0 y te dare su tabla de multiplicar: "))

for i in range(1,11):
    total = i * num
    print(f"{num} * {i} = {total}")