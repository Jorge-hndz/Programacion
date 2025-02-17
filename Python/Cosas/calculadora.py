num1 = int(input("Introduce el primer numero: "))
operando = input("Introduce el operando(+, -, *, /): ")
num2 = int(input("Introduce el segundo numero: "))

if operando == "+":
    total = num1 + num2
    print(f"El resultado de {num1} + {num2} = {total}")
elif operando == "-":
    total = num1 - num2
    print(f"El resultado de {num1} - {num2} = {total}")
elif operando == "*":
    total = num1 * num2
    print(f"El resultado de {num1} * {num2} = {total}")
elif operando == "/":
    total = num1 / num2
    print(f"El resultado de {num1} / {num2} = {total}")

