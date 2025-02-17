Array1 = []
Array2 = []
Array3 = []
Array4 = []

print("A continuacion vas a introducir 9 numeros")
for i in range(0, 9):
    num = int(input(f"Introduce numeros: "))
    Array1.append(num)

for j in range(0, 3):
    Array2.append(Array1[j])
for k in range(3, 6):
    Array3.append(Array1[k])
for l in range(6, 9):
    Array4.append(Array1[l])

print("Orden normal")
print(Array2)
print(Array3)
print(Array4)
print("orden invertido")
print(Array2[::-1])
print(Array3[::-1])
print(Array4[::-1])