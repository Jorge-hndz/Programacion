def area(radio):
    total_area = 3.14 * (radio ** 2)
    print(f"El area del circulo es {total_area}")

def volumen(radio, altura):
    total_vol = 3.14 * altura * (radio ** 2)
    print(f"El volumen del cilindro es {total_vol}")

print("Vamos a calcular el area de un circulo")
radio = float(input("Introduce el radio del circulo: "))
area(radio)

print("Ahora vamos a calcular el volumen de un cilindro")
radio = float(input("Introduce el radio del cilindro: "))
altura = float(input("Introduce la altura del cilindro: "))
volumen(radio, altura)