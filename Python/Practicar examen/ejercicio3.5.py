num1 = int(input("Introduce un primer numero: "))
num2= int(input("Introduce un segundo numero: "))

if num1 != num2 or num2 > num1:
    for j in range(num1, num2 +1):
        print("--------")
        for i in range(1, 11):
            total = i * j
            print(f"{i} * {j} = {total}")
else:
    print("Imposible realizar la operacion con los datos introducidos")