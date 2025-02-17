num = int(input("Introduce un entero: "))

if num > 1:
    for i in range(1, num+1):
        total = i**3
        print(f"{i} elevado a 3 = {total}")

    