num = float(input("Introduce una nota numerica y te dire calificación: "))
if num >= 0 and num < 5:
    print(f"La nota {num} es insuficiente")
elif num >= 5 and num < 7:
    print(f"La nota {num} es suficiente")
elif num >= 7 and num < 10:
    print(f"La nota {num} es notable")
elif num == 10:
    print(f"La nota {num} es sobresaliente")
else:
    print(f"La nota {num} no es valida")
