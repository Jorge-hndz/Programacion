num = int(input("Introduce un numero: "))

print(f"Los pares hasta {num}: ")
for i in range (0, num + 1, 2):
    print(i)
print("-----------------")
print(f"Los impares hasta {num}: ")
for i in range (1, num + 1, 2):
    print(i)