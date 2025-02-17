num = int(input("Introduce el numero de secuencias que quieres que muestre de la secuencia Fibonacci: "))
i = 0
num1 = 0
total = 0
num2 = 1
print("0")
print("1")
for i in range(i+1,num-1):
    total = num1 + num2
    num1 = num2
    num2 = total
    print(total)