precio = float(input("Introduce un precio: "))
descuento = float(input("Introduce un descuento a aplicar: "))

precio_descuento = precio * descuento / 100
total = precio - precio_descuento
print(f"El precio final es {total}")