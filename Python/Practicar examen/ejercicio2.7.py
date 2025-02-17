nota = float(input("Introduce una nota numerica y te dire la calificacion: "))

if nota >= 0 and nota < 5:
    print(f"La nota {nota} es insuficiente")
elif nota >= 5 and nota < 7:
    print(f"La nota {nota} es suficiente")
elif nota >= 7 and nota < 10:
    print(f"La nota {nota} es notable")
elif nota == 10:
    print(f"La nota {nota} es sobresaliente")