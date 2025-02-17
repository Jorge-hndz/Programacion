print("A continuacion vas a introducir 2 numeros enteros y una operacion y yo te dare el resultado")
num1 = int(input("Introduce el primer numero: "))
operando = input("Introduce un operando( + , - , * , / ): ")
num2 = int(input("Introduce el segundo numero: "))

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
else:
    print("El operando no es valido")
