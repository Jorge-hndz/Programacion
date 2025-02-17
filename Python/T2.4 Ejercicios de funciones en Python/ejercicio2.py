precio = float(input("Introduce a continuacion el total de la factura sin iva: "))
porcentaje = input("Introduce el iva que desea aplicar(si no introduce nada se aplicara el 21%): ")

def funcion1(precio, porcentaje):
    precio_iva = porcentaje * precio // 100
    total = precio + precio_iva
    print(total)

def funcion2(precio):
    precio_iva = 21 * precio // 100
    total = precio + precio_iva
    print(total)

if porcentaje == "":
    funcion2(precio)
else:
    porcentaje = float(porcentaje)
    funcion1(precio, porcentaje)