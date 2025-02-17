array = []
num = 1

def introduccir_num(num):
    while num != 0:
        num = int(input("Introduce numeros: "))
        if num != 0:
            array.append(num)
        else:
            continue

def cuadrados(array):    
    for i in range(len(array)):
        array[i] = array[i] ** 2

introduccir_num(num)
cuadrados(array)
print(array)
