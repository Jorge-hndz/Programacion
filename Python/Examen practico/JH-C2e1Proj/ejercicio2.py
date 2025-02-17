lista = []

palabra = str(input("Introduce una palabra y te dire el numero que tiene de cada vocal : "))
lista.append(palabra)

a = palabra.count("a")
e = palabra.count("e")
i = palabra.count("i")
o = palabra.count("o")
u = palabra.count("u")

if a >= 1: 
    print(f"La palabra {palabra} tiene {a} a")
if e >= 1:
    print(f"La palabra {palabra} tiene {e} e")
if i >= 1:
    print(f"La palabra {palabra} tiene {i} i")
if o >= 1:
    print(f"La palabra {palabra} tiene {o} o")
if u >= 1:
    print(f"La palabra {palabra} tiene {u} u")

