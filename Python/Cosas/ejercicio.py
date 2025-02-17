def factura(precio, iva=21):
    return precio + precio * iva / 100

precio_prod = int(input("Introduzca el importe del producto: "))
iva_prod = int(input("Introduzca el IVA a aplicar al producto: "))

total = factura(precio_prod, iva_prod)
print(f"El importe de la factura con el IVA introducido es : {total}")

total = factura(precio_prod)
print(f"El importe de la factura con el IVA por defecto es : {total}")