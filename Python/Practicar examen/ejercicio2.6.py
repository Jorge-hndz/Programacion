num = int(input("Introduce un año y te dire si es bisiesto o no: "))

if num % 4 == 0:
    print(f"El año {num} es bisiesto")
else:
    print(f"El año {num} no es bisiesto")