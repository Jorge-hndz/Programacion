num_prod = int(input("Introduce el numero de productos: "))
def factura(precio, iva=21):
    return precio + precio * iva / 100


lista=[num_prod]

for i in range(num_prod):
    precio_prod = int(input("Introduzca el importe del producto : "))
    iva_prod = int(input("Introduzca el IVA a aplicar al producto: "))
    total = factura(precio_prod, iva_prod)
    total = lista[i]