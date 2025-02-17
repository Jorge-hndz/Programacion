num = int(input("Introduce el numero de un mes y te dire los dias que tiene: "))

if num == 1:
    print(f"El mes numero {num} es Enero y tiene 31 dias.")
elif num == 2:
    print(f"El mes numero {num} es Febrero y tiene 28 dias y en caso de ser bisiesto 29.")
elif num == 3:
    print(f"El mes numero {num} es Marzo y tiene 31 dias.")
elif num == 4:
    print(f"El mes numero {num} es Abril y tiene 30 dias.")
elif num == 5:
    print(f"El mes numero {num} es Mayo y tiene 31 dias.")
elif num == 6:
    print(f"El mes numero {num} es Junio y tiene 30 dias.")
elif num == 7:
    print(f"El mes numero {num} es Julio y tiene 31 dias.")
elif num == 8:
    print(f"El mes numero {num} es Agosto y tiene 31 dias.")
elif num == 9:
    print(f"El mes numero {num} es Septiembre y tiene 30 dias.")
elif num == 10:
    print(f"El mes numero {num} es Octubre y tiene 31 dias.")
elif num == 11:
    print(f"El mes numero {num} es Noviembre y tiene 30 dias.")
elif num == 12:
    print(f"El mes numero {num} es Diciembre y tiene 31 dias.")
else:
    print(f"El numero {num} no pertenece a ningun mes.")