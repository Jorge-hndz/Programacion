peso = float(input("Introduce tu peso es kilos utilizando un . como separador: "))
altura = float(input("Introduce tu altura en metros utilizando un . como separador: "))

imc = peso / (altura ** 2)
print(f"Tu IMC es {imc}")