print("A continuacion vas a introducir un precio y un descuento y te dire el precio final")
precio = float(input("Introduce el precio en euros: "))
descuento = float(input("Introduce el descuento en %: "))

descuento = descuento / 100
preciodescuento = precio * descuento
final = precio - preciodescuento
print(f"El precio final del producto es {final}")