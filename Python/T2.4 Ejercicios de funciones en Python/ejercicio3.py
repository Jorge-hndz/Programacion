import math

def area_circulo(radio):
    return math.pi * radio ** 2

def volumen_cilindro(radio, altura):
    return area_circulo(radio) * altura

radio = 5
altura = 10
print("Área del círculo:", area_circulo(radio))
print("Volumen del cilindro:", volumen_cilindro(radio, altura))
