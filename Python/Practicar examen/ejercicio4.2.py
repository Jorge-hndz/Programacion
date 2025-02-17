def funcion_con_iva(precio, iva):
    iva = float(iva)
    precio_iva = precio * iva / 100
    total = precio + precio_iva
    print(f"El total de la factura con el {iva}% de iva aplicado es de {total} euros.")

def funcion_sin_iva(precio):
    precio_iva = precio * 21 / 100
    total = precio + precio_iva
    print(f"El total de la factura con el 21% de iva aplicado es de {total} euros.")

precio = float(input("Introduce el precio de la factura sin iva: "))
iva = input("Introduce el iva a aplicar(Saltar si es el 21%): ")

if iva == "":
    funcion_sin_iva(precio)
else:
    funcion_con_iva(precio, iva)
