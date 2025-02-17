import mates

print("Programa:")
print("a) Calculadora")
print("b) Tablas")
print("c) MCD")
print("d) MCM")
eleccion = input("Elige una de las siguientes opciones: ")

if eleccion == "a":
    print("A continuacion vas a introducir dos numeros y un operando y te dare el resultado")
    num1 = int(input("Introduce el primer numero:"))
    operando = input("Introduce un operando:")
    num2 = int(input("Introduce el segunfo numero:"))

    if operando == "+":
        total = mates.suma(num1, num2)
        print("El resultado es:", total)
    elif operando == "-":
        total = mates.resta(num1, num2)
        print("El resultado es:", total)
    elif operando == "*":
        total = mates.multip(num1, num2)
        print("El resultado es:", total)
    elif operando == "/":
        total = mates.division(num1, num2)
        print("El resultado es:", total)

if eleccion == "b":
    