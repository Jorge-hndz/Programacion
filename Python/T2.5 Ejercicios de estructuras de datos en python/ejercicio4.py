lista = [87, 94, 45, 41, 65, 94, 41, 99, 94]

lista_unica = []
for elemento in lista:
    if lista.count(elemento) == 1 and elemento not in lista_unica:
        lista_unica.append(elemento)

tupla = tuple(lista_unica)
elemento_menor = min(lista_unica)
elemento_mayor = max(lista_unica)

print("Elementos únicos:", lista_unica)
print("Tupla:", tupla)
print("Menor:", elemento_menor)
print("Mayor:", elemento_mayor)
