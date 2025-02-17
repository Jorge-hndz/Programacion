Array1 = []
Array3 = []
num = 1

while num != 0:
        num = int(input("Introduce numeros para la primera lista (0 para finalizar):"))
        Array1.append(num)


for i in range(0, len(Array1)-1, 2):
    Array3.append(Array1[i])

Array2 = []
print("-----------------------------------------------")
num = 1
while num != 0:
        num = int(input("Introduce numeros para la segunda lista (0 para finalizar):"))
        Array2.append(num)

for i in range(1, len(Array2)-1, 2):
    Array3.append(Array2[i])

print(Array3)