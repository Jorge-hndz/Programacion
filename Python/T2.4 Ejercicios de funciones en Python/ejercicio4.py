def calcular_media(Array):
    return sum(Array) / len(Array)

def calcular_varianza(Array, media):
    return sum((x - media) ** 2 for x in Array) / len(Array)

def calcular_desviacion_tipica(varianza):
    return varianza ** 0.5

def obtener_numeros():
    Array = []
    while True:
        num = int(input("Introduce numeros (0 para terminar): "))
        if num == 0:
            break
        Array.append(num)
    return Array

# Obtener los números
Array = obtener_numeros()

# Calcular la media, varianza y desviación típica
if len(Array) > 0:
    media = calcular_media(Array)
    varianza = calcular_varianza(Array, media)
    desviacion = calcular_desviacion_tipica(varianza)

    print(f"La media es :{media}")
    print(f"La varianza es :{varianza}")
    print(f"La desviacion tipica es :{desviacion}")
else:
    print("No se introdujeron números.")
