num1 = float(input("Introduce el primer numero: "))
operando = input("Introduce la operacion que deseas hacer(+,-,*,/): ")
num2 = float(input("Introduce el segundo numero: "))

if operando == "+":
    total = num1 + num2
    print(f"{num1} + {num2} = {total}")
elif operando == "-":
    total = num1 - num2
    print(f"{num1} - {num2} = {total}")
elif operando == "*":
    total = num1 * num2
    print(f"{num1} * {num2} = {total}")
elif operando == "/":
    total = num1 / num2
    print(f"{num1} / {num2} = {total}")