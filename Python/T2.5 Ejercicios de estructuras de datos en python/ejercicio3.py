lista = [47, 64, 69, 37, 76, 83, 95, 97]
diccionario = {'Antonio': 47, 'Manuel': 69, 'Ana': 76, 'Aurora': 97}

for elemento in lista[:]:
    if elemento not in diccionario.values():
        lista.remove(elemento)

print(lista)