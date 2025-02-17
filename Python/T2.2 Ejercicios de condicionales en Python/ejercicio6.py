año = int(input("introduce el año y te dire si es bisiesto o no: "))

if año % 4 == 0:
    print(f"El año {año} es bisiesto")
else:
    print(f"El año {año} no es bisiesto")